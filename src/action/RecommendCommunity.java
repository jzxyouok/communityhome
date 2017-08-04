package action;

import dao.implement.Mysql;
import entity.Community;
import entity.User;
import util.GetCommunity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by 黄宇航 on 2017/8/3 14:12
 * 推荐社团
 */
public class RecommendCommunity extends GetCommunity{
    private User user = null;

    public RecommendCommunity(User user){
        this.user = user;
        con = Mysql.getCon();
    }

    public List<Community> getCommunities()
    {
        keywords = getHobbies();

        if (keywords == null){
            Mysql.closeCon();
            return null;
        }

        dealString();
        Set<Integer> idset = makeCommunityIdSet();

        return getCommunities(idset);
    }

    private String[] getHobbies()
    {
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            statement = con.prepareStatement("select * from hobby_user where user_id = " + user.getID());
            rs = statement.executeQuery();

            while (rs.next()){
                return rs.getString("hobby").split(" ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return null;
    }


    public static void main(String args[]){
        /*User u = new User();
        u.setID(1001);

        RecommendCommunity rc = new RecommendCommunity(u);
        List<Community> cl = rc.RecommendCommunities();

        for (Community temp:cl){
            System.out.println(temp.getName());
        }*/
    }
}

package action;

import dao.UserCommInforDao;
import util.Mysql;
import dao.implement.UserCommInforDaoIm;
import entity.Community;
import entity.User;
import util.GetCommunity;

import java.sql.*;
import java.util.*;

/**
 * Created by 黄宇航 on 2017/8/3 14:12
 * 推荐社团
 */
public class RecommendCommunity extends GetCommunity{
    private static final UserCommInforDao usercomdaoim = new UserCommInforDaoIm();
    private User user = null;
    private List<Community> joined = null;


    public RecommendCommunity(User user){
        this.user = user;
        joined = usercomdaoim.getAllJoinCommunities(user.getID());
        con = Mysql.getCon();
    }

    public List<Community> getCommunities()
    {
        {
            String hobbies[] = getHobbies();
            int len = hobbies.length;

            if (hobbies == null){
                return null;
            }

            keywords = new String[len + joined.size()];
            System.arraycopy(hobbies,0,keywords,0,len);

            for (Community temp:joined){
                keywords[len++] = temp.getType();
            }
        }

        /*keywords = getHobbies();

        if (keywords == null){
            return null;
        }*/

        dealString();
        Set<Integer> idset = makeCommunityIdSet();
        screen(idset);

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

    /*删除已加入的社团*/
    private void screen(Set<Integer> idset){
        int id;

        for (Community temp:joined){
            id = temp.getId();

            if (idset.contains(id)){
                idset.remove(id);
            }
        }
    }


    public static void main(String args[]){


        User u = new User();
        u.setID(1001);

        RecommendCommunity rc = new RecommendCommunity(u);
        List<Community> cl = rc.getCommunities();

        for (Community temp:cl){
            System.out.println(temp.getName());
        }
    }
}

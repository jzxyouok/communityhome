package util;

import entity.Community;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by 黄宇航 on 2017/8/3.
 * 处理关键字并返回社团
 */
abstract public class GetCommunity {
    protected static final SimpleDateFormat spf = new SimpleDateFormat("ddHHmmss");
    protected static final int MAX_NUM = 5;/*最大返回社团数量*/
    protected String keywords[];
    protected Connection con = null;

    abstract public List<Community> getCommunities();

    protected Set<Integer> makeCommunityIdSet(){
        Set<Integer> idset = new HashSet<>();

        for (int i = 0;i < keywords.length;i++){
            if (keywords[i].length() > 1){
                getCommunityId(idset,"select * from community where name like '%" + keywords[i] + "%'" +
                        " or introduction like '%" + keywords[i] + "%'" +
                        " or type like '%" + keywords[i] + "%'");
            }
        }

        return idset;
    }

    protected void getCommunityId(Set<Integer> idset,String sql){
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            statement = con.prepareStatement(sql);
            rs = statement.executeQuery();

            while (rs.next()){
                idset.add(rs.getInt("id"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected List<Community> getCommunities(Set<Integer> idset){
        List<Community> communities = new ArrayList<>();
        int i = 0;
        int len = idset.size();
        int temp[] = new int[len];
        Boolean isused[] = new Boolean[len];
        Random random = new Random(Integer.valueOf(spf.format(new Date())));

        for (int num:idset){
            temp[i++] = num;
        }

        Arrays.fill(isused,false);

        for (i = 0;i < len && i < MAX_NUM;i++){
            int num = random.nextInt(len);

            while (isused[num]){
                num = random.nextInt(len);
            }

            isused[num] = true;
            communities.add(mapping(temp[num]));
        }

        Mysql.closeCon();
        return communities;
    }

    protected Community mapping(int id){
        Community community = new Community();
        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            statement = con.prepareStatement("select * from community where id = " + id);
            rs = statement.executeQuery();

            while (rs.next()){
                community.setId(id);
                community.setName(rs.getString("name"));
                community.setEmail(rs.getString("Email"));
                community.setIntroduce(rs.getString("introduction"));
                community.setSchool(rs.getString("school"));
                community.setType(rs.getString("type"));
                community.setPicture(rs.getString("picture"));

                return community;
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

        System.out.println("assnmapping error");
        return null;
    }

    protected void dealString(){
        for (int i = 0;i < keywords.length;i++){
            if (keywords[i].length() > 1 && keywords[i].lastIndexOf("社") == (keywords[i].length() - 1)){
                keywords[i] = keywords[i].substring(0,keywords[i].length() - 1);
            }else if (keywords[i].length() > 2 && keywords[i].lastIndexOf("社团")  == (keywords[i].length() - 2) ||
                    keywords[i].lastIndexOf("协会") == (keywords[i].length() - 2)){
                keywords[i] = keywords[i].substring(0,keywords[i].length() - 2);
            } else if (keywords[i].length() > 3 &&keywords[i].lastIndexOf("俱乐部") == (keywords[i].length() - 3)){
                keywords[i] = keywords[i].substring(0,keywords[i].length() - 3);
            }
        }
    }
}

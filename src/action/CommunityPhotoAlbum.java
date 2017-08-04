package action;

import dao.implement.Mysql;
import entity.Community;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 黄宇航 on 2017/8/1 10:24
 */
public class CommunityPhotoAlbum {
    private Community community;
    private String sql;

    public CommunityPhotoAlbum(Community community){
        this.community = community;
        sql = "select * from communityphotoalbum where id = " + community.getId();
    }

    public String[] getPictures(){
        Connection con = Mysql.getCon();
        PreparedStatement statement = null;
        ResultSet rs = null;
        int i = 0;

        try {
            statement = con.prepareStatement(sql);
            rs = statement.executeQuery();
            rs.last();
            int ilen = rs.getRow();

            if (ilen == 0){
                return null;
            }

            String pictures[] = new String[ilen];
            rs.first();

            pictures[i++] = rs.getString("picture");

            while (rs.next()){
                pictures[i++] = rs.getString("picture");
            }

            if (ilen > 0){
                return pictures;
            }
        } catch (Exception e) {
            System.out.println("getPictures error");
        }finally {
            try {
                rs.close();
                statement.close();
                Mysql.closeCon();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return null;
    }
}

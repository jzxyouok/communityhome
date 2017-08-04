package action;

import util.Mysql;

import java.sql.*;

/**
 * Created by 黄宇航 on 2017/6/13.
 */
public class RegisterAction {
    private static final String table = "user";
    private static Connection con = null;

    private RegisterAction(){

    }


    public static boolean getAuthority(String username, String password) {
        if (con == null){
            con = Mysql.getCon();
        }

        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            statement = con.prepareStatement("select * from " + table + " where username='" + username + "'" + " and password='" + password + "'");
            rs = statement.executeQuery();

            return rs.next();
        } catch (Exception e) {
            System.out.println(e);
        }finally {
            try {
                rs.close();
                statement.close();
            } catch (SQLException e) {
            }
        }

        return false;
    }

    public static boolean isUserExist(String username) {
        try {
            return Mysql.isExit("select * from " + table + " where username='" + username + "'");
        } catch (Exception e) {
            System.out.println("isUserExist error");
        }

        return false;
    }

    public static boolean isEmailExist(String address) {
        try {
            return Mysql.isExit("select * from " + table + " where mailbox='" + address + "'");
        } catch (Exception e) {
            System.out.println("isEmailExist error");
        }

        return false;
    }

    public static boolean addUser(String id, String password, String address) {
        return Mysql.add("insert into "+table+"(username,password,address) values(?,?,?)",id,password,address);
    }

    public static int getId(String username){
        if (con == null){
            con = Mysql.getCon();
        }

        PreparedStatement statement = null;
        ResultSet rs = null;

        try {
            statement = con.prepareStatement("select * from user where username = '" + username + "'");
            rs = statement.executeQuery();

            while (rs.next()){
                return rs.getInt("id");
            }
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Getid error");
        }finally {
            try {
                rs.close();
                statement.close();
            } catch (SQLException e) {
            }
        }

        return  -1;
    }
}

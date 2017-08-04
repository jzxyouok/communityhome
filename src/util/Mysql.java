package util;

import javax.xml.transform.Result;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;

/**
 * Created by 黄宇航 on 2017/7/3.
 */
public class Mysql {
    private static String url = "jdbc:mysql://localhost:3306/community_home?useUnicode=true&characterEncoding=utf8";
    private static final String user = "root";
    private static final String sqlPassword = "123456";
    private static Connection con = null;

    private Mysql() {
    }

    private static void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, sqlPassword);

            if (con.isClosed()) {
                System.exit(1);
                System.out.println("database connet error");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getCon() {
        if (con == null) {
            connect();
        }

        return con;
    }

    public static boolean update(String sql){
        if (con == null){
            connect();
        }

        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(sql);

            statement.executeUpdate();
            statement.close();
            return true;
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Update error");
        }

        return false;
    }

    public static boolean add(String sql, Object... objects) {
        if (con == null) {
            connect();
        }

        PreparedStatement statement = null;
        try {
            statement = con.prepareStatement(sql);

            for (int i = 0; i < objects.length; i++) {
                statement.setObject(i + 1, objects[i]);
            }

            statement.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("Add error");
            }
        }

        return false;
    }

    public static boolean delete(String sql)
    {
        if (con == null)
        {
            connect();
        }

        try {
            PreparedStatement statement = con.prepareStatement(sql);

            statement.executeUpdate();
            return true;
        }catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Delete error");
        }

        return false;
    }

    public static boolean isExit(String sql, Object... objects) {
        if (con == null) {
            connect();
        }

        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = con.prepareStatement(sql);

            for (int i = 0; i < objects.length; i++) {
                statement.setObject(i + 1, objects[i]);
            }

            rs = statement.executeQuery();

            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                statement.close();
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("Isexist error");
            }
        }

        return false;
    }

    public static boolean isExist(String sql) {
        if (con == null) {
            connect();
        }

        PreparedStatement statement = null;
        ResultSet rs = null;
        try {
            statement = con.prepareStatement(sql);
            rs = statement.executeQuery(sql);

            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                statement.close();
            } catch (SQLException e) {
                System.out.println(e);
                System.out.println("Isexist2 error");
            }
        }

        return false;
    }

    public static void closeCon() {
        try {
            con.close();
            con = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String[] getInformation(int ilen, String sql) {
        if (con == null) {
            connect();
        }

        String stra[] = new String[ilen];

        try {
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                for (int i = 0; i < ilen; i++) {
                    stra[i] = rs.getString(i + 1);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stra;
    }

}

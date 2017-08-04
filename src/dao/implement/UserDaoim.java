package dao.implement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.UserDao;
import entity.User;
import util.DatabaseConn;
/**
 * Created by Lenovo on 2017/7/20.
 */
public class UserDaoim implements UserDao {
    @Override
    public int addUser(String username,String mailbox,String password ,String picture,String name,int studentid,String profession,String gender,String birth,String telnumber,String school)
    {
        Connection connection = DatabaseConn.getConnection();
        try {
            Statement statement = connection.createStatement();
            String sql ="insert  into User(username,mailbox,password,picture,name,studentid,profession,gender,birth,telnumber,school) values('"+username+"','"+mailbox+"','"+password+"','"+picture+"','"+name+"','"+studentid+"','"+profession+"','"+gender+"','"+birth+"','"+telnumber+"','"+school+"')";
            int result = statement.executeUpdate(sql);
            statement.close();
            return result;
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
  @Override
  public int deleUser(String username,String password){
      Connection connection = DatabaseConn.getConnection();
      try {
          Statement statement = connection.createStatement();
          String sql ="delete from User where username= '"+username+"'AND password='"+password+"'";
          int result = statement.executeUpdate(sql);
          statement.close();
          return result;
      } catch (SQLException e) {
          e.printStackTrace();
          return 0;
      }
  }
  @Override
  public int updateUser(String username,String password) {
      Connection connection = DatabaseConn.getConnection();
      try {
          Statement statement = connection.createStatement();
          String sql = "UPDATE User SET password ='" + password + "' AND username='" + username+"'WHERE username='"+username+"'";
          int result = statement.executeUpdate(sql);
          statement.close();
          return result;
      } catch (SQLException e) {
          e.printStackTrace();
          return 0;
      }
  }
      @Override
      public User queryUser(String username,String password){
          Connection connection = DatabaseConn.getConnection();
          User commDynamic = null;
          try {
              commDynamic = new User();
              Statement statement = connection.createStatement();
              String sql ="select * from User where username = '"+username+"'AND  password='"+password+"'";
              ResultSet set = statement.executeQuery(sql);
              //把数据库中的数据提取出来

              if(set.next())
              {

                  commDynamic.setID(set.getInt("id"));
                  commDynamic.setUsername(set.getString("username"));

                  commDynamic.setMailbox(set.getString("mailbox"));
                  commDynamic.setPassword(set.getString("password"));
                  commDynamic.setPicture(set.getString("picture"));
                  commDynamic.setName(set.getString("name"));
                  commDynamic.setStudentid(set.getInt("studentid"));
                  commDynamic.setProfession(set.getString("profession"));
                  commDynamic.setGender(set.getString("gender"));
                  commDynamic.setBirth(set.getString("birth"));
                  commDynamic.setTelnumber(set.getString("telnumber"));
                  commDynamic.setSchool(set.getString("school"));

              }
              else {commDynamic=null;}
              statement.close();
              set.close();
          } catch (SQLException e) {
              e.printStackTrace();
          }
          return commDynamic;
      }
   
  }



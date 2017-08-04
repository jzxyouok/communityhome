package dao;
import java.util.*;
import entity.User;
/**
 * Created by Lenovo on 2017/7/20.
 * 用于操作User表的接口
 * 实现类位于dao.implement中
 */
public interface UserDao {
    /**
     *
     * @param username 用户的昵称

     * @param mailbox 用户的邮箱
     * @param password 用户的密码
     * @param picture 头像地址
     * @param name 真实姓名
     * @param studentid 学号
     * @param profession 专业
     * @param gender 性别
     * @param birth 生日
     * @param telnumber 手机号
     * @param school 学校
     * @return 返回影响的行数
     */
    public int addUser(String username,String mailbox,String password ,String picture,String name,int studentid,String profession,String gender,String birth,String telnumber,String school);
    /**
     * @param  username 用户的昵称
     * @param password 用户的密码
     * @return 返回影响的行数
     */
    public int deleUser(String username,String password);
    /**
     * @param  username 用户的昵称
     * @param password 用户的密码传参传的是新密码
     * @return 返回影响的行数
     */
    public int updateUser(String username,String password);
    /**
     * @param  username 用户的昵称
     * @param password 用户的密码
     * @return User类的对象（如果NULL就是没有包括不限于密码输入错误）
     */
    public User queryUser(String username,String password);
}

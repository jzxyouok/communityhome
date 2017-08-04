package servlet;

/**
 * Created by 黄宇航 on 2017/7/30 20:56
 * 修改、完善资料
 */
import action.*;
import dao.implement.Mysql;
import entity.PasttimeJob;
import entity.User;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ModifyUserData", urlPatterns = "/ModifyUserData")
public class ModifyUserData extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        HttpSession session = request.getSession();
        PasttimeJob pasttimejob = (PasttimeJob)session.getAttribute("pasttimejob");
        User user = (User)session.getAttribute("user");
        String picture = request.getParameter("picture");
        String school = request.getParameter("school");
        int studentid = Integer.valueOf(request.getParameter("studentid"));
        String name = request.getParameter("name");
        String profession = request.getParameter("profession");
        String mailbox = request.getParameter("mailbox");
        String telnumber = request.getParameter("telnumber");
        String birth = request.getParameter("birth");
        String gender = request.getParameter("gender");
        String hobby = request.getParameter("hobby");/*爱好，用空格间隔*/
        String password = request.getParameter("password");
        StringBuilder sql = new StringBuilder("update user set ");
        boolean flag = false;

        if (picture != null){
            user.setPicture(picture);

            if(flag){
                sql.append(",");
            }

            sql.append("picture = '" + picture + "'");
            flag = true;
        }

        if (school != null){
            user.setSchool(school);

            if(flag){
                sql.append(",");
            }

            sql.append("school = '" + school + "'");
            flag = true;
        }

        if (studentid > 0){
            user.setStudentid(studentid);

            if(flag){
                sql.append(",");
            }

            sql.append("studentid = " + studentid);
            flag = true;
        }

        if (name != null){
            user.setName(name);

            if(flag){
                sql.append(",");
            }

            sql.append("name = '" + name + "'");
            flag = true;
        }

        if (profession != null){
            user.setProfession(profession);

            if(flag){
                sql.append(",");
            }

            sql.append("profession = '" + profession + "'");
            flag = true;
        }

        if (mailbox != null){
            user.setMailbox(mailbox);

            if(flag){
                sql.append(",");
            }

            sql.append("mailbox = ‘’" + mailbox + "'");
            flag = true;
        }

        if (telnumber != null){
            user.setTelnumber(telnumber);

            if(flag){
                sql.append(",");
            }

            sql.append("telnumber = '" + telnumber + "'");
            flag = true;
        }

        if (birth != null){
            user.setBirth(birth);

            if(flag){
                sql.append(",");
            }

            sql.append("birth = '" + birth + "'");
            flag = true;
        }

        if (gender != null){
            user.setGender(gender);

            if(flag){
                sql.append(",");
            }

            sql.append("gender = '" + gender + "'");
            flag = true;
        }

        if (password != null){
            user.setPassword(password);

            if(flag){
                sql.append(",");
            }

            sql.append("password = '" + password + "'");
            flag = true;
        }

        sql.append(" where username = '" + user.getUsername() + "'");

        if (Mysql.update(sql.toString())){
            if (hobby != null && hobby.length() > 0)
            {
                if (Mysql.isExist("select * from hobby_user where user_id =" + user.getID())){
                    Mysql.update("update hobby_user set hobby = " + hobby + " where user_id = " + user.getID());
                }
                else
                {
                    Mysql.add("insert into hobby_user(user_id,hobby) values(?,?)",user.getID(),hobby);
            }
            }
            /* 修改成功 */
        }else
        {
            Mysql.closeCon();
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doPost(request, response);
    }
}

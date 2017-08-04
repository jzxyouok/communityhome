package servlet;

/**
 * Created by 黄宇航 on 2017/8/23 16:18.
 * 注册
 */

import action.*;
import dao.UserDao;
import dao.implement.Mysql;
import dao.implement.*;
import entity.User;

import java.io.*;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.jws.soap.SOAPBinding;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "RegisterServlet", urlPatterns = "/RegisterServlet")
public class RegisterServlet  extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final UserDao userdaoim = new UserDaoim();

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        HttpSession session = request.getSession();
        User user = new User();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("email");
        String school = request.getParameter("university");
        String code = request.getParameter("code");
        String emailcode = request.getParameter("emailcode");
        PrintWriter writer = response.getWriter();

        if (RegisterAction.isUserExist(username)) {
            writer.write("user exist");
            return;
        } else if (RegisterAction.isEmailExist(address)) {
            writer.write("email exist");
            return;
        } else if (!code.equals(emailcode)){
            writer.write("code error");
            return;
        } else {
            user.setUsername(username);
            user.setPassword(password);
            user.setSchool(school);
            user.setPicture("img/49E89BEA3F1B3F1AC788F5F94C4A457F.png");/*默认头像*/
            user.setMailbox(address);
            userdaoim.addUser(username,address,password,"null.jpg","#",0,"#","#","#","#",school);
            user.setID(RegisterAction.getId(username));
            session.setAttribute("user",user);
            writer.write("done");
        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doPost(request, response);
    }
}

package servlet;

import dao.UserDao;
import dao.implement.UserDaoim;
import entity.User;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by Lenovo on 2017/7/26.
 */
@WebServlet(name = "LoginServlet" ,urlPatterns = "/LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * 使用ajax进行验证
	 */
	protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //获得用户名
        String username = request.getParameter("name");
        //获得密码
        String password = request.getParameter("password");
    	//在登陆界面传过来的验证码
    	String userCode = request.getParameter("code");
    	HttpSession session = request.getSession();
        //获得验证码，在codeServlet设置在code中
    	String code = (String) session.getAttribute("code");
    	
    	PrintWriter writer = response.getWriter();
    	if (code==null||userCode==null||username==null||password==null) {
			//说明发送的验证信息有误
			writer.write("fail");
			return;
		}
    	UserDao dao= new UserDaoim();
    	//查找用户
    	User user = dao.queryUser(username, password);
    	
    	if (!code.toLowerCase().equals(userCode.toLowerCase())) {
    		//验证码不通过
    		writer.write("codeFail");
    		return;
    	}
    	if (user==null) {
			writer.write("passwordFail");
			return;
		}
    	session.setAttribute("user", user);
    	writer.write("pass");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    	doPost(request, response);
    }
}

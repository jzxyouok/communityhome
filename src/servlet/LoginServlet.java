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
	 * ʹ��ajax������֤
	 */
	protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        //����û���
        String username = request.getParameter("name");
        //�������
        String password = request.getParameter("password");
    	//�ڵ�½���洫��������֤��
    	String userCode = request.getParameter("code");
    	HttpSession session = request.getSession();
        //�����֤�룬��codeServlet������code��
    	String code = (String) session.getAttribute("code");
    	
    	PrintWriter writer = response.getWriter();
    	if (code==null||userCode==null||username==null||password==null) {
			//˵�����͵���֤��Ϣ����
			writer.write("fail");
			return;
		}
    	UserDao dao= new UserDaoim();
    	//�����û�
    	User user = dao.queryUser(username, password);
    	
    	if (!code.toLowerCase().equals(userCode.toLowerCase())) {
    		//��֤�벻ͨ��
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

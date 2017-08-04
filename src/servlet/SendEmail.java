package servlet;

import action.Email;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by DELL on 2017/7/28.
 */
@WebServlet(name = "SendEmail" ,urlPatterns = "/servlet/SendEmail")
public class SendEmail extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding ("utf-8");
        response.setContentType ("text/html;charset=utf-8");

        HttpSession session = request.getSession (true);
        String code=session.getAttribute("code").toString ();

        try {
            String address= request.getParameter ("email");
            Email email = Email.getInstance ( );
            email.sendEmail (address,code);
        } catch (Exception e) {
            e.printStackTrace ( );
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost (request,response);
    }
}

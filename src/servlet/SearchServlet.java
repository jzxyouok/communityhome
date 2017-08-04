package servlet;

import action.SearchCommunity;
import entity.Community;
import util.GetCommunity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by 黄宇航 on 2017/8/3.
 * 搜索相关内容
 */
@WebServlet(name = "SearchServlet", urlPatterns = "/SearchServlet")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        HttpSession session = request.getSession();
        String searchtext = request.getParameter("searchtext");
        SearchCommunity searchcommunity = new SearchCommunity(searchtext);
        List<Community> communities = searchcommunity.getCommunities();

        if (communities != null && communities.size() > 0){
            session.setAttribute("serachresult",communities);
        }else{
            session.setAttribute("serachresult",null);
        }

        request.getRequestDispatcher("/搜索结果.jsp").forward(request, response);

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doPost(request, response);
    }
}

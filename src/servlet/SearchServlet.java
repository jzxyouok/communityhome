package servlet;

import action.SearchActivity;
import action.SearchCommunity;
import action.SearchPasttimeJob;
import entity.Activity;
import entity.Community;
import entity.PasttimeJob;
import util.GetCommunity;
import util.Mapping;

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
        GetCommunity searchcommunity = new SearchCommunity(searchtext);
        SearchActivity searchactivity = new SearchActivity(searchtext);
        SearchPasttimeJob searchpasttimejob = new SearchPasttimeJob(searchtext);
        List<Community> communities = searchcommunity.getCommunities();
        List<Activity> activities = searchactivity.getActivities();
        List<PasttimeJob> pasttimejobs = searchpasttimejob.getPasttimeJobs();

        if (communities != null && communities.size() > 0){
            session.setAttribute("communities",communities);
        }else{
            session.setAttribute("communities",null);
        }

        if (activities != null && activities.size() > 0){
            session.setAttribute("activities",activities);
        }else{
            session.setAttribute("activities",null);
        }

        if (pasttimejobs != null && pasttimejobs.size() > 0){
            session.setAttribute("pasttimejobs",pasttimejobs);
        }else{
            session.setAttribute("pasttimejobs",null);
        }

        request.getRequestDispatcher("/搜索结果.jsp").forward(request, response);

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doPost(request, response);
    }
}

package servlet;

import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CommunityDao;
import dao.implement.CommunityDaoIm;
import entity.Community;
import entity.User;
@WebServlet(name="HomePageServlet", urlPatterns={"","/index"})
public class HomePageServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	public HomePageServlet() {
		super();
	}
	public void destroy() {
		super.destroy();
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 *
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 *
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
/*		����
 	 	User usert = new User();
		usert.setPicture("community/������.jpg");
		session.setAttribute("user", usert);*/
		User user = (User) session.getAttribute("user");

		//检测是否登录
		if(user==null){
			request.setAttribute("buttonValue", "登录");

			request.setAttribute("userPicture", "img/49E89BEA3F1B3F1AC788F5F94C4A457F.png");

			request.setAttribute("buttonURL", "login1.jsp");
			request.setAttribute("welcome", "登录");
			request.setAttribute("loginURL", "LoginServlet");
			request.setAttribute("login", "登录");
			request.setAttribute("registerURL", "register1.jsp");
			request.setAttribute("register", "注册");
		}else {
			request.setAttribute("buttonValue", "我的社团");
			request.setAttribute("userPicture", user.getPicture());

			request.setAttribute("buttonURL", "#");
			request.setAttribute("welcome", user.getUsername()+" 你好，欢迎来到社团之家");
			request.setAttribute("loginURL", "#");
			request.setAttribute("login", user.getUsername());
			//注销
			request.setAttribute("registerURL", "WriteOff");
			request.setAttribute("register", "注销");
		}
		CommunityDao communityDao = new CommunityDaoIm();
		List<Community> communities = communityDao.queryAll();
		HashMap<Community, Integer> communitiesHashMap =new HashMap<Community, Integer>();
		for (Community community : communities) {
			communitiesHashMap.put(community, communityDao.queryAllUser(community.getId()).size());
		}
		//按人数排序
		communities.sort(new Comparator<Community>() {
			@Override
			public int compare(Community o1, Community o2) {
				return communitiesHashMap.get(o1).compareTo(communitiesHashMap.get(o2));
			}

		});
		if (communities.size()>5) {
			communities = communities.subList(0, 5);
		}
		for (int i = 1; i <= 5; i++) {
			if (i<=communities.size()) {
				request.setAttribute("recommend_"+i, communities.get(i-1));
			}
			else {
				//这是一所大学
				Community community = new Community();
				community.setIntroduce("这是一所大学");
				community.setPicture("community/东北大学.jpg");
				request.setAttribute("recommend_"+i, community);
			}
		}

		request.getRequestDispatcher("/homepage.jsp").forward(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {

	}

}

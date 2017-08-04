package servlet;

import dao.implement.CommunityDaoIm;
import entity.Community;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Lenovo on 2017/7/29.
 */
@WebServlet(name = "AddComServlet",urlPatterns = "/AddCom")
public class AddComServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB
    private static final Pattern p_file = Pattern.compile("\\..*");
    private static final Pattern p_icon = Pattern.compile("\\w{1,}.(?=jpg|bmp|png|jpeg).*");
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Community com=new Community();
        // String name = request.getParameter("UserName");
        // String school = request.getParameter("University");
        //  String email=request.getParameter("Email");
        // String introduce=request.getParameter("Introduce");
        //  String type =request.getParameter("Type");

/**
 * ������ϴ�ͷ��
 */    CommunityDaoIm cv=new CommunityDaoIm();
        DiskFileItemFactory factory = new DiskFileItemFactory();
        //HttpSession session = request.getSession();
        //session.setAttribute("community",cv.queryByName(name));
        //Community user = (Community) session.getAttribute("community");
        //String username = user.getName();

        factory.setSizeThreshold(MEMORY_THRESHOLD);
        factory.setSizeThreshold(1024 * 1024 * 3);
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));
        String nam="picture";
        ServletFileUpload upload = new ServletFileUpload(factory);
        String uploadPath = getServletContext().getRealPath("./") + nam; //+ File.separator;
        System.out.println("uploadPath:"+uploadPath);
        File uploadDir = new File(uploadPath);

        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        upload.setFileSizeMax(MAX_FILE_SIZE);
        upload.setSizeMax(MAX_REQUEST_SIZE);
        upload.setHeaderEncoding("UTF-8");

        try {
            List<FileItem> formitems = upload.parseRequest(request);
            System.out.println("list:"+formitems.size());
            if (formitems != null && formitems.size() > 0) {
                int i=1;

                for (FileItem item : formitems) {

                    if (!item.isFormField()) {
                        String filename = new File(item.getName()).getName();
                        System.out.println(filename);
                        System.out.println(item.getName());
                        Matcher m = p_file.matcher(filename);

                        if (!p_icon.matcher(filename).matches()) {
                            request.setAttribute("msg", "��ѡ��ͼƬ�ļ�");
                            request.getRequestDispatcher("/#.jsp").forward(request, response);
                            return;
                        }

                        if (!m.find()) {
                            request.setAttribute("msg", "���ʧ��");
                            request.getRequestDispatcher("/#.jsp").forward(request, response);
                            return;
                        }

                        String filepath = uploadPath + File.separator + filename;
                        com.setPicture(filepath);
                        File storefile = new File(filepath);

                        item.write(storefile);
                    }
                    switch(i){case 1: String name =item.getString();i++;System.out.println(name);com.setName(name);break;
                        case 2: String school =item.getString();i++;System.out.println(school);com.setSchool(school);break;
                        case 3:String email =item.getString();i++;System.out.println(email);  com.setEmail(email);break;
                        case 4:String introduce=item.getString();i++;System.out.println(introduce);com.setIntroduce(introduce);break;
                        case 5:String type=item.getString();i++;System.out.println(type); com.setType(type);break;
                        default: break;
                    }





                }
            }

        } catch (Exception ex) {
            System.out.println(ex);
            /* ���ʧ�ܴ���*/
        }

/**
 * ���������
 */




        try{
            CommunityDaoIm im=new CommunityDaoIm();
            if(im.addCommunity(com)==0)
                request.getRequestDispatcher("fail.jsp").forward(request,response);
            System.out.println("112221");
            request.getRequestDispatcher("index.jsp").forward(request,response);
            System.out.println("111121");
        }catch (Exception e){e.printStackTrace();}
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

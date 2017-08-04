package servlet;

import entity.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 黄宇航 on 2017/7/30 20:47
 * 上传头像
 */
@WebServlet(name = "UploadPicture", urlPatterns = "/UploadPicture")
public class UploadPicture extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final int MEMORY_THRESHOLD = 1024 * 1024 * 3;  // 3MB
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 40; // 40MB
    private static final int MAX_REQUEST_SIZE = 1024 * 1024 * 50; // 50MB
    private static final Pattern p_file = Pattern.compile("\\..*");
    private static final Pattern p_icon = Pattern.compile("\\w{1,}.(?=jpg|bmp|png|jpeg).*");
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        factory.setSizeThreshold(MEMORY_THRESHOLD);
        factory.setRepository(new File(System.getProperty("java.io.tmpdir")));

        /*HttpSession session = request.getSession();
        User user = (User)session.getAttribute("user");
        String username = user.getUsername();*/
        String username = "test";
        ServletFileUpload upload = new ServletFileUpload(factory);
        String uploadPath = getServletContext().getRealPath("./") + username + File.separator;
        File uploadDir = new File(uploadPath);

        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        upload.setFileSizeMax(MAX_FILE_SIZE);
        upload.setSizeMax(MAX_REQUEST_SIZE);
        upload.setHeaderEncoding("UTF-8");

        try {
            List<FileItem> formitems = upload.parseRequest(request);

            if (formitems != null && formitems.size() > 0) {
                for (FileItem item : formitems) {
                    if (!item.isFormField()) {
                        String filename = new File(item.getName()).getName();
                        Matcher m = p_file.matcher(filename);

                        if (!p_icon.matcher(filename).matches()) {
                            request.setAttribute("msg", "请选择图片文件");
                            request.getRequestDispatcher("/#.jsp").forward(request, response);
                            return;
                        }

                        if (!m.find()) {
                            request.setAttribute("msg", "添加失败");
                            request.getRequestDispatcher("/#.jsp").forward(request, response);
                            return;
                        }

                        String filepath = uploadPath + File.separator + username +".jpg";
                        File storefile = new File(filepath);

                        item.write(storefile);
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
            /* 添加失败处理*/
        }

        request.getRequestDispatcher("/.jsp").forward(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        this.doPost(request, response);
    }
}

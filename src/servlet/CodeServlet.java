package servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * Created by DELL on 2017/7/25.
 */
@WebServlet(name = "CodeServlet", urlPatterns = "/servlet/CodeServlet")
public class CodeServlet extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 直接返回一张图片
	 */
   public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType ("image/jpeg");
        response.setHeader ("Cache-Control", "no-cache");
        response.setHeader ("Pragma", "No-cache");
        response.setDateHeader ("Expires", 0L);
        int width = 80;
        int height = 35;
        BufferedImage image = new BufferedImage (width, height, 1);
        Graphics g = image.getGraphics ( );
        Random random = new Random ( );
        g.setColor (getRandColor (200, 250));
        g.fillRect (0, 0, width, height);
        g.setFont (new Font ("Arial", 0, 25));
        g.setColor (getRandColor (160, 200));
        for (int i = 0; i < 155; i++) {
            int x = random.nextInt (width + 100);
            int y = random.nextInt (height + 100);
            int xl = random.nextInt (10);
            int yl = random.nextInt (12);
            g.drawOval (x, y, x + xl, y + yl);
        }   
        String code = createCode();
        //设置全局的code,验证码
        request.getSession().setAttribute("code", code);
        String sRand = code;
        for (int i = 0; i < sRand.length ( ); i++) {
            String rand = sRand.substring (i, i + 1);
            g.setColor (new Color (20 + random.nextInt (110), 20 + random
                    .nextInt (110), 20 + random.nextInt (110)));
            g.drawString (rand, 14 * i + 5, 25);
        }
        g.dispose ( );    //閲婃斁g鎵�鍗犵敤鐨勭郴缁熻祫婧�
        ImageIO.write (image, "JPEG", response.getOutputStream ( ));
    }

    private Color getRandColor(int fc, int bc) {
        Random random = new Random ( );
        if (fc > 255)
            fc = 255;
        if (bc > 255)
            bc = 255;
        int r = fc + random.nextInt (bc - fc);
        int g = fc + random.nextInt (bc - fc);
        int b = fc + random.nextInt (bc - fc);
        return new Color (r, g, b);
    }
    private String createCode() {
       String code = "";
        int codeLength = 4;//验证码的长度
        //所有候选组成验证码的字符
        char[] selectChar = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C',
                'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c',
                'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < codeLength; i++) {
            double charIndex = Math.floor (Math.random ( ) * 60);
            code += selectChar[(int) charIndex];
        }
        return code;
    }
  
}


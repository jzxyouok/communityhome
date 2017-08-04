package action; /**
 * Created by 黄宇航 on 2017/6/14.
 */

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Date;
import java.util.Properties;
import java.util.Random;

public class Email {
    private static final char[] CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8',
            '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M',
            'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private static final String username = "kk29299@163.com";//发件人的邮箱地址
    private static final String password = "kk28288";//发件人的邮箱密码
    private static long count = 1;
    private static Properties props = null;
    private static Address sender = null;
    private static Email instance = null;
    private static Session mailConnection = null;

    private Email() {
    }

    public static Email getInstance() {
        if (instance == null) {
            instance = new Email ();
            connet();
        }

        return instance;
    }

    private static void connet() {
        props = new Properties();
        props.put("mail.smtp.host", "smtp.163.com");
        props.put("mail.smtp.auth", true);
        mailConnection = Session.getInstance(props, null);

        try {
            sender = new InternetAddress(username);
        } catch (AddressException e) {
            e.printStackTrace();
        }
    }

    public String sendEmail(String address,String code) {
        String text = new String("This is your code:" + code + " please input the code in the designated spot.Wish you a happy day");

        try {
            Message msg;
            msg = new MimeMessage(mailConnection);
            Address receiver = new InternetAddress(address);
            Multipart mtp = new MimeMultipart();
            BodyPart mdp = new MimeBodyPart();
            Transport trans = mailConnection.getTransport("smtp");

            msg.setFrom(sender);
            msg.setRecipient(Message.RecipientType.TO, receiver);
            msg.setSubject("【Website Code】请查看您的验证码" + text);


            mdp.setContent(text, "text/plain");
            mtp.addBodyPart(mdp);
            msg.setContent(mtp);
            msg.saveChanges();
            trans.connect("smtp.163.com", username, password);
            trans.sendMessage(msg, msg.getAllRecipients());
            trans.close();

            return code;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String randomCode() {
        StringBuilder stra = new StringBuilder("");
        Random random = new Random(new Date().getTime());

        for (int i = 0; i < 4; i++) {
            stra.append(CHARS[random.nextInt(34)]);
        }

        return stra.toString();
    }

}
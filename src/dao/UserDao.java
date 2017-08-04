package dao;
import java.util.*;
import entity.User;
/**
 * Created by Lenovo on 2017/7/20.
 * ���ڲ���User��Ľӿ�
 * ʵ����λ��dao.implement��
 */
public interface UserDao {
    /**
     *
     * @param username �û����ǳ�

     * @param mailbox �û�������
     * @param password �û�������
     * @param picture ͷ���ַ
     * @param name ��ʵ����
     * @param studentid ѧ��
     * @param profession רҵ
     * @param gender �Ա�
     * @param birth ����
     * @param telnumber �ֻ���
     * @param school ѧУ
     * @return ����Ӱ�������
     */
    public int addUser(String username,String mailbox,String password ,String picture,String name,int studentid,String profession,String gender,String birth,String telnumber,String school);
    /**
     * @param  username �û����ǳ�
     * @param password �û�������
     * @return ����Ӱ�������
     */
    public int deleUser(String username,String password);
    /**
     * @param  username �û����ǳ�
     * @param password �û������봫�δ�����������
     * @return ����Ӱ�������
     */
    public int updateUser(String username,String password);
    /**
     * @param  username �û����ǳ�
     * @param password �û�������
     * @return User��Ķ������NULL����û�а��������������������
     */
    public User queryUser(String username,String password);
}

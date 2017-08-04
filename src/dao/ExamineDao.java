package dao;

import java.util.List;

import entity.Community;
import entity.Examine;

/**
 * Created by Lenovo on 2017/7/21.
 * ���ڲ���Examine��Ľӿ�
 * ʵ����λ��dao.implement��
 */
public interface ExamineDao {
	/**
	 * �����������
	 * @param examine ����������ŵ���Ϣ
	 * @return Ӱ�������
	 */
    public int addExamine(Community community);
    /**
     *@param id �û�id
     *@return ����Ӱ�������
     */
    public int deleExamine(int id);

    /**
     * @param id �û�id
     * @return  �����Ķ���
     */
    public Examine queryById(int id);
    /**
     * ������˵�״̬
     * @param id ������id
     * @param status ��Ҫ���ĵ����״̬
     * @return Ӱ�������
     */
    int changeStatus(int id , int status);
    /**
     * 
     * @return ����������˵Ķ���
     */
    List<Examine> queryAllExaming();
    
}

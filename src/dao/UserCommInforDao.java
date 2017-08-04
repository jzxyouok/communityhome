package dao;

import java.util.List;

import entity.Activity;
import entity.Community;
/**
 * ���û����ŵ���Ϣ��ص����ݿ���ʽӿ�
 * ʵ����λ��dao.implement��
 * @author ��ү
 *
 */
public interface UserCommInforDao {
	/**
	 * ��ע����
	 * @param comID ����id
	 * @param uerID �û�id
	 * @return Ӱ�������
	 */
	int followComm(int comID,int uerID);
	/**
	 * ȡ����ע����
	 * @param comID ����id
	 * @param userID �û�id
	 * @return Ӱ�������
	 */
	int cancelFollowComm(int comID,int userID);
	/**
	 * ����û���ע����������
	 * @param userID ��Ա��Ϣ
	 * @return ���й�ע������
	 */
	List<Community> getAllFollowCommunities(int userID);
	/**
	 * ��Ա����
	 * @param comID ����id
	 * @param userID ��Աid
	 * @return Ӱ�������
	 */
	int joinCommunity(int comID,int userID);
	/**
	 * �˳�����
	 * @param comID ����id
	 * @param userID �û�id
	 * @return Ӱ�������
	 */
	int cancelJoinCommunity(int comID,int userID);
	/**
	 * ������еļ��������
	 * @param userID �û���id
	 * @return ���ص��û����������
	 */
	List<Community> getAllJoinCommunities(int userID);
	/**
	 * ��ע�
	 * @param activityID �id
	 * @param userID ��Աid
	 * @return Ӱ�������
	 */
	int followActivity(int activityID,int userID);
	/**
	 * ȡ����ע����
	 * @param activityID ����id
	 * @param userID �û���Ϣ
	 * @return Ӱ�������
	 */
	int cancelFollowActivity(int activityID,int userID);
	/**
	 * ����
	 * @param activityID �id
	 * @param userID ��Աid
	 * @return Ӱ�������
	 */
	int joinActivity(int activityID,int userID);
	/**
	 * ������еļ��������
	 * @param userID �û�id
	 * @return ���������
	 */
	List<Activity> getAllJoinActivities(int userID);
	/**
	 * ������еĹ�ע�Ļ
	 * @param userID �û�id
	 * @return ���й�ע�Ļ
	 */
	List<Activity> getAllFollowActivities(int userID);
	/**
	 * ��������
	 * @param commID ����id
	 * @param userID �û�id
	 * @return Ӱ�������
	 */
	int manageComm(int commID,int userID);
	/**
	 * ȡ����������
	 * @param comID ����id
	 * @param userID �û�id
	 * @return Ӱ�������
	 */
	int cancelManagerComm(int comID,int userID);
	/**
	 * ��ø��û��������������
	 * @param userID �û�id
	 * @return �û��������������
	 */
	List<Community> getAllManageCommunities(int userID);
	/**
	 * �����û�����Ȥ
	 * @param userID �û���id
	 * @param hobby �û�����Ȥ
	 * @return Ӱ�������
	 */
	int addHobby(int userID,String hobby);
	/**
	 * ɾ���û�����Ȥ
	 * @param userID �û�id
	 * @param hobby �û�����Ȥ
	 * @return Ӱ�������
	 */
	int deleteHobby(int userID,String hobby);
	/**
	 * �����û�����Ȥ
	 * @param userID �û�id
	 * @param oldHobby �ɵ���Ȥ
	 * @param newHobby �µ���Ȥ
	 * @return  Ӱ�������
	 */
	int changeHobby(int userID,String oldHobby,String newHobby);
	/**
	 * ��ѯ�û����е���Ȥ
	 * @param userID �û�id
	 * @return ��Ȥ
	 */
	List<String> queryAllHobby(int userID);
}

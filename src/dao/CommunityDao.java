package dao;

import java.util.List;

import entity.Community;
import entity.User;
/***
 * ����������
 * @author ��ү
 *
 */
public interface CommunityDao {
	/**
	 * @param community ��������
	 * @return Ӱ�������
	 */
	int addCommunity(Community community);
	/**
	 * 
	 * @param user ����user������
	 * @return	 Ӱ�������
	 */
	int addUser(int commID,int userID);
	/***
	 * 
	 * @param id ɾ������
	 * @return Ӱ�������
	 */
	int deleteCommunity(int id);
	/**
	 * 
	 * @param type ����
	 * @return �����͵�����
	 */
	List<Community> queryByType(String type);
	/**
	 * 
	 * @param communityID �ҵ������ŵ������û�
	 * @return ���е����ŵ��û�
	 */
	List<User> queryAllUser(int communityID);
	/**
	 * 
	 * @param name ���ŵ�����
	 * @return �����ֵ�����
	 */
	List<Community> queryByName(String name);
	/**
	 * 
	 * @return ���е�����
	 */
	List<Community> queryAll();
	/**
	 * 
	 * @param id ���ҵ�id
	 * @return �������
	 */
	Community queryById(int id);
} 

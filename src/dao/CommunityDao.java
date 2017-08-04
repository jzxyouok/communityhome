package dao;

import java.util.List;

import entity.Community;
import entity.User;
/***
 * 操作社团类
 * @author 发爷
 *
 */
public interface CommunityDao {
	/**
	 * @param community 增加社团
	 * @return 影响的行数
	 */
	int addCommunity(Community community);
	/**
	 * 
	 * @param user 增加user到社团
	 * @return	 影响的行数
	 */
	int addUser(int commID,int userID);
	/***
	 * 
	 * @param id 删除社团
	 * @return 影响的行数
	 */
	int deleteCommunity(int id);
	/**
	 * 
	 * @param type 类型
	 * @return 该类型的社团
	 */
	List<Community> queryByType(String type);
	/**
	 * 
	 * @param communityID 找到该社团的所有用户
	 * @return 所有的社团的用户
	 */
	List<User> queryAllUser(int communityID);
	/**
	 * 
	 * @param name 社团的名字
	 * @return 改名字的社团
	 */
	List<Community> queryByName(String name);
	/**
	 * 
	 * @return 所有的社团
	 */
	List<Community> queryAll();
	/**
	 * 
	 * @param id 查找的id
	 * @return 这个社团
	 */
	Community queryById(int id);
} 

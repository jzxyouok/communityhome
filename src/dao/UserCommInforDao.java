package dao;

import java.util.List;

import entity.Activity;
import entity.Community;
/**
 * 与用户社团的信息相关的数据库访问接口
 * 实现类位于dao.implement中
 * @author 发爷
 *
 */
public interface UserCommInforDao {
	/**
	 * 关注社团
	 * @param comID 社团id
	 * @param uerID 用户id
	 * @return 影响的行数
	 */
	int followComm(int comID,int uerID);
	/**
	 * 取消关注社团
	 * @param comID 社团id
	 * @param userID 用户id
	 * @return 影响的行数
	 */
	int cancelFollowComm(int comID,int userID);
	/**
	 * 获得用户关注的所有社团
	 * @param userID 人员信息
	 * @return 所有关注的社团
	 */
	List<Community> getAllFollowCommunities(int userID);
	/**
	 * 人员加入活动
	 * @param comID 社团id
	 * @param userID 人员id
	 * @return 影响的行数
	 */
	int joinCommunity(int comID,int userID);
	/**
	 * 退出社团
	 * @param comID 社团id
	 * @param userID 用户id
	 * @return 影响的行数
	 */
	int cancelJoinCommunity(int comID,int userID);
	/**
	 * 获得所有的加入的社团
	 * @param userID 用户的id
	 * @return 返回的用户加入的社团
	 */
	List<Community> getAllJoinCommunities(int userID);
	/**
	 * 关注活动
	 * @param activityID 活动id
	 * @param userID 人员id
	 * @return 影响的行数
	 */
	int followActivity(int activityID,int userID);
	/**
	 * 取消关注社团
	 * @param activityID 社团id
	 * @param userID 用户信息
	 * @return 影响的行数
	 */
	int cancelFollowActivity(int activityID,int userID);
	/**
	 * 加入活动
	 * @param activityID 活动id
	 * @param userID 人员id
	 * @return 影响的行数
	 */
	int joinActivity(int activityID,int userID);
	/**
	 * 获得所有的加入的社团
	 * @param userID 用户id
	 * @return 加入的社团
	 */
	List<Activity> getAllJoinActivities(int userID);
	/**
	 * 获得所有的关注的活动
	 * @param userID 用户id
	 * @return 所有关注的活动
	 */
	List<Activity> getAllFollowActivities(int userID);
	/**
	 * 管理社团
	 * @param commID 社团id
	 * @param userID 用户id
	 * @return 影响的行数
	 */
	int manageComm(int commID,int userID);
	/**
	 * 取消管理社团
	 * @param comID 社团id
	 * @param userID 用户id
	 * @return 影响的行数
	 */
	int cancelManagerComm(int comID,int userID);
	/**
	 * 获得该用户管理的所有社团
	 * @param userID 用户id
	 * @return 用户管理的所有社团
	 */
	List<Community> getAllManageCommunities(int userID);
	/**
	 * 增加用户的兴趣
	 * @param userID 用户的id
	 * @param hobby 用户的兴趣
	 * @return 影响的行数
	 */
	int addHobby(int userID,String hobby);
	/**
	 * 删除用户的兴趣
	 * @param userID 用户id
	 * @param hobby 用户的兴趣
	 * @return 影响的行数
	 */
	int deleteHobby(int userID,String hobby);
	/**
	 * 更改用户的兴趣
	 * @param userID 用户id
	 * @param oldHobby 旧的兴趣
	 * @param newHobby 新的兴趣
	 * @return  影响的行数
	 */
	int changeHobby(int userID,String oldHobby,String newHobby);
	/**
	 * 查询用户所有的兴趣
	 * @param userID 用户id
	 * @return 兴趣
	 */
	List<String> queryAllHobby(int userID);
}

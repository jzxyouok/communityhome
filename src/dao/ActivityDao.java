package dao;

import java.util.Date;
import java.util.List;

import entity.Activity;
import entity.User;
/**
 * 操作与活动相关的数据库
 * @author 发爷
 *
 */
public interface ActivityDao {
	/**
	 * 
	 * @param activity 插入的活动
	 * @return 返回影响的行数
	 */
	int addActivity(Activity activity);
	/**
	 * 
	 * @param id 删除的id
	 * @return 影响的行数
	 */
	int deleteActivity(int id);
	/**
	 * 时间作为限制，来查询，如查询2017/7/1 之后的所有的活动
	 * @param startTime	开始时间
	 * @param commID 社团id 约定如果id的值为-1则为查找所有社团的活动
	 * @return 满足条件的所有动态
	 */
	List<Activity> queryByTime(int commID,Date startTime);
	/**
	 * 
	 * @param commID 社团id 约定如果id的值为-1则为查找所有社团的活动
	 * @return 所有属于该社团的活动
	 */
	public List<Activity> queryAll(int commID);
	/**
	 * 
	 * @param theme 查找该类的主题
	 * @return 所有该主题的类
	 */
	public List<Activity> queryByTheme(String theme);
	/**
	 * 查找该活动的所有用户
	 * @param id 活动的id
	 * @return 所有的用户
	 */
	public List<User> queryAllUsers(int id);
	/**
	 * 
	 * @param id 活动的id
	 * @param user 加入活动的用户
	 * @return 影响的行数
	 */
	public int addUser(int id,int user_id);
	/**
	 * 
	 * @param id 活动的id
	 * @return 这个活动
	 */
	Activity queryById(int id);
}

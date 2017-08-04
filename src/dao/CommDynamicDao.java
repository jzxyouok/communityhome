package dao;

import java.util.Date;
import java.util.List;

import entity.CommDynamic;

/**
 * 用于操作CommDynamic的表，
 * 实现类位于dao.implement中，
 * @author 发爷
 *
 */
public interface CommDynamicDao {
	/**
	 * 
	 * @param commID	社团的id
	 * @param information	动态的信息
	 * @return 返回影响的行数
	 */
	public int addDynamic(int commID , String information);
	
	/**
	 * 
	 * @param id 该条动态的id
	 * @return 返回影响的行数
	 */
	public int deleDynamic(int id);
	/**
	 * 
	 * @param id 动态的id
	 * @return	动态类
	 */
	public CommDynamic queryById(int id);
	/**
	 * 时间作为限制，来查询，如查询2017/7/1 到2017/8/1的所有动态
	 * @param startTime	开始时间
	 * @param endTime 结束时间
	 * @param commID 社团id 约定如果id的值为-1则为查找所有社团的活动
	 * @return 满足条件的所有动态
	 */
	public List<CommDynamic> queryByTime(int commID,Date startTime,Date endTime);
	/**
	 * 
	 * @param commID 社团id 约定如果id的值为-1则为查找所有社团的动态
	 * @return 所有属于该社团的动态
	 */
	public List<CommDynamic> queryAll(int commID);	
}

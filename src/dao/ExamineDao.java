package dao;

import java.util.List;

import entity.Community;
import entity.Examine;

/**
 * Created by Lenovo on 2017/7/21.
 * 用于操作Examine表的接口
 * 实现类位于dao.implement中
 */
public interface ExamineDao {
	/**
	 * 增加审核社团
	 * @param examine 包含审核社团的信息
	 * @return 影响的行数
	 */
    public int addExamine(Community community);
    /**
     *@param id 用户id
     *@return 返回影响的行数
     */
    public int deleExamine(int id);

    /**
     * @param id 用户id
     * @return  审核类的对象
     */
    public Examine queryById(int id);
    /**
     * 更改审核的状态
     * @param id 审核类的id
     * @param status 需要更改的审核状态
     * @return 影响的行数
     */
    int changeStatus(int id , int status);
    /**
     * 
     * @return 所有正在审核的对象
     */
    List<Examine> queryAllExaming();
    
}

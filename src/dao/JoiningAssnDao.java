package dao;

import entity.JoiningAssn;

import java.util.Date;
import java.util.List;

/**
 * Created by 黄宇航 on 2017/8/3.
 */
public interface JoiningAssnDao {
    public boolean addJoiningAssn(JoiningAssn joiningassn);
    public boolean deleteJoiningAssn(int id,int whichid);
    public List<JoiningAssn> queryByTime(int assnid,Date starttime);
    public List<JoiningAssn> queryByTime(Date starttime);
    public List<JoiningAssn> queryByAssn(int assnid);
    public List<JoiningAssn> queryByUser(int userid);
    public List<JoiningAssn> queryAll();
}

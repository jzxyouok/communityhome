package dao;

import entity.JoiningAssn;
import entity.PasttimeJob;

import java.util.Date;
import java.util.List;

/**
 * Created by 黄宇航 on 2017/8/3.
 */
public interface PasttimeJobDao {
    public boolean addPasttimeJobDao(PasttimeJob pasttimejob);
    public boolean deletePasttimeJobDao(int jobid);
    public List<PasttimeJob> queryByTime(Date starttime);
    public List<PasttimeJob> queryByID(int jobid);
    public List<PasttimeJob> queryByGenre(String genre);
    public List<PasttimeJob> queryAll();
}

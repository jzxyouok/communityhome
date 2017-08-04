package dao.implement;

import dao.PasttimeJobDao;
import entity.PasttimeJob;
import util.Mapping;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by 黄宇航 on 2017/7/23.
 */
public class PasttimeJobDaoIm implements PasttimeJobDao {
    private static PasttimeJobDaoIm instance = null;

    private PasttimeJobDaoIm(){}

    public static PasttimeJobDaoIm getInstance(){
        if (instance == null){
            instance = new PasttimeJobDaoIm();
        }

        return instance;
    }

    @Override
    public boolean addPasttimeJobDao(PasttimeJob pasttimejob) {
        return Mysql.add("INSERT INTO pasttimejob(starttime,endtime,genre,contacts,summary) VALUES(?,?,?,?,?)",pasttimejob.getStarttime(),
                pasttimejob.getEndtime(),pasttimejob.getGenre(),pasttimejob.getContacts(),pasttimejob.getSummary());
    }

    @Override
    public boolean deletePasttimeJobDao(int jobid) {
        return Mysql.delete("delete from pasttimejob where jobid = " + jobid);
    }

    @Override
    public List<PasttimeJob> queryByTime(Date starttime) {
        return Mapping.mappingPasttimeJob("select * from joiningassn where starttime > '"+ starttime +"' ");
    }

    @Override
    public List<PasttimeJob> queryByID(int jobid) {
        return Mapping.mappingPasttimeJob("select * from joiningassn where jobid = " + jobid);
    }

    @Override
    public List<PasttimeJob> queryByGenre(String genre) {
        return Mapping.mappingPasttimeJob("select * from joiningassn where genre = " + genre);
    }

    @Override
    public List<PasttimeJob> queryAll() {
        return Mapping.mappingPasttimeJob("select * from joiningassn");
    }

}

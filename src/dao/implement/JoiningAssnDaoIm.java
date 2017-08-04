package dao.implement;

import dao.JoiningAssnDao;
import entity.JoiningAssn;
import util.Mapping;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 黄宇航 on 2017/8/3 15:10
 */
public class JoiningAssnDaoIm implements JoiningAssnDao{
    private static JoiningAssnDaoIm instance = null;

    private JoiningAssnDaoIm(){}

    public static JoiningAssnDaoIm getInstance(){
        if (instance == null){
            instance = new JoiningAssnDaoIm();
        }

        return instance;
    }

    @Override
    public boolean addJoiningAssn(JoiningAssn joiningassn) {
        return Mysql.add("INSERT INTO joiningassn(userid,assnid,endtime,status) VALUES(?,?,?,?)",joiningassn.getUserid(),
                joiningassn.getAssnid(),joiningassn.getEndtime(),joiningassn.getStatus());
    }

    @Override
    /*whichid 1.auditingid 2.userid 3.assnid*/
    public boolean deleteJoiningAssn(int id,int whichid) {
        String idname = whichid == 1?"auditingid":whichid == 2?"userid":"assnid";

        return Mysql.delete("delete from joiningassn where "+idname+" = "+id);
    }


    @Override
    public List<JoiningAssn> queryByTime(int assnid, Date starttime) {
        String sql ="select * from joiningassn where starttime > '"+ starttime +"' ";

        if (assnid > 0){
            sql += "and assnid = " + assnid;
        }

        return Mapping.mappingJoiningAssn(sql);
    }

    public List<JoiningAssn> queryByTime(Date starttime) {
        return Mapping.mappingJoiningAssn("select * from joiningassn where starttime > '"+ starttime +"' ");
    }

    @Override
    public List<JoiningAssn> queryByAssn(int assnid) {
        if (assnid > 0) {
            return Mapping.mappingJoiningAssn("select * from joiningassn where assnid = " + assnid);
        }else {
            return null;
        }
    }

    @Override
    public List<JoiningAssn> queryByUser(int userid) {
        if (userid > 0) {
            return Mapping.mappingJoiningAssn("select * from joiningassn where userid = " + userid);
        }else {
            return null;
        }
    }

    @Override
    public List<JoiningAssn> queryAll() {
        return Mapping.mappingJoiningAssn("select * from joiningassn");
    }

    public static void main(String args[]){
        JoiningAssn ja = new JoiningAssn();
        ja.setAssnid(1000);
        ja.setStatus(1);
        ja.setUserid(100);
        ja.setEndtime(Timestamp.valueOf("2017-6-2 10:00:00"));

        JoiningAssnDao a = new JoiningAssnDaoIm();
        System.out.println(a.addJoiningAssn(ja));
    }
}

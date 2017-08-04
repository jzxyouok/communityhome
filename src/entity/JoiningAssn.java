package entity;

import java.sql.Timestamp;
import java.util.Date;

/*
* Created by 黄宇航 on 2017/8/3 15:00
* 用于用户申请加入社团的审核类
*/
public class JoiningAssn {
    private int auditingid;
    private int userid;
    private int assnid;
    private Timestamp createtime;
    private Timestamp endtime;
    private int status; /*-2超时,-1拒绝,0未审核,1接受*/

    public int getAuditingid() {
        return auditingid;
    }

    public void setAuditingid(int auditingid) {
        this.auditingid = auditingid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getAssnid() {
        return assnid;
    }

    public void setAssnid(int assnid) {
        this.assnid = assnid;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String toString() {
        return auditingid + " " + userid + " " + assnid + " " + createtime + " " + endtime + " "
                + status;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        JoiningAssn other = (JoiningAssn) obj;

        if (assnid != other.assnid)
            return false;
        else if (auditingid != other.auditingid)
            return false;
        else if (userid != other.userid)
            return false;
        return true;
    }
}

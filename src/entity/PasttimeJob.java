package entity;

import java.sql.Timestamp;
import java.util.Date;

/*
 * Created by 黄宇航 on 2017/8/3 15:00
 * 兼职信息类
 * 内容为保证内存，放置本地文档，通过id形成特征值访问
 */
public class PasttimeJob {
    private int jobid;/*mysql自增*/
    private Timestamp createtime;
    private Timestamp starttime;
    private Timestamp endtime;
    private String genre;
    private String contacts;
    private String summary;
    private boolean status;/*该兼职是否有效,通过是否超过endtime判断*/

    public int getJobid() {
        return jobid;
    }

    public void setJobid(int jobid) {
        this.jobid = jobid;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getStarttime() {
        return starttime;
    }

    public void setStarttime(Timestamp starttime) {
        this.starttime = starttime;
    }

    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String toString() {
        return jobid + " " + createtime + " " + starttime + " " + endtime + " " + genre + " " + contacts + " "
                + summary + " " + status;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PasttimeJob other = (PasttimeJob) obj;

        if (jobid != other.jobid) {
            return false;
        }
        return true;
    }
}

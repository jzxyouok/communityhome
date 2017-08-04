package entity;

import java.sql.Timestamp;
import java.util.Date;

/*
 * Created by ��� on 2017/8/3 15:00
 * ��ְ��Ϣ��
 * ����Ϊ��֤�ڴ棬���ñ����ĵ���ͨ��id�γ�����ֵ����
 */
public class PasttimeJob {
    private int jobid;/*mysql����*/
    private Timestamp createtime;
    private Timestamp starttime;
    private Timestamp endtime;
    private String genre;
    private String contacts;
    private String summary;
    private boolean status;/*�ü�ְ�Ƿ���Ч,ͨ���Ƿ񳬹�endtime�ж�*/

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

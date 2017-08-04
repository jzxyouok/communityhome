package entity;

import java.util.Date;

/**
 * Created by lenovo on 2017/7/19.
 * 
 */
public class Activity {
    private int id;
    private int commID;  
    private Date createtime;
    private Date starttime;
    private Date endtime;
    private String content;
    private String phone;
    private String picture;
    private String theme;
    private String introduction;

	public int getCommID() {
		return commID;
	}

	public void setCommID(int commID) {
		this.commID = commID;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Activity other = (Activity) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", createtime=" + createtime + ", starttime=" + starttime + ", endtime=" + endtime
				+ ", content=" + content + ", phone=" + phone + ", picture=" + picture
				+ ", theme=" + theme + ", introduction=" + introduction + "]";
	}
}

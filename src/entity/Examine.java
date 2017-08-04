package entity;

import java.util.Date;

/**
 * Created by lenovo on 2017/7/19.
 * 瀹℃牳绫�
 */
public class Examine {
    private int id;
    private Community community;
    private Date createtime;
    private int status; /*-2瓒呮椂,-1鎷掔粷锛�0鏈鏍革紝1鎺ュ彈*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
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
		Examine other = (Examine) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Examine [id=" + id + ", community=" + community + ", createtime=" + createtime + ", status=" + status
				+ "]";
	}
   
}

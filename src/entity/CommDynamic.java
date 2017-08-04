package entity;

import java.util.Date;

public class CommDynamic {
	private int id;
	private String information;
	private Date createTime;
	private int CommID;
	public int getCommID() {
		return CommID;
	}
	public void setCommID(int commID) {
		CommID = commID;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
		CommDynamic other = (CommDynamic) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "CommDynamic [id=" + id + ", information=" + information + ", createTime=" + createTime + ", CommID="
				+ CommID + "]";
	}
	
}

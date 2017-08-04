package dao.implement;


import java.util.Date;
import java.util.List;

import dao.ActivityDao;
import entity.Activity;
import entity.User;
import util.Mapping;

public class ActivityDaoIm implements ActivityDao {

	@Override
	public int addActivity(Activity activity) {
		String sql ="insert into activity(commID,start_time,end_time,content,phone,picture,theme,introduction) "
				+ "values ("+activity.getCommID()+",'"+activity.getStarttime()+"','"+activity.getEndtime()+"','"+activity.getContent()+"','"+activity.getPhone()+"','"+activity.getPicture()+"','"+activity.getTheme()+"','"+activity.getIntroduction()+"')";
		return Mapping.executeUpdate(sql);
	}

	@Override
	public int deleteActivity(int id) {
		String sql ="delete from activity where id= "+id;
		return Mapping.executeUpdate(sql);
	}

	@Override
	public List<Activity> queryByTime(int commID, Date startTime) {
		String sql ="select * from activity where start_time > '"+startTime+"' ";
		if (commID!=-1) {
			sql+=" and commID = "+commID;
		}
			
		return Mapping.mappingActivities(sql);
	}

	@Override
	public List<Activity> queryAll(int commID) {
		String sql ="select * from activity  ";
		if (commID!=-1) {
			sql+=" where commID = "+commID;
		}	
		return Mapping.mappingActivities(sql);		
	}

	@Override
	public List<Activity> queryByTheme(String theme) {
		String sql ="select * from activity where theme LIKE BINARY '%"+theme+"%'";
		return Mapping.mappingActivities(sql);
	}
	@Override
	public List<User> queryAllUsers(int id) {

		String sql ="select * from activity_user as au left join User as u on u.ID=au.user_id where activity_id = "+id+"";

		return Mapping.mappingUsers(sql);
	}

	@Override
	public int addUser(int id, int user_id) {


		String sql ="insert into activity_user "
					+ "values ("+id+","+user_id+")";
		return Mapping.executeUpdate(sql);
	}

	@Override
	public Activity queryById(int id) {
		String sql="select * from activity where id = "+id;
		List<Activity> list = Mapping.mappingActivities(sql);
		return list.size()>0?list.get(0):null;
	}


}

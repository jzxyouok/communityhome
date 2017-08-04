package dao.implement;
import java.util.List;
import dao.UserCommInforDao;
import entity.Activity;
import entity.Community;
import util.Mapping;

public class UserCommInforDaoIm implements UserCommInforDao {

	@Override
	public int followComm(int comID, int uerID) {
		String sql = "insert into follow_comm_user values("+comID+","+uerID+")";
		return Mapping.executeUpdate(sql);
	}

	@Override
	public int cancelFollowComm(int comID, int userID) {
		String sql = "delete from follow_comm_user where Community_id ="+comID
				+" and user_id = "+userID;
		return Mapping.executeUpdate(sql);
	}

	@Override
	public List<Community> getAllFollowCommunities(int userID) {
		String sql = "select * from follow_comm_user as fcu left join community as c on c.id = fcu.Community_id where user_id = "+userID;
		return Mapping.mappingCommunities(sql);
	}

	@Override
	public int joinCommunity(int comID, int userID) {
		String sql = "insert into community_user values("+comID+","+userID+")";
		return Mapping.executeUpdate(sql);
	}

	@Override
	public int cancelJoinCommunity(int comID, int userID) {
		String  sql ="delete from community_user where Community_id = "+comID+" and user_id ="+userID;
		return Mapping.executeUpdate(sql);
	}

	@Override
	public List<Community> getAllJoinCommunities(int userID) {
		String sql = "select * from community_user as cu left join community as c on c.id = cu.Community_id where cu.user_id ="+userID;
		return Mapping.mappingCommunities(sql);
	}

	@Override
	public int followActivity(int activityID, int userID) {
		String sql = "insert into follow_ac_user values("+activityID+","+userID+") ";
		return Mapping.executeUpdate(sql);

	}

	@Override
	public int cancelFollowActivity(int activityID, int userID) {
		String sql = "delete from follow_ac_user where Activity_id = "
				+activityID+" and user_id ="+userID;
		return Mapping.executeUpdate(sql);
	}

	@Override
	public int joinActivity(int activityID, int userID) {
		String sql = "insert into activity_user values("+activityID+","+userID+")";
		return Mapping.executeUpdate(sql);
	}

	@Override
	public List<Activity> getAllJoinActivities(int userID) {
		String sql ="select * from activity_user as au left join activity as a on a.id = au.activity_id where user_id = "+userID;
		return Mapping.mappingActivities(sql);
	}

	@Override
	public List<Activity> getAllFollowActivities(int userID) {
		String sql = "select * from follow_ac_user as au left join activity as a on a.id = au.activity_id where user_id = "+userID;
		return Mapping.mappingActivities(sql);
	}

	@Override
	public int manageComm(int commID, int userID) {
		String sql = "insert into manager_comm_user values("+commID+","+userID+")";
		return Mapping.executeUpdate(sql);
	}

	@Override
	public int cancelManagerComm(int comID, int userID) {
		String sql = "delete from manager_comm_user  where Community_id = "
				+comID+" and user_id = "+userID;
		return Mapping.executeUpdate(sql);
	}

	@Override
	public List<Community> getAllManageCommunities(int userID) {
		String sql = "select * from manager_comm_user as mcu left join community as c on mcu.community_id = c.id where user_id ="+userID;
		return Mapping.mappingCommunities(sql);
	}

	@Override
	public int addHobby(int userID, String hobby) {
		String sql = "insert into hobby_user values("+userID+",'"+hobby+"')";
		return Mapping.executeUpdate(sql);
	}

	@Override
	public int deleteHobby(int userID, String hobby) {
		String sql = "delete from hobby_user where user_id = "
				+userID+" and hobby = '"+hobby+"'";
		return Mapping.executeUpdate(sql);
	}

	@Override
	public int changeHobby(int userID, String oldHobby, String newHobby) {
		String sql = "update hobby_user set hobby = '"+newHobby+"' where user_id = "
				+userID+" and hobby = '"+oldHobby+"'";
		return Mapping.executeUpdate(sql);
	}

	@Override
	public List<String> queryAllHobby(int userID) {
		String sql = "select * from hobby_user where user_id = "+userID;
		return Mapping.mappingHabby(sql);
	}
}

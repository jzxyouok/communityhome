package dao.implement;

import java.util.List;
import dao.CommunityDao;
import entity.Community;
import entity.User;
import util.Mapping;

public class CommunityDaoIm implements CommunityDao {

	@Override
	public int addCommunity(Community community) {

		String sql = "insert into community(name,Email,introduction,school,type,picture) values ('"+community.getName()+"','"+
				community.getEmail()+"','"+community.getIntroduce()+"','"+community.getSchool()
				+"','"+community.getType()+"','"+community.getPicture()+"')";
		return Mapping.executeUpdate(sql);
	}
	@Override
	public int addUser( int commID,int userID) {
		String sql ="insert into community_user "
				+ "values ("+commID+","+userID+")";
		return Mapping.executeUpdate(sql);
	}
	@Override
	public int deleteCommunity(int id) {
		String sql ="delete from  Community where id= "+id+"";
		return Mapping.executeUpdate(sql);
	}
	@Override
	public List<Community> queryByType(String type) {
		String sql ="select * from Community where type LIKE BINARY '%"+type+"%'";

		return Mapping.mappingCommunities(sql);
	}
	@Override
	public List<User> queryAllUser(int communityID) {

		String sql ="select * from community_user as au left join User as u on u.ID=au.user_id where community_id = "+communityID+"";

		return Mapping.mappingUsers(sql);
	}
	@Override
	public List<Community> queryByName(String name) {

		String sql ="select * from Community where name LIKE BINARY '%"+name+"%'";
		
		return Mapping.mappingCommunities(sql);
	}
	@Override
	public List<Community> queryAll() {

		String sql ="select * from Community ";
		return Mapping.mappingCommunities(sql);
	}
	@Override
	public Community queryById(int id) {
		String sql ="select * from Community where id = "+id;
		List<Community> communities = Mapping.mappingCommunities(sql);
		return communities.size()>0?communities.get(0):null;
	}
	
}

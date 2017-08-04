package dao.implement;
import java.util.Date;
import java.util.List;
import dao.CommDynamicDao;
import entity.CommDynamic;
import util.Mapping;

public class CommDynamicIm implements CommDynamicDao {

	@Override
	public int addDynamic(int commID, String information) {
		String sql ="insert into CommDynamic(information,community_id) values('"+information+"',"+commID+")";
		return Mapping.executeUpdate(sql);
	}

	@Override
	public int deleDynamic(int id) {
		String sql ="delete from CommDynamic where id= "+id+"";
		return Mapping.executeUpdate(sql);	
	}

	@Override
	public CommDynamic queryById(int id) {
		String sql ="select * from CommDynamic where id = "+id+"";
		List<CommDynamic> commDynamics =Mapping.mappingCommDynamics(sql);
		return commDynamics.size()>0?commDynamics.get(0):null;
	}

	@Override
	public List<CommDynamic> queryByTime(int commID, Date startTime, Date endTime) {	
		String sql ="select * from CommDynamic where  create_time < '"+endTime+"' and create_time > '"+startTime+"' ";
		if (commID!=-1) {
			sql+=" and community_id = "+commID;
		}

		return Mapping.mappingCommDynamics(sql);
	
	}

	@Override
	public List<CommDynamic> queryAll(int commID) {

		String sql ="select * from CommDynamic ";
		if (commID!=-1) {
			sql+=" where community_id = "+commID;
		}			

		return Mapping.mappingCommDynamics(sql);		
	}


}

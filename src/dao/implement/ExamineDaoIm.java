package dao.implement;

import java.util.List;

import dao.ExamineDao;
import entity.Community;
import entity.Examine;
import util.Mapping;

public class ExamineDaoIm implements ExamineDao {

	@Override
	public int addExamine(Community community) {
		String sql = "insert into examine(name,Email,introduction,school,type,picture) values ('"+community.getName()+"','"+
				community.getEmail()+"','"+community.getIntroduce()+"','"+community.getSchool()
				+"','"+community.getType()+"','"+community.getPicture()+"')";
		return Mapping.executeUpdate(sql);
	}

	@Override
	public int deleExamine(int id) {
		String sql ="delete from Examine where id= "+id+"";
		return Mapping.executeUpdate(sql);
	}

	@Override
	public Examine queryById(int id) {
		String sql ="select * from Examine where id = "+id+"";
		List<Examine> examines = Mapping.mappingExamine(sql);
	
		return examines.size()>0?examines.get(0):null;
	}

	@Override
	public int changeStatus(int id, int status) {
		String sql = "UPDATE Examine SET status =" + status + " where id=" + id;
		return Mapping.executeUpdate(sql);
	}

	@Override
	public List<Examine> queryAllExaming() {
		String sql ="select * from Examine where status = -2";
		return Mapping.mappingExamine(sql);
	}

}

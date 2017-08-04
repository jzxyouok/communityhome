package util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import dao.implement.Mysql;
import entity.*;

public class Mapping {
	/**
	 * ����ѯ���Ľ��ע�뵽Community��������
	 * @param sql ִ��sql�����
	 * @return ��ѯ�Ľ��
	 */
	public static List<Community> mappingCommunities(String sql){
		Connection connection = DatabaseConn.getConnection();
		ArrayList<Community> communities = null;
		try {
			communities = new ArrayList<>();
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while (set.next()) {
				Community community = new Community();
				community.setId(set.getInt("id"));
				community.setName(set.getString("name"));
				community.setEmail(set.getString("Email"));
				community.setIntroduce(set.getString("introduction"));
				community.setSchool(set.getString("school"));
				community.setType(set.getString("type"));
				community.setPicture(set.getString("picture"));
				communities.add(community);
			}	
			statement.close();
			set.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return communities;
	}
	/**
	 * ����ѯ��Ľ��ע�뵽activity��list��
	 * @param sql ִ�е�sql���
	 * @return activity��
	 */
	public static List<Activity> mappingActivities(String sql){
		Connection connection = DatabaseConn.getConnection();
		ArrayList<Activity> activities = null;
		try {
			activities = new ArrayList<>();
			Statement statement = connection.createStatement();			
			ResultSet set = statement.executeQuery(sql);
			while (set.next()) {
				Activity activity = new Activity();
				activity.setId(set.getInt("id"));
				activity.setCommID(set.getInt("commID"));
				activity.setCreatetime(set.getTimestamp("create_time"));
				activity.setStarttime(set.getTimestamp("start_time"));
				activity.setEndtime(set.getTimestamp("end_time"));
				activity.setContent(set.getString("content"));
				activity.setPhone(set.getString("phone"));
				activity.setPicture(set.getString("picture"));
				activity.setTheme(set.getString("theme"));
				activity.setIntroduction(set.getString("introduction"));
				activities.add(activity);
			}
			statement.close();
			set.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return activities;				
	}
	/**
	 * ����ѯ�Ľ��ע�뵽user��list��
	 * @param sql sql���
	 * @return user������
	 */
	public static List<User> mappingUsers(String sql){
		Connection connection = DatabaseConn.getConnection();
		ArrayList<User> users = null;
		try {
			users = new ArrayList<>();
			Statement statement = connection.createStatement();

			ResultSet set = statement.executeQuery(sql);
/*			id bigint NOT NULL AUTO_INCREMENT COMMENT '��̬��id',
			username varchar(16) NOT NULL COMMENT '�ǳ�',

			mailbox varchar(25) NOT NULL COMMENT '����',
			password varchar(16) NOT NULL COMMENT '����',
			picture varchar(25) NOT NULL COMMENT 'ͼƬ��ַ',
			name varchar(16) NOT NULL COMMENT '����',
			studentid int NOT NULL COMMENT 'ѧ��',
			profession varchar(25) NOT NULL COMMENT 'רҵ',
			telnumber varchar(25) NOT NULL COMMENT '�绰',
			birth varchar(25) NOT NULL COMMENT '����',
			gender varchar(25) NOT NULL COMMENT '�Ա�',
			school varchar(25) NOT NULL COMMENT 'ѧУ',*/
			while (set.next()) {
				User user = new User();

				user.setID(set.getInt("id"));
				user.setUsername(set.getString("username"));
				user.setMailbox(set.getString("mailbox"));
				user.setPassword(set.getString("password"));
				user.setPicture(set.getString("picture"));
				user.setName(set.getString("name"));
				user.setStudentid(set.getInt("studentid"));
				user.setProfession(set.getString("profession"));
				user.setTelnumber(set.getString("telnumber"));
				user.setBirth(set.getString("birth"));

				user.setSchool(set.getString("school"));


				users.add(user);
			}
			statement.close();
			set.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	/**
	 * ִ�����Ͳ�����
	 * @param sql sql�����
	 * @return Ӱ�������
	 */
	public static int executeUpdate(String sql){
		Connection connection = DatabaseConn.getConnection();
		try {
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate(sql);
			statement.close();
			return result;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	/**
	 * ����ѯ�Ľ��ע�뵽CommDynamic��������
	 * @param sql sql�����
	 * @return ���ض�̬������
	 */
	public static List<CommDynamic> mappingCommDynamics(String sql){
		Connection connection = DatabaseConn.getConnection();
		ArrayList<CommDynamic> list = null;
		try {
			list = new ArrayList<CommDynamic>();
			Statement statement = connection.createStatement();		
			ResultSet set = statement.executeQuery(sql);
			while (set.next()) {
				CommDynamic commDynamic = new CommDynamic();
				commDynamic.setId(set.getInt("id"));
				commDynamic.setCommID(set.getInt("community_id"));
				commDynamic.setCreateTime(set.getTimestamp("create_time"));
				commDynamic.setInformation(set.getString("information"));
				list.add(commDynamic);
			}
			statement.close();
			set.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;	
	}
	/**
	 * �����û����е�hobby
	 * @param sql ִ�е�sql���
	 * @return �����û����е�hobby
	 */
	public static List<String> mappingHabby(String sql){
		Connection connection = DatabaseConn.getConnection();
		ArrayList<String> list = null;
		try {
			list = new ArrayList<>();
			Statement statement = connection.createStatement();		
			ResultSet set = statement.executeQuery(sql);
			while (set.next()) {
				list.add(set.getString("hobby"));
			}
			statement.close();
			set.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return list;
	}
	public static List<Examine> mappingExamine(String sql){
		Connection connection = DatabaseConn.getConnection();
		ArrayList<Examine> examines = null;
		try {
			examines = new ArrayList<>();
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery(sql);
			while (set.next()) {
				Community community = new Community();
				Examine examine = new Examine();
				community.setName(set.getString("name"));
				community.setEmail(set.getString("Email"));
				community.setIntroduce(set.getString("introduction"));
				community.setSchool(set.getString("school"));
				community.setType(set.getString("type"));
				community.setPicture(set.getString("picture"));
				examine.setCommunity(community);
				examine.setId(set.getInt("id"));
				examine.setCreatetime(set.getTimestamp("create_time"));
				examine.setStatus(set.getInt("status"));
			
				examines.add(examine);
			}	
			statement.close();
			set.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return examines;
	}

	public static List<JoiningAssn> mappingJoiningAssn(String sql)
	{
		List<JoiningAssn> joiningassns = new ArrayList<>();
		Connection con = Mysql.getCon();
		boolean isempty = true;

		try {
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				isempty = false;
				JoiningAssn temp = new JoiningAssn();

				temp.setAssnid(rs.getInt("assnid"));
				temp.setAuditingid(rs.getInt("auditingid"));
				temp.setUserid(rs.getInt("userid"));
				temp.setStatus(rs.getInt("status"));
				temp.setCreatetime(rs.getTimestamp("createtime"));
				temp.setEndtime(rs.getTimestamp("endtime"));
				joiningassns.add(temp);
			}

			statement.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (isempty){
			return null;
		}

		return joiningassns;
	}

	public static List<PasttimeJob> mappingPasttimeJob(String sql){
		List<PasttimeJob> pasttimejobs = new ArrayList<>();
		Connection con = Mysql.getCon();
		boolean isempty = true;

		if (isempty){
			return null;
		}

		try {
			PreparedStatement statement = con.prepareStatement(sql);
			ResultSet rs = statement.executeQuery();

			while (rs.next()) {
				isempty = false;
				PasttimeJob temp = new PasttimeJob();

				temp.setJobid(rs.getInt("jobid"));
				temp.setCreatetime(rs.getTimestamp("createtime"));
				temp.setEndtime(rs.getTimestamp("endtime"));
				temp.setGenre(rs.getString("genre"));
				temp.setContacts(rs.getString("contacts"));
				temp.setSummary(rs.getString("summary"));
				temp.setWage(rs.getString("wage"));
				temp.setWorktime(rs.getString("worktime"));
				temp.setAddress(rs.getString("address"));
				temp.setStatus(rs.getInt("status") == 1?true:false);
				pasttimejobs.add(temp);
			}

			statement.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pasttimejobs;
	}

}

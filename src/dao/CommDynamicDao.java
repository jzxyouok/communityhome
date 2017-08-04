package dao;

import java.util.Date;
import java.util.List;

import entity.CommDynamic;

/**
 * ���ڲ���CommDynamic�ı�
 * ʵ����λ��dao.implement�У�
 * @author ��ү
 *
 */
public interface CommDynamicDao {
	/**
	 * 
	 * @param commID	���ŵ�id
	 * @param information	��̬����Ϣ
	 * @return ����Ӱ�������
	 */
	public int addDynamic(int commID , String information);
	
	/**
	 * 
	 * @param id ������̬��id
	 * @return ����Ӱ�������
	 */
	public int deleDynamic(int id);
	/**
	 * 
	 * @param id ��̬��id
	 * @return	��̬��
	 */
	public CommDynamic queryById(int id);
	/**
	 * ʱ����Ϊ���ƣ�����ѯ�����ѯ2017/7/1 ��2017/8/1�����ж�̬
	 * @param startTime	��ʼʱ��
	 * @param endTime ����ʱ��
	 * @param commID ����id Լ�����id��ֵΪ-1��Ϊ�����������ŵĻ
	 * @return �������������ж�̬
	 */
	public List<CommDynamic> queryByTime(int commID,Date startTime,Date endTime);
	/**
	 * 
	 * @param commID ����id Լ�����id��ֵΪ-1��Ϊ�����������ŵĶ�̬
	 * @return �������ڸ����ŵĶ�̬
	 */
	public List<CommDynamic> queryAll(int commID);	
}

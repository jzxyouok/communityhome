--���ڴ������ŵ���Ϣ
--2017/7/19

CREATE TABLE community(
id bigint NOT NULL AUTO_INCREMENT COMMENT '���ŵ�id',
name varchar(50) NOT NULL COMMENT '���ŵ�����',
Email varchar(50) NOT NULL COMMENT '���ŵ�email',
introduction varchar(200) NOT NULL COMMENT '���ŵļ��',
school varchar(50) NOT NULL COMMENT '���ŵ�ѧУ',
type varchar(50) NOT NULL COMMENT '���ŵ�����',
picture varchar(50) NOT NULL COMMENT '���ŵ�ͼƬ',
PRIMARY KEY (id),
key idx_type(type),
key idx_name(name),
key idx_school(school)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '���ű�';

--���ô�������ɾ������ʱҲ��������ص�����һ��ɾ��
CREATE TRIGGER delete_to_community_user after DELETE ON community FOR EACH ROW delete from community_user where community_id = OLD.id;
CREATE TRIGGER delete_to_activity after DELETE ON community FOR EACH ROW delete from activity where commID = OLD.id;
CREATE TRIGGER delete_to_commDynamic after DELETE ON community FOR EACH ROW delete from commDynamic where community_id = OLD.id;

--��������
insert into community(name,Email,introduction,school,type,picture)
values
('������','m15211122240@163.com','������','������ѧ','����','image/j.jpg'),
('��Э','m15211122240@163.com','����������','������ѧ','����','image/j.jpg'),
('������Ŀ��','m15211122240@163.com','��ģ����','������ѧ','����','image/j.jpg'),
('��ģ��','m15211122241@163.com','����ģ','������ѧ','��ģ','image/a,jpg');

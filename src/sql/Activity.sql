--���ڴ������ŷ��͵Ļ����Ϣ
--2017/7/19
CREATE TABLE activity(
id bigint NOT NULL AUTO_INCREMENT COMMENT '���id',
commID bigint NOT NULL COMMENT '���ŵ�id',
create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '��̬����ʱ��',
start_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '��ʼʱ��',
end_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '����ʱ��',
content varchar(1000) NOT NULL COMMENT '�������',
phone varchar(50) NOT NULL COMMENT '�����ϵ����',
picture varchar(50) NOT NULL COMMENT '���ͼƬ��url',
theme varchar(50) NOT NULL COMMENT '�������',
introduction varchar(200) NOT NULL COMMENT '��ļ��',
PRIMARY KEY (id),
key idx_create_time(create_time),
key idx_theme(theme),
key idx_start_time(start_time),
key idx_endtime(end_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '���Ż��';

--���ô�������ɾ������ʱҲ��acuser�е�һ��ɾ��
CREATE TRIGGER delete_to_acuser after DELETE ON activity FOR EACH ROW delete from activity_user where Activity_id = OLD.id;
--��������
insert into activity(commID,start_time,end_time,content,phone,picture,theme,introduction)
values
	(1000,'2017-07-22 00:24:25','2017-07-23 00:24:25','ȥС�Ϻ�������','6760110','images/1.jpg','����','������'),
	(1000,'2017-07-22 00:24:25','2017-07-23 00:24:25','ȥ���Ϻ�������','6760120','images/2.jpg','����','������'),
	(1000,'2017-07-22 00:24:25','2017-07-23 00:24:25','ȥ�Ƽ�����־Ը��','6760119','images/3.jpg','־Ը��','��־Ը��');

   	
--����ѯ
select * from activity_user as au left join activity as a on a.ID =au.Activity_id left join User as u on u.ID=au.user_id
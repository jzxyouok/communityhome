--���ڴ�����Ա����Ļ����Ϣ
--2017/7/21
CREATE TABLE manager_comm_user(
Community_id bigint NOT NULL COMMENT '����id',
user_id bigint COMMENT '��Աid',
PRIMARY KEY (Community_id,user_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '���Ź�����Ա��';

--��������
insert into manager_comm_user(Community_id,user_id)
values
	(1000,1000),
	(1000,1001),
	(1000,1002);
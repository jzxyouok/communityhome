--���ڴ�����Ա��ע���ŵ���Ϣ
--2017/7/20
CREATE TABLE follow_comm_user(
Community_id bigint NOT NULL COMMENT '��ע����id',
user_id bigint COMMENT '��Աid',
PRIMARY KEY (Community_id,user_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '��ע������Ա��';

--��������
insert into follow_comm_user(Community_id,user_id)
values
	(1000,1000),
	(1000,1001),
	(1000,1002);
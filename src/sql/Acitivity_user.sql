--���ڴ������ŷ��͵Ļ����Ϣ
--2017/7/20
CREATE TABLE activity_user(
Activity_id bigint NOT NULL COMMENT '�id',
user_id bigint COMMENT '��Աid',
PRIMARY KEY (Activity_id,user_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '���Ż��Ա��';

--��������
insert into activity_user(Activity_id,user_id)
values
	(1000,1000),
	(1000,1001),
	(1000,1002);
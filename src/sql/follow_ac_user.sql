--���ڴ�����Ա��ע�����Ϣ
--2017/7/20
CREATE TABLE follow_ac_user(
Activity_id bigint NOT NULL COMMENT '��ע�id',
user_id bigint COMMENT '��Աid',
PRIMARY KEY (Activity_id,user_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '��ע���Ż��Ա��';

--��������
insert into follow_ac_user(Activity_id,user_id)
values
	(1000,1000),
	(1000,1001),
	(1000,1002);
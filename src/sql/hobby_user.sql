--���ڴ�����Ա����Ȥ����Ϣ
--2017/7/20
CREATE TABLE hobby_user(
user_id bigint NOT NULL COMMENT '�û�id',
hobby varchar(50) COMMENT '��Ȥ',
PRIMARY KEY (user_id,hobby)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '��Ա��Ȥ��';

--��������
insert into hobby_user
values
	(1001,'���� ��ģ'),
	(1000,'����'),
	(1000,'�ܲ�');
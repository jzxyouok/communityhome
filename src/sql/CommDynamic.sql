--���ڴ������ŷ��͵Ķ�̬
--2017/7/19

CREATE TABLE CommDynamic(
id bigint NOT NULL AUTO_INCREMENT COMMENT '��̬��id',
information varchar(120) NOT NULL COMMENT '��̬������',
create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '��̬����ʱ��',
community_id bigint NOT NULL  COMMENT '���ŵ�id',
PRIMARY KEY (id),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '���Ŷ�̬��';


--��������
insert into CommDynamic(information,community_id)
values
	('��ʼ���Ŷ',1000),
	('�ֿ�ʼ���Ŷ',1000),
	('�ٿ�ʼ���Ŷ',1000);
	
	
--��������
select * from CommDynamic;

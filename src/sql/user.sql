--�����û�����Ϣ
--2017/7/19

CREATE TABLE User(
id bigint NOT NULL AUTO_INCREMENT COMMENT '��̬��id',
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
school varchar(25) NOT NULL COMMENT 'ѧУ',
PRIMARY KEY (id),
key idx_use(username),
key idx_pas(password)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '�û���';
insert into User(username,mailbox,password,picture,name,studentid,profession,telnumber,birth,gender,school)
values
("test","m15211122540@163.com","password1","image/11.jpg","������",20165122,"Ӣ��","15245278912","20160801","��","��ɽ����"),
("test2","m15211122240@163.com","password","image/1.jpg","����",20165142,"���","15245678912","20160809","��","��ɽ����"),
("test1","m15214122240@163.com","pssword","image/12.jpg","������",20165122,"����","15245278912","20160109","��","��ɽ����");
select *from User;
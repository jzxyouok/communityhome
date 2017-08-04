--用于用户的信息
--2017/7/19

CREATE TABLE User(
id bigint NOT NULL AUTO_INCREMENT COMMENT '动态的id',
username varchar(16) NOT NULL COMMENT '昵称',

mailbox varchar(25) NOT NULL COMMENT '邮箱',
password varchar(16) NOT NULL COMMENT '密码',
picture varchar(25) NOT NULL COMMENT '图片地址',
name varchar(16) NOT NULL COMMENT '名字',
studentid int NOT NULL COMMENT '学号',
profession varchar(25) NOT NULL COMMENT '专业',
telnumber varchar(25) NOT NULL COMMENT '电话',
birth varchar(25) NOT NULL COMMENT '生日',
gender varchar(25) NOT NULL COMMENT '性别',
school varchar(25) NOT NULL COMMENT '学校',
PRIMARY KEY (id),
key idx_use(username),
key idx_pas(password)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '用户表';
insert into User(username,mailbox,password,picture,name,studentid,profession,telnumber,birth,gender,school)
values
("test","m15211122540@163.com","password1","image/11.jpg","阿是三",20165122,"英件","15245278912","20160801","男","鞍山七中"),
("test2","m15211122240@163.com","password","image/1.jpg","阿三",20165142,"软件","15245678912","20160809","男","鞍山八中"),
("test1","m15214122240@163.com","pssword","image/12.jpg","阿三是",20165122,"功课","15245278912","20160109","男","鞍山九中");
select *from User;
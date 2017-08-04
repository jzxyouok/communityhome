--用于储存人员管理的活动的信息
--2017/7/21
CREATE TABLE manager_comm_user(
Community_id bigint NOT NULL COMMENT '社团id',
user_id bigint COMMENT '成员id',
PRIMARY KEY (Community_id,user_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '社团管理人员表';

--插入数据
insert into manager_comm_user(Community_id,user_id)
values
	(1000,1000),
	(1000,1001),
	(1000,1002);
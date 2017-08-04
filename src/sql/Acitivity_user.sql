--用于储存社团发送的活动的信息
--2017/7/20
CREATE TABLE activity_user(
Activity_id bigint NOT NULL COMMENT '活动id',
user_id bigint COMMENT '成员id',
PRIMARY KEY (Activity_id,user_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '社团活动人员表';

--插入数据
insert into activity_user(Activity_id,user_id)
values
	(1000,1000),
	(1000,1001),
	(1000,1002);
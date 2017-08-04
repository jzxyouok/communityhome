--用于储存人员关注活动的信息
--2017/7/20
CREATE TABLE follow_ac_user(
Activity_id bigint NOT NULL COMMENT '关注活动id',
user_id bigint COMMENT '成员id',
PRIMARY KEY (Activity_id,user_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '关注社团活动人员表';

--插入数据
insert into follow_ac_user(Activity_id,user_id)
values
	(1000,1000),
	(1000,1001),
	(1000,1002);
--用于储存人员关注社团的信息
--2017/7/20
CREATE TABLE follow_comm_user(
Community_id bigint NOT NULL COMMENT '关注社团id',
user_id bigint COMMENT '成员id',
PRIMARY KEY (Community_id,user_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '关注社团人员表';

--插入数据
insert into follow_comm_user(Community_id,user_id)
values
	(1000,1000),
	(1000,1001),
	(1000,1002);
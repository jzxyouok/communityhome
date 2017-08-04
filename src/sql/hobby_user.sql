--用于储存人员的兴趣的信息
--2017/7/20
CREATE TABLE hobby_user(
user_id bigint NOT NULL COMMENT '用户id',
hobby varchar(50) COMMENT '兴趣',
PRIMARY KEY (user_id,hobby)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '人员兴趣表';

--插入数据
insert into hobby_user
values
	(1001,'吉他 数模'),
	(1000,'钢琴'),
	(1000,'跑步');
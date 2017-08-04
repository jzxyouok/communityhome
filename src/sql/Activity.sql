--用于储存社团发送的活动的信息
--2017/7/19
CREATE TABLE activity(
id bigint NOT NULL AUTO_INCREMENT COMMENT '活动的id',
commID bigint NOT NULL COMMENT '社团的id',
create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '动态创建时间',
start_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '开始时间',
end_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '结束时间',
content varchar(1000) NOT NULL COMMENT '活动的内容',
phone varchar(50) NOT NULL COMMENT '活动的联系号码',
picture varchar(50) NOT NULL COMMENT '活动的图片的url',
theme varchar(50) NOT NULL COMMENT '活动的主题',
introduction varchar(200) NOT NULL COMMENT '活动的简介',
PRIMARY KEY (id),
key idx_create_time(create_time),
key idx_theme(theme),
key idx_start_time(start_time),
key idx_endtime(end_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '社团活动表';

--设置触发器当删除数据时也把acuser中的一起删除
CREATE TRIGGER delete_to_acuser after DELETE ON activity FOR EACH ROW delete from activity_user where Activity_id = OLD.id;
--插入数据
insert into activity(commID,start_time,end_time,content,phone,picture,theme,introduction)
values
	(1000,'2017-07-22 00:24:25','2017-07-23 00:24:25','去小南湖弹吉他','6760110','images/1.jpg','吉他','弹吉他'),
	(1000,'2017-07-22 00:24:25','2017-07-23 00:24:25','去大南湖弹吉他','6760120','images/2.jpg','吉他','弹吉他'),
	(1000,'2017-07-22 00:24:25','2017-07-23 00:24:25','去科技馆做志愿者','6760119','images/3.jpg','志愿者','做志愿者');

   	
--多表查询
select * from activity_user as au left join activity as a on a.ID =au.Activity_id left join User as u on u.ID=au.user_id
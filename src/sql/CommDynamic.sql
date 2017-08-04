--用于储存社团发送的动态
--2017/7/19

CREATE TABLE CommDynamic(
id bigint NOT NULL AUTO_INCREMENT COMMENT '动态的id',
information varchar(120) NOT NULL COMMENT '动态的内容',
create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '动态创建时间',
community_id bigint NOT NULL  COMMENT '社团的id',
PRIMARY KEY (id),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '社团动态表';


--插入数据
insert into CommDynamic(information,community_id)
values
	('开始活动了哦',1000),
	('又开始活动了哦',1000),
	('再开始活动了哦',1000);
	
	
--查找数据
select * from CommDynamic;

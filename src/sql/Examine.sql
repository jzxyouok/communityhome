--审核社团的id
    
CREATE TABLE Examine(
id bigint NOT NULL AUTO_INCREMENT COMMENT '审核的id',
name varchar(50) NOT NULL COMMENT '社团的名字',
Email varchar(50) NOT NULL COMMENT '社团的email',
introduction varchar(200) NOT NULL COMMENT '社团的简介',
school varchar(50) NOT NULL COMMENT '社团的学校',
type varchar(50) NOT NULL COMMENT '社团的类型',
picture varchar(50) NOT NULL COMMENT '社团的图片',
create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '动态创建时间',
status int NOT NULL DEFAULT -2 COMMENT '审核社团的状态',
PRIMARY KEY (id),
key idx_type(type),
key idx_name(name),
key idx_school(school)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '社团审核表';

--插入数据
insert into Examine(name,Email,introduction,school,type,picture)
values
('我的社','m15211122240@163.com','弹吉他','东北大学','吉他','image/j.jpg'),
('测试社','m15211122241@163.com','玩数模','东北大学','数模','image/a,jpg');

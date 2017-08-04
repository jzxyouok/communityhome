--用于储存社团的信息
--2017/7/19

CREATE TABLE community(
id bigint NOT NULL AUTO_INCREMENT COMMENT '社团的id',
name varchar(50) NOT NULL COMMENT '社团的名字',
Email varchar(50) NOT NULL COMMENT '社团的email',
introduction varchar(200) NOT NULL COMMENT '社团的简介',
school varchar(50) NOT NULL COMMENT '社团的学校',
type varchar(50) NOT NULL COMMENT '社团的类型',
picture varchar(50) NOT NULL COMMENT '社团的图片',
PRIMARY KEY (id),
key idx_type(type),
key idx_name(name),
key idx_school(school)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT '社团表';

--设置触发器当删除数据时也把与他相关的数据一起删除
CREATE TRIGGER delete_to_community_user after DELETE ON community FOR EACH ROW delete from community_user where community_id = OLD.id;
CREATE TRIGGER delete_to_activity after DELETE ON community FOR EACH ROW delete from activity where commID = OLD.id;
CREATE TRIGGER delete_to_commDynamic after DELETE ON community FOR EACH ROW delete from commDynamic where community_id = OLD.id;

--插入数据
insert into community(name,Email,introduction,school,type,picture)
values
('吉他社','m15211122240@163.com','弹吉他','东北大学','吉他','image/j.jpg'),
('科协','m15211122240@163.com','爱吉他的人','东北大学','社团','image/j.jpg'),
('百亿项目组','m15211122240@163.com','数模大神','东北大学','社团','image/j.jpg'),
('数模社','m15211122241@163.com','玩数模','东北大学','数模','image/a,jpg');

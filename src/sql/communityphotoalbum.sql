CREATE TABLE communityphotoalbum(
  id bigint NOT NULL COMMENT '社团id',
  picture varchar(50) COMMENT '图片'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '社团相册';

insert into communityphotoalbum
values
  (1,'吉他3.jpg'),
  (2,'吉他.jpg'),
  (1,'吉他1.jpg'),
  (1,'吉他.jpg');

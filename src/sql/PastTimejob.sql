--兼职数据库
CREATE TABLE pasttimejob(
jobid bigint NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '兼职类id',
creattime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
endtime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '截止时间',
genre VARCHAR(50) NOT NULL COMMENT '分类',
contacts VARCHAR(100) NOT NULL COMMENT '联系方式',
summary VARCHAR(1000) NOT NULL COMMENT '简介',
wage VARCHAR(50) NOT NULL COMMENT '薪资',
worktime VARCHAR(50) NOT NULL COMMENT '工作时间',
address VARCHAR(50) NOT NULL COMMENT '地址',
status INT DEFAULT 1
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;

INSERT INTO pasttimejob(endtime,genre,contacts,summary,wage,worktime,address) VALUES
('2018-9-12 00:00:00','码农','QQ417484830','只要会编程就要','1000元/天','24小时/天','中国'),
('2018-4-12 00:00:00','小说家','QQ417484830','要求文学类专业硕士以上学历','2000元/天','12小时/天','阿拉伯');
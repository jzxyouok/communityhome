--兼职数据库
CREATE TABLE pasttimejob(
jobid bigint NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '兼职类id',
creattime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
starttime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '截止时间',
endtime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '截止时间',
genre VARCHAR(50) NOT NULL COMMENT '分类',
contacts VARCHAR(100) NOT NULL COMMENT '联系方式',
summary VARCHAR(1000) NOT NULL COMMENT '简介'
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;

INSERT INTO pasttimejob(starttime,endtime,genre,contacts,summary) VALUES
('2017-6-12 00:00:00','2018-9-12 00:00:00','码农','QQ417484830','只要会编程就要'),
('2015-6-12 00:00:00','2018-4-12 00:00:00','小说家','QQ417484830','要求文学类专业硕士以上学历');
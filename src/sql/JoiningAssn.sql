--储存用户申请加入社团的审核信息
CREATE TABLE joiningassn(
auditingid bigint NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '审核类id',
userid bigint NOT NULL COMMENT '用户id',
assnid bigint NOT NULL COMMENT '社团id',
creattime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
endtime timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '截止时间',
status int NOT NULL DEFAULT 0 COMMENT '状态 -2超时,-1拒绝,0未审核,1接受',
PRIMARY KEY (userid,assnid)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO joiningassn(userid,assnid,endtime,status) VALUES
(1,1,'2017-7-21 10:00:01',0),
(3,1,'2017-7-25 10:00:01',0);

SELECT * FROM joiningassn LEFT JOIN USER ON joiningassn.userid = user.id;
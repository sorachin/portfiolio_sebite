DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `uid` varchar(31) NOT NULL,
  `upw` varchar(31) NOT NULL,
  `uname` varchar(31) NOT NULL,
  `uemail` varchar(31) DEFAULT NULL,
  `uphone` varchar(31) DEFAULT NULL,
  `uaddr` varchar(100) DEFAULT NULL,
  `ucreatedate` datetime DEFAULT current_timestamp(),
  PRIMARY KEY (`uid`),
  UNIQUE KEY `user_idx_unique_email` (`uemail`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into userinfo (uid,upw,ukind,uname,uemail) values ('test','test',0,'test','test@test');
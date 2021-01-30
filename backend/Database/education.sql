CREATE TABLE `education` (
  `uid` varchar(31) NOT NULL,
  `eid` integer auto_increment,
  `ename` varchar(30) NOT NULL,
  `edegree` varchar(30) NOT NULL,
   `estartdate` varchar(10) DEFAULT NULL,
  `eenddate` varchar(10) DEFAULT NULL,
  `emajor` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`eid`),
FOREIGN KEY (uid) REFERENCES userinfo (uid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


insert into education  values ('test','1','서울대','학사','2020-01-06','2020-11-27','컴퓨터');
CREATE TABLE `career` (
  `uid` varchar(31) NOT NULL,
  `cid` integer auto_increment,
  `cname` varchar(30) NOT NULL,
  `cjob` varchar(30) NOT NULL,
   `cstartdate` varchar(10) DEFAULT NULL,
  `cenddate` varchar(10) DEFAULT NULL,
  `crole` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`cid`),
FOREIGN KEY (uid) REFERENCES userinfo (uid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into career  values ('test','1','싸피','개발자','2020-01-06','2020-11-27','몰입형 SW 개발');
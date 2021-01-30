drop table if exists `portfolio`;
CREATE TABLE `portfolio` (
  `uid` varchar(31) NOT NULL,
  `pid` integer auto_increment,
  `pintro` varchar(200) NOT NULL,
  `purl` varchar(100) NOT NULL,
  `pjob` varchar(100) NOT NULL,
  PRIMARY KEY (`pid`),
FOREIGN KEY (uid) REFERENCES userinfo (uid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into portfolio (uid,pjob,pintro,purl) values ('test','개발자','안녕','httpdf');

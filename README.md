# spring boot+mybatis+Druid多数据源
## MySQL建表

```
create database if not exists test;
create database if not exists test2;
use test;
create table if not exists `userinfo`
(
    `id`	bigint(20) unsigned not null auto_increment comment '主键',
    `user_name` varchar(255)not null default '' comment '名称',
    primary key (`id`)
)engine = innodb
  auto_increment = 1
  default charset = utf8 comment ='用户信息';
insert into userinfo(id,user_name) values(1,"表1张三");
use test2;
create table if not exists `userinfo`
(
	`id`	bigint(20) unsigned not null auto_increment comment '主键',
    `user_name`        varchar(255)        not null default '' comment '名称',
    primary key (`id`)
)engine = innodb
  auto_increment = 1
  default charset = utf8 comment ='用户信息';
insert into userinfo(id,user_name) values(1,"表2张三");

```

-- 数据库初始化脚本

-- 创建数据库
CREATE DATABASE carpool
-- 使用数据库
use carpool
-- 创建User表
CREATE TABLE user(
  `user_id` bigint NOT NULL AUTO_INCREMENT,
  `user_name` varchar(120) NOT NULL,
  `user_tele` varchar(120) NOT NULL,
  `user_password` varchar(120) NOT NULL,
  `user_identity` tinyint NOT NULL DEFAULT 1 COMMENT '0:driver,1:passenger',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (user_id),
  key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='user database'
-- 创建Car表
CREATE TABLE car(
  `car_id` bigint NOT NULL AUTO_INCREMENT,
  `car_license` varchar(120) NOT NULL,
  `car_type` varchar(120) NOT NULL,
  `car_seatnum` int NOT NULL,
  `user_id`  bigint NOT NULL,
  PRIMARY KEY (car_id)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='car database'
-- 创建CRequest表
CREATE TABLE request(
  `request_id` bigint NOT NULL AUTO_INCREMENT,
  `begin_place` varchar(120) NOT NULL,
  `end_place` varchar(120) NOT NULL,
  `price`  int NOT NULL,
  `user_id`  bigint NOT NULL,
  `request_status` tinyint NOT NULL DEFAULT 1 COMMENT '0:canceled,1:visible,2:full',
  `begin_time` timestamp NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (request_id),
  key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='request database'
-- 创建Order表
CREATE TABLE bill(
  `bill_id` bigint NOT NULL AUTO_INCREMENT,
  `request_id` bigint NOT NULL,
  `user_id` bigint NOT NULL COMMENT 'responser',
  `bill_status` tinyint NOT NULL DEFAULT 1 COMMENT '0:canceled,1:matching,2:success',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (bill_id),
  key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='bill database'

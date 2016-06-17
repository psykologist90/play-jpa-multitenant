# --- First database schema

# --- !Ups
CREATE TABLE `user` (
  `id` varchar(50) NOT NULL,
  `name` varchar(250) DEFAULT NULL,
  `last_name` varchar(250) DEFAULT NULL,
  `created_by` varchar(200) DEFAULT NULL,
  `modified_by` varchar(200) DEFAULT NULL,
  `created_datetime` datetime DEFAULT NULL,
  `modified_datetime` datetime DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  `parent_id` varchar(200) DEFAULT NULL,
  `show_on_ui` tinyint(1) DEFAULT '1',
  `iq_version` int(11) DEFAULT '0',
  `cloned_from` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `parent_id` (`parent_id`,`iq_version`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ;


# --- !Downs
SET FOREIGN_KEY_CHECKS=0;
drop table if exists user;
SET FOREIGN_KEY_CHECKS=1;


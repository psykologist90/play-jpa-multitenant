# --- !Ups
INSERT INTO user (id,name,last_name,created_by,modified_by,created_datetime,modified_datetime,version,parent_id,show_on_ui,iq_version,cloned_from) VALUES ('2c9180885015fd7f0150366ba849001a','Admin','Admin','uchealth-user','uchealth-user',{ts '2015-10-04 22:13:57'},{ts '2015-11-18 14:29:22'},10,null,true,0,null);

# --- !Downs
delete from user;
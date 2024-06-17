alter table community add active tinyint;
update community set active = 1;

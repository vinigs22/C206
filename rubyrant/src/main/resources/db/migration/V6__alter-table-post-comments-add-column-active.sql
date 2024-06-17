alter table post add active tinyint;
update post set active = 1;

alter table comments add active tinyint;
update comments set active = 1;

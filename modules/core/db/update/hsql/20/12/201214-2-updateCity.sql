alter table CARSERVICECENTER_CITY add column DEFAULT_CITY boolean ^
update CARSERVICECENTER_CITY set DEFAULT_CITY = false where DEFAULT_CITY is null ;
alter table CARSERVICECENTER_CITY alter column DEFAULT_CITY set not null ;

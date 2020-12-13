alter table CARSERVICECENTER_EMPLOYEE alter column BIRTH_DAY rename to BIRTH_DAY__U44566 ^
alter table CARSERVICECENTER_EMPLOYEE alter column BIRTH_DAY__U44566 set null ;
alter table CARSERVICECENTER_EMPLOYEE add column BIRTH_DAY timestamp ^
update CARSERVICECENTER_EMPLOYEE set BIRTH_DAY = current_timestamp where BIRTH_DAY is null ;
alter table CARSERVICECENTER_EMPLOYEE alter column BIRTH_DAY set not null ;

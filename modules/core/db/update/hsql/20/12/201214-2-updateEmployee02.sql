alter table CARSERVICECENTER_EMPLOYEE alter column BIRTH_DAY rename to BIRTH_DAY__U79685 ^
alter table CARSERVICECENTER_EMPLOYEE alter column BIRTH_DAY__U79685 set null ;
alter table CARSERVICECENTER_EMPLOYEE add column BIRTH_DAY date ^
update CARSERVICECENTER_EMPLOYEE set BIRTH_DAY = current_date where BIRTH_DAY is null ;
alter table CARSERVICECENTER_EMPLOYEE alter column BIRTH_DAY set not null ;

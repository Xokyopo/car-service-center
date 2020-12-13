-- begin CARSERVICECENTER_EMPLOYEE
create table CARSERVICECENTER_EMPLOYEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(255) not null,
    LAST_NAME varchar(255),
    BIRTH_DAY date not null,
    EMAIL varchar(255),
    SALARY bigint,
    CENTER_ID varchar(36),
    --
    primary key (ID)
)^
-- end CARSERVICECENTER_EMPLOYEE
-- begin CARSERVICECENTER_CAR_SERVICE_CENTER
create table CARSERVICECENTER_CAR_SERVICE_CENTER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    PHONE varchar(1024),
    CITY_ID varchar(36),
    ADDRESS varchar(255),
    --
    primary key (ID)
)^
-- end CARSERVICECENTER_CAR_SERVICE_CENTER
-- begin CARSERVICECENTER_REPAIR
create table CARSERVICECENTER_REPAIR (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DESCRIPTION varchar(5000) not null,
    EMPLOYEE_ID varchar(36),
    CENTER_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end CARSERVICECENTER_REPAIR
-- begin CARSERVICECENTER_CUSTOMER
create table CARSERVICECENTER_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(255),
    --
    NAME varchar(255) not null,
    PHONE varchar(255),
    EMAIL varchar(255),
    --
    primary key (ID)
)^
-- end CARSERVICECENTER_CUSTOMER
-- begin CARSERVICECENTER_CITY
create table CARSERVICECENTER_CITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(500) not null,
    CODE integer,
    --
    primary key (ID)
)^
-- end CARSERVICECENTER_CITY
-- begin CARSERVICECENTER_COMPANY
create table CARSERVICECENTER_COMPANY (
    ID varchar(36) not null,
    --
    INN varchar(255) not null,
    --
    primary key (ID)
)^
-- end CARSERVICECENTER_COMPANY
-- begin CARSERVICECENTER_INDIVIDUAL
create table CARSERVICECENTER_INDIVIDUAL (
    ID varchar(36) not null,
    --
    PASSPORT_NO varchar(255) not null,
    --
    primary key (ID)
)^
-- end CARSERVICECENTER_INDIVIDUAL
-- begin CARSERVICECENTER_CAR_SERVICE_CENTER_CUSTOMER_LINK
create table CARSERVICECENTER_CAR_SERVICE_CENTER_CUSTOMER_LINK (
    CUSTOMER_ID varchar(36) not null,
    CAR_SERVICE_CENTER_ID varchar(36) not null,
    primary key (CUSTOMER_ID, CAR_SERVICE_CENTER_ID)
)^
-- end CARSERVICECENTER_CAR_SERVICE_CENTER_CUSTOMER_LINK

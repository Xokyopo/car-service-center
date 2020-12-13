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
    BIRTH_DAY timestamp not null,
    EMAIL varchar(255),
    SALARY bigint,
    CENTER_ID varchar(36),
    --
    primary key (ID)
);
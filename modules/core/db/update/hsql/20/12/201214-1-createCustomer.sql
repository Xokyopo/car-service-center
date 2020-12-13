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
);
create table USER
(
    ID            BIGINT auto_increment
        primary key,
    EMAIL        VARCHAR(35) not null,
    PASSWORD VARCHAR(15) not null,
    role  VARCHAR(10),
    create_at timestamp not null
);
create table Personal_Information
(
    ID            BIGINT auto_increment
        primary key,
    name        VARCHAR(20),
    surname  VARCHAR(20),
    patronymic  VARCHAR(20),
    date_of_birthday date,
    phone_number varchar(35),
    user_id BIGINT not null,
    foreign key (user_id) references User (ID)
);
create table TYPE
(
    ID   SMALLINT auto_increment
        primary key,
    NAME VARCHAR(100),
    IMG  JSON not null
);
create table BRAND
(
    ID   INT auto_increment
        primary key,
    NAME VARCHAR(100),
    IMG  JSON not null
);
create table BASKET
(
    ID            bigint auto_increment
        primary key,
    user_id BIGINT not null,
    foreign key (user_id) references User (ID)
);
create table CATEGORY
(
    ID            smallint auto_increment
        primary key,
    name        VARCHAR(100),
    type_id smallint not null,
    brand_id int not null,
    foreign key (brand_id) references BRAND (ID),
    foreign key (type_id) references TYPE (ID)
);
create table SUBCATEGORY
(
    ID          SMALLINT auto_increment
        primary key,
    NAME        VARCHAR(100),
    CATEGORY_ID SMALLINT not null
        references CATEGORY (ID),
    IMG         JSON     not null,
        foreign key (CATEGORY_ID) references CATEGORY (ID)
);
create table Device
  (
      ID            BIGINT auto_increment
          primary key,
      name        VARCHAR(50) not null,
      year date not null,
      img json not null,
      count int not null,
      price  DOUBLE not null,
      rating  tinyint not null,
      create_at timestamp not null,
      type_id smallint not null,
      brand_id int not null,
      category_id smallint not null,
      subcategory_id smallint not null,
      foreign key (type_id) references TYPE (ID),
      foreign key (brand_id) references BRAND (ID),
      foreign key (category_id) references CATEGORY (ID),
      foreign key (subcategory_id) references SUBCATEGORY (ID)

);
create table Device_Information
  (
      ID            BIGINT auto_increment
          primary key,
      name        VARCHAR(150) not null,
      description        VARCHAR(150) not null,
      device_id BIGINT not null,
      foreign key (device_id) references DEVICE (ID)

);
create table BASKET_DEVICE
(
    ID            BIGINT auto_increment
        primary key,
    device_id BIGINT not null,
    BASKET_id BIGINT not null,
    foreign key (device_id) references DEVICE (ID),
    foreign key (BASKET_id) references BASKET (ID)
);
create table RATING
(
    ID            BIGINT auto_increment
        primary key,
    RATING TINYINT,
    REVIEW nvarchar(15000),
    USER_id BIGINT not null,
    DEVICE_id BIGINT,
    pick_up_point_id smallint,
    foreign key (pick_up_point_id) references PICK_UP_POINT (ID),
    foreign key (USER_id) references USER (ID),
    foreign key (DEVICE_id) references DEVICE (ID)
);
create table Pick_Up_Point
(
    ID            smallint auto_increment
        primary key,
    name varchar(30) not null,
    time date not null,
    city_address varchar(20) not null,
    street_address varchar(20) not null,
    house_address varchar(20) not null,
    office_address varchar(20),
    RATING TINYINT,
    REVIEW nvarchar(15000)
);
create table ORDERS
(
    ID                        BIGINT auto_increment
        primary key,
    CREATE_AT                 TIMESTAMP   not null,
    USER_ID                   BIGINT      not null
        references USER (ID),
    DEVICE_ID                 BIGINT      not null
        references DEVICE (ID),
    PICK_UP_POINT_ID          SMALLINT
        references PICK_UP_POINT (ID),
    STATUS                    VARCHAR(20) not null,
    TYPE_OF_PAYMENT           VARCHAR(20) not null,
    TYPE_OF_DELIVERY_SERVICES VARCHAR(20),
        foreign key (USER_ID) references USER (ID),
        foreign key (PICK_UP_POINT_ID) references PICK_UP_POINT (ID),
        foreign key (DEVICE_ID) references DEVICE (ID)
);

create table ADS
(
    ID            bigint auto_increment
        primary key,
    name varchar(50) not null,
    city_address varchar(20) not null,
    street_address varchar(20) not null,
    description varchar(200) not null,
    price DOUBLE not null,
    create_at timestamp not null,
    img json,
    year DATE,
    category_id smallint not null,
    user_id bigint not null,
    foreign key (category_id) references CATEGORY (ID),
    foreign key (user_id) references USER (ID)
);
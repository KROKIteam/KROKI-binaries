
    alter table IA_CATEGORY 
        drop constraint FKB2EA904576A592AE;

    alter table IA_CITY 
        drop constraint FK89EC3032199F945D;

    alter table IA_DEPARTMENT 
        drop constraint FK87CE5CD927BA1820;

    alter table IA_DEPARTMENT 
        drop constraint FK87CE5CD9A948C2B4;

    alter table IA_ENTERPRISE 
        drop constraint FK25674CE86F5E8405;

    alter table IA_INVOICE 
        drop constraint FK7A82E6E6482AEA19;

    alter table IA_ORDER 
        drop constraint FKB446C947BA1C9C38;

    alter table IA_ORDER_ITEM 
        drop constraint FK8414170B16F57E4F;

    alter table IA_ORDER_ITEM 
        drop constraint FK8414170BADDD5B4D;

    alter table IA_PRICE_LIST_ITEM 
        drop constraint FKDA187957C4131978;

    alter table IA_PRODUCT 
        drop constraint FKF33A70A8A8C136B1;

    alter table IA_PRODUCT 
        drop constraint FKF33A70A84EA7BBB7;

    alter table IA_PRODUCT 
        drop constraint FKF33A70A87F3EE1DD;

    alter table IA_PRODUCT 
        drop constraint FKF33A70A8E90F3EF3;

    alter table IA_STOCK 
        drop constraint FKB480390F1DB041BE;

    alter table IA_STOCK_KEEPING_UNIT 
        drop constraint FK87C6E796F59B7467;

    alter table IA_VENDOR 
        drop constraint FKDFD1A24F90952A7E;

    drop table IA_CATEGORY if exists;

    drop table IA_CITY if exists;

    drop table IA_DEPARTMENT if exists;

    drop table IA_ENTERPRISE if exists;

    drop table IA_INVOICE if exists;

    drop table IA_ORDER if exists;

    drop table IA_ORDER_ITEM if exists;

    drop table IA_PRICE_LIST if exists;

    drop table IA_PRICE_LIST_ITEM if exists;

    drop table IA_PRODUCT if exists;

    drop table IA_STATE if exists;

    drop table IA_STOCK if exists;

    drop table IA_STOCK_KEEPING_UNIT if exists;

    drop table IA_USER if exists;

    drop table IA_VENDOR if exists;

    create table IA_CATEGORY (
        ID bigint generated by default as identity unique,
        CAT_CATEGORY_NAME varchar(255) not null,
        CAT_DESCRIPTION varchar(255) not null,
        category_category bigint,
        primary key (ID)
    );

    create table IA_CITY (
        ID bigint generated by default as identity unique,
        CIT_NAME varchar(255) not null,
        CIT_ZIP_CODE varchar(255) not null,
        city_state bigint,
        primary key (ID)
    );

    create table IA_DEPARTMENT (
        ID bigint generated by default as identity unique,
        DEP_ADDRESS varchar(255) not null,
        DEP_DEPARTMENT_NAME varchar(255) not null,
        department_city bigint,
        department_enterprise bigint,
        primary key (ID)
    );

    create table IA_ENTERPRISE (
        ID bigint generated by default as identity unique,
        ENT_ADDRESS varchar(255) not null,
        ENT_NAME varchar(255) not null,
        enterprise_city bigint,
        primary key (ID)
    );

    create table IA_INVOICE (
        ID bigint generated by default as identity unique,
        INV_CANCELED boolean not null,
        INV_INVOICE_DATE timestamp not null,
        INV_INVOICE_NUMBER varchar(255) not null,
        INV_INVOICE_TOTAL decimal(19,2) not null,
        invoice_order bigint,
        primary key (ID)
    );

    create table IA_ORDER (
        ID bigint generated by default as identity unique,
        ORD_ORDER_DATE timestamp not null,
        ORD_ORDER_NUMBER varchar(255) not null,
        ORD_ORDER_STATUS varchar(255) not null,
        ORD_ORDER_TOTAL decimal(19,2) not null,
        ORD_SHIPMENT_ADDRESS varchar(255) not null,
        order_city bigint,
        primary key (ID)
    );

    create table IA_ORDER_ITEM (
        ID bigint generated by default as identity unique,
        ORD_AVAILABLE boolean not null,
        ORD_ORDERED_QUANTITY varchar(255) not null,
        ORD_UNIT_PRICE decimal(19,2) not null,
        ORD_UNIT_TAX decimal(19,2) not null,
        ORD_VALUE decimal(19,2) not null,
        orderitem_order bigint,
        orderitem_product bigint,
        primary key (ID)
    );

    create table IA_PRICE_LIST (
        ID bigint generated by default as identity unique,
        PRI_ACTIVE_FROM timestamp not null,
        PRI_LIST_NUMBER varchar(255) not null,
        primary key (ID)
    );

    create table IA_PRICE_LIST_ITEM (
        ID bigint generated by default as identity unique,
        PRI_PRICE decimal(19,2) not null,
        PRI_TAX decimal(19,2) not null,
        pricelistitem_priceList bigint,
        primary key (ID)
    );

    create table IA_PRODUCT (
        ID bigint generated by default as identity unique,
        PRO_DESCRIPTION varchar(255) not null,
        PRO_PRODUCT_NAME varchar(255) not null,
        product_category bigint,
        product_priceListItem bigint,
        product_stockKeepingUnit bigint,
        product_vendor bigint,
        primary key (ID)
    );

    create table IA_STATE (
        ID bigint generated by default as identity unique,
        STA_NAME varchar(255) not null,
        primary key (ID)
    );

    create table IA_STOCK (
        ID bigint generated by default as identity unique,
        STO_ADDRESS varchar(255) not null,
        STO_STOCK_NAME varchar(255) not null,
        stock_department bigint,
        primary key (ID)
    );

    create table IA_STOCK_KEEPING_UNIT (
        ID bigint generated by default as identity unique,
        STO_AVAILABLE boolean not null,
        stockkeepingunit_stock bigint,
        primary key (ID)
    );

    create table IA_USER (
        ID bigint generated by default as identity unique,
        password varchar(255) not null,
        username varchar(255) not null,
        primary key (ID)
    );

    create table IA_VENDOR (
        ID bigint generated by default as identity unique,
        VEN_ADDRESS varchar(255) not null,
        VEN_NAME varchar(255) not null,
        vendor_city bigint,
        primary key (ID)
    );

    alter table IA_CATEGORY 
        add constraint FKB2EA904576A592AE 
        foreign key (category_category) 
        references IA_CATEGORY;

    alter table IA_CITY 
        add constraint FK89EC3032199F945D 
        foreign key (city_state) 
        references IA_STATE;

    alter table IA_DEPARTMENT 
        add constraint FK87CE5CD927BA1820 
        foreign key (department_enterprise) 
        references IA_ENTERPRISE;

    alter table IA_DEPARTMENT 
        add constraint FK87CE5CD9A948C2B4 
        foreign key (department_city) 
        references IA_CITY;

    alter table IA_ENTERPRISE 
        add constraint FK25674CE86F5E8405 
        foreign key (enterprise_city) 
        references IA_CITY;

    alter table IA_INVOICE 
        add constraint FK7A82E6E6482AEA19 
        foreign key (invoice_order) 
        references IA_ORDER;

    alter table IA_ORDER 
        add constraint FKB446C947BA1C9C38 
        foreign key (order_city) 
        references IA_CITY;

    alter table IA_ORDER_ITEM 
        add constraint FK8414170B16F57E4F 
        foreign key (orderitem_product) 
        references IA_PRODUCT;

    alter table IA_ORDER_ITEM 
        add constraint FK8414170BADDD5B4D 
        foreign key (orderitem_order) 
        references IA_ORDER;

    alter table IA_PRICE_LIST_ITEM 
        add constraint FKDA187957C4131978 
        foreign key (pricelistitem_priceList) 
        references IA_PRICE_LIST;

    alter table IA_PRODUCT 
        add constraint FKF33A70A8A8C136B1 
        foreign key (product_vendor) 
        references IA_VENDOR;

    alter table IA_PRODUCT 
        add constraint FKF33A70A84EA7BBB7 
        foreign key (product_stockKeepingUnit) 
        references IA_STOCK_KEEPING_UNIT;

    alter table IA_PRODUCT 
        add constraint FKF33A70A87F3EE1DD 
        foreign key (product_category) 
        references IA_CATEGORY;

    alter table IA_PRODUCT 
        add constraint FKF33A70A8E90F3EF3 
        foreign key (product_priceListItem) 
        references IA_PRICE_LIST_ITEM;

    alter table IA_STOCK 
        add constraint FKB480390F1DB041BE 
        foreign key (stock_department) 
        references IA_DEPARTMENT;

    alter table IA_STOCK_KEEPING_UNIT 
        add constraint FK87C6E796F59B7467 
        foreign key (stockkeepingunit_stock) 
        references IA_STOCK;

    alter table IA_VENDOR 
        add constraint FKDFD1A24F90952A7E 
        foreign key (vendor_city) 
        references IA_CITY;
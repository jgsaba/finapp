
create schema better_banking_adm;

create table better_banking_adm.transaction(
    id varchar(255) PRIMARY KEY,
    type varchar(50) NOT NULL,
    date timestamp without time zone,
    account_number varchar(200) NOT NULL,
    currency varchar(200) NOT NULL,
    amount bigint NOT NULL,
    merchant_name varchar(200) NOT NULL,
    merchant_logo varchar(200) NOT NULL
);

insert into better_banking_adm.transaction values (
    'c30765d6-e782-4ac1-8565-9883ef351109',
    'CREDIT',
    timestamp '2013-03-21 09:10:59',
    '659882',
    'USD',
    500,
    'whatever',
    'whatever');
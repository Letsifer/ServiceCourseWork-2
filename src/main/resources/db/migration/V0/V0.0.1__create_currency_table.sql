create table converter.currency(
    id serial,
    title varchar not null,
    shorttitle varchar,

    constraint currency_pk primary key (id) 
);

create unique index unique_currency_title on converter.currency
    using btree(title);

COMMENT ON TABLE converter.currency
IS 'Список валют';

COMMENT ON COLUMN converter.currency.title
IS 'Название валюты';

COMMENT ON COLUMN converter.currency.shorttitle
IS 'Иконка валюты';
create table converter.comparation(
    id serial,
    ratio DOUBLE PRECISION,
    first_currency integer,
    second_currency integer,

    constraint comparation_pk primary key (id),
    constraint first_fk foreign key(first_currency)
        references converter.currency(id)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION
        NOT DEFERRABLE,
        
    constraint second_fk foreign key(second_currency)
        references converter.currency(id)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION
        NOT DEFERRABLE

);

COMMENT ON TABLE converter.comparation
IS 'Сопоставления валют';

COMMENT ON COLUMN converter.comparation.ratio
IS 'Отношение первой валюты ко второй';

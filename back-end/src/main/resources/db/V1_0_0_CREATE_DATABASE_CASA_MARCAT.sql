CREATE TABLE IF NOT EXISTS
    type_pay
(
    id   SERIAL,
    type VARCHAR,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS
    type_status
(
    id   SERIAL,
    type VARCHAR,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS
    case_marcat
(
    id                      SERIAL,
    numar_casa_marcat       SERIAL,
    bani_locali_casa_marcat FLOAT,
    type_pay_id             SERIAL,
    type_status_id          SERIAL,
    PRIMARY KEY (id),
    CONSTRAINT fk_type_pay FOREIGN KEY (type_pay_id) REFERENCES type_pay (id),
    CONSTRAINT fk_type_status FOREIGN KEY (type_status_id) REFERENCES type_status (id)
);

INSERT INTO type_pay(type)
VALUES ('CASH');
INSERT INTO type_pay(type)
VALUES ('CARD');
INSERT INTO type_pay(type)
VALUES ('AMPRENTA');

INSERT INTO type_status(type)
VALUES ('BLOCATA');
INSERT INTO type_status(type)
VALUES ('FUNCTIONALA');
INSERT INTO type_status(type)
VALUES ('ASTEAPTA_OPERATOR');

INSERT INTO case_marcat(numar_casa_marcat, bani_locali_casa_marcat)
VALUES (1, 100);
INSERT INTO case_marcat(numar_casa_marcat, bani_locali_casa_marcat)
VALUES (2, 200);
INSERT INTO case_marcat(numar_casa_marcat, bani_locali_casa_marcat)
VALUES (3, 300);
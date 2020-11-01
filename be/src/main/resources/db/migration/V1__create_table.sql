--
CREATE SEQUENCE hibernate_sequence START WITH 1000 INCREMENT BY 1;

CREATE TABLE IF NOT EXISTS event
(
    id        int NOT NULL PRIMARY KEY,
    name      varchar(20),
    time_stamp timestamp
);

INSERT INTO event (id, name, time_stamp) VALUES (1, 'ovulation', '2020-01-11 14:10:25');

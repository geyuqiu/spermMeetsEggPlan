--
CREATE TABLE IF NOT EXISTS user
(
    id        int NOT NULL PRIMARY KEY,
    name      varchar(20),
    age       int

);

INSERT INTO user (id, name, age) VALUES (1, 'Yuqiu', 29);
INSERT INTO user (id, name, age) VALUES (2, 'Yueying', 23);

CREATE TABLE IF NOT EXISTS event
(
    id        int NOT NULL PRIMARY KEY,
    name      varchar(20),
    timestamp timestamp
);

INSERT INTO event (id, name, timestamp) VALUES (1, 'ovulation', '2020-01-11 14:10:25');

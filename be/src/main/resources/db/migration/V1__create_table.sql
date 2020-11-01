--
CREATE TABLE IF NOT EXISTS user
(
    id        int NOT NULL PRIMARY KEY,
    name      varchar(20),
    age       int

);

CREATE TABLE IF NOT EXISTS event
(
    id        int NOT NULL PRIMARY KEY,
    name      varchar(20),
    timestamp timestamp
);


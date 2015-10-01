CREATE DATABASE bankapp;

CREATE SEQUENCE user_id_seq
INCREMENT 1
MINVALUE 1000
MAXVALUE 9999
START 1000
CACHE 1;
ALTER TABLE user_id_seq
OWNER TO postgres;

CREATE TABLE "user" (
  "id"         INTEGER DEFAULT nextval('user_id_seq' :: REGCLASS),
  "login"      VARCHAR(1000),
  "name"       TEXT,
  "surname"    TEXT,
  "middlename" TEXT
);

INSERT INTO "user" (id, login, name, surname, middlename) VALUES (1000, 'admin', 'Иван', 'Иванов', 'Иванович');
INSERT INTO "user" (id, login, name, surname, middlename) VALUES (1001, 'user1', 'Пётр', 'Иванов', 'Иванович');
INSERT INTO "user" (id, login, name, surname, middlename) VALUES (1002, 'user2', 'Алексей', 'Иванов', 'Петрович');
INSERT INTO "user" (id, login, name, surname, middlename) VALUES (1003, 'user3', 'Андрей', 'Иванов', 'Петрович');

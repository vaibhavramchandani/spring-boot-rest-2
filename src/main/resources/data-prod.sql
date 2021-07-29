DROP TABLE IF EXISTS users;

CREATE TABLE users(
    id INT AUTO_INCREMENT  PRIMARY KEY,
    name VARCHAR(20),
    email VARCHAR(20) UNIQUE,
    password varchar(100) NOT NULL
);

INSERT INTO users (name, email, password ) VALUES   ( 'admin_prod', 'admin_prod@mail.com', 'SampleP@s123' );
INSERT INTO users (name, email, password ) VALUES ( 'johny_prod', 'johny_prod@mail.com', 'SampleP@s123' );
INSERT INTO users (name, email, password ) VALUES ( 'ramazan_prod', 'rmzn_prod@mail.com', 'SampleP@s123' );
INSERT INTO users (name, email, password ) VALUES ( 'teten-nugraha_prod', 'teten_prod@mail.com', 'SampleP@s123' );
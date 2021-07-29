DROP TABLE IF EXISTS users;

CREATE TABLE users(
    id INT AUTO_INCREMENT  PRIMARY KEY,
    name VARCHAR(20),
    email VARCHAR(20) UNIQUE,
    password varchar(100) NOT NULL
);

INSERT INTO users (name, email, password ) VALUES   ( 'admin_dev', 'admin_dev@mail.com', 'SampleP@s123' );
INSERT INTO users (name, email, password ) VALUES ( 'johny_dev', 'johny_dev@mail.com', 'SampleP@s123' );
INSERT INTO users (name, email, password ) VALUES ( 'ramazan_dev', 'rmzn_dev@mail.com', 'SampleP@s123' );
INSERT INTO users (name, email, password ) VALUES ( 'teten-nugraha_dev', 'teten_dev@mail.com', 'SampleP@s123' );
create database if not exists emp_dir;
use emp_dir;

create table if not exists employee(
 emp_id int auto_increment,
 fname varchar(15) default null,
 lname varchar(15)default null,
 email varchar(50) default null,
 salary int default null,
 primary key(emp_id)
);

-- Users table: username unique, password stored with {id} prefix (e.g., {bcrypt})
CREATE TABLE users (
  username VARCHAR(50) NOT NULL,
  password VARCHAR(100) NOT NULL,
  enabled TINYINT(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (username)
) ENGINE=InnoDB;

-- Authorities table: allow multiple roles per user via composite PK
CREATE TABLE authorities (
  username VARCHAR(50) NOT NULL,
  authority VARCHAR(50) NOT NULL,
  PRIMARY KEY (username, authority),
  CONSTRAINT fk_authorities_users FOREIGN KEY (username) REFERENCES users (username)
    ON DELETE CASCADE
) ENGINE=InnoDB;
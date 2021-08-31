CREATE TABLE live_document(
id VARCHAR(50) NOT NULL PRIMARY KEY,
live_name VARCHAR(50) NOT NULL,
channel_name VARCHAR(100) NOT NULL,
live_date DateTime,
live_link VARCHAR(100),
registration_date DateTime
);
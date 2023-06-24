CREATE TABLE IF NOT EXISTS users (
  user_id INT(5) PRIMARY KEY,
  user_name VARCHAR(20),
  user_kana_name VARCHAR(30),
  role VARCHAR(10)
);

CREATE TABLE IF NOT EXISTS clubs (
  club_id INT(5) PRIMARY KEY,
  club_name VARCHAR(10) UNIQUE,
  request_date VARCHAR(10),
  request_name VARCHAR(20),
  request_member INT(5),
  club_concept VARCHAR(200),
  club_content VARCHAR(200)
);

CREATE TABLE IF NOT EXISTS club_members (
 club_member_id INT(5) PRIMARY KEY,
 user_id INT(5),
 club_id INT(5),
 post VARCHAR(10)
  
);

CREATE TABLE IF NOT EXISTS club_reports (
 report_id INT(5) PRIMARY KEY,
 club_id INT(5),
 create_member VARCHAR(20),
 active_member INT(5),
 active_date VARCHAR(10),
 active_name VARCHAR(50),
 active_goal VARCHAR(200),
 active_plan VARCHAR(200),
 active_result VARCHAR(200),
 improvement VARCHAR(200),
 message VARCHAR(200),
 picture VARCHAR(1000)
);

CREATE TABLE IF NOT EXISTS active_members (
 active_id INT(5) PRIMARY KEY,
 report_id INT(5),
 user_id INT(5),
 thought VARCHAR(200)
);
INSERT INTO club_members (club_member_id, user_id, club_id, post)
VALUES('1','1','1','部長');

INSERT INTO clubs (club_id, club_name, request_date, request_name, request_member, club_concept, club_content)
VALUES('1','ボルダリング','2022-04-04','高谷匠','5','aaa','iii'),('2','ゴルフ部','2022-05-13','小西正悟','4','uuu','eee');

INSERT INTO users (user_id, user_name, user_kana_name, role )
VALUES('1','飯塚　隼人','イイツカ　ハヤト','admin' );

INSERT INTO club_reports (report_id, club_id, create_member, active_member, active_date, active_name, active_goal, active_plan, active_result, improvement, message, picture)
VALUES('1', '1', '高谷匠', '5', '2023-04-21', '全身筋肉痛になろう！ボルダリング部', '共通の壁/課題に挑戦、解決することで親睦を深める', 'aaaa', '大きなケガなく全員で楽しめました！', 'aaaaa', 'iiiiiiii', 'uuuuu');

INSERT INTO active_members (active_id, report_id, user_id, thought )
VALUES('1','1','1','aaaaaaaaaaaa');
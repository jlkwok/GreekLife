INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Sigma Nu', 150, 1, '1', 1, '1');
INSERT INTO greekLife.chapter_member (badge_number, gpa, join_date, major, name, sid, year) VALUES (100, 3.0, '1', 'comp sci', 'Kyle', '1', 1);
INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('Murray', '1', 1);
INSERT INTO greekLife.member_of (chapter_name, sid) VALUES ('Sigma Nu', 1);
INSERT INTO greekLife.chapter_house (address, is_available_in_summer, campus_location, max_occupancy, meal_plan_service) VALUES ('Murray', True, 'SS', 1, 'Al');
INSERT INTO greekLife.house_of (chapter_name, address) VALUES ('Sigma Nu', 'Murray');

use greekLife;
SELECT * from chapter c, chapter_member m WHERE NOT EXISTS (SELECT o.sid FROM member_of o WHERE o.sid=m.sid AND o.chapter_name=c.chapter_name AND o.sid NOT IN (SELECT l.sid FROM lives_in l, house_of h WHERE l.sid=m.sid AND l.address=h.address AND h.chapter_name=c.chapter_name));
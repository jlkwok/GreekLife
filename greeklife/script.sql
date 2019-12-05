INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Beta Theta Pi', 150, 0, '2-22-1907', 71, '1-1-1869');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Delta Chi', 200, 0, '2-3-1934', 31, '1-1-1869');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Delta Sigma Phi', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Delta Tau Delta', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Delta Upsilon', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Phi Delta Theta', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Phi Gamma Delta', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Phi Kappa Theta', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Phi Kappa Tau', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Phi Kappa Psi', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Pi Kappa Phi', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Sigma Alpha Epsilon', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Sigma Chi', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Theta Chi', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Zeta Beta Tau', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Zeta Psi', 350, 0, '5-2-1946', 46, '2-6-1922');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Sigma Nu', 150, 0, '2-22-1907', 71, '1-1-1869');

INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Alpha Gamma Delta', 300, 1, '9-1-2018', 71, '1-1-1945');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Alpha Chi Omega', 300, 1, '9-1-2018', 71, '1-1-1945');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Alpha Phi', 300, 1, '9-1-2018', 71, '1-1-1945');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Delta Gamma', 300, 1, '9-1-2018', 71, '1-1-1945');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Kappa Alpha Theta', 300, 1, '9-1-2018', 71, '1-1-1945');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Phi Mu', 300, 1, '9-1-2018', 71, '1-1-1945');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Phi Sigma Rho', 300, 1, '9-1-2018', 71, '1-1-1945');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Pi Beta Phi', 300, 1, '9-1-2018', 71, '1-1-1945');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Sigma Psi', 300, 1, '9-1-2018', 71, '1-1-1945');
INSERT INTO greekLife.chapter (chapter_name, dues, governing_body, local_founding_date, national_designation, national_founding_date) VALUES ('Sigma Sigma Sigma', 300, 1, '9-1-2018', 71, '1-1-1945');

INSERT INTO greekLife.chapter_house (address, is_available_in_summer, campus_location, max_occupancy, meal_plan_service) VALUES ('2235 Murray Hill Rd', True, 'SS', 44, 'Alions Catering');
INSERT INTO greekLife.house_of (chapter_name, address) VALUES ('Sigma Nu', '2235 Murray Hill Rd');
INSERT INTO greekLife.chapter_house (address, is_available_in_summer, campus_location, max_occupancy, meal_plan_service) VALUES ('100 Magnolia Dr', False, 'NS', 32, 'Murray Hill Market');
INSERT INTO greekLife.house_of (chapter_name, address) VALUES ('Alpha Phi', '100 Magnolia');
INSERT INTO greekLife.chapter_house (address, is_available_in_summer, campus_location, max_occupancy, meal_plan_service) VALUES ('101 Carlton Rd', True, 'SS', 44, 'Alions Catering');
INSERT INTO greekLife.house_of (chapter_name, address) VALUES ('Alpha Gamma Delta', '101 Carlton Rd');

INSERT INTO greekLife.chapter_member (badge_number, gpa, join_date, major, name, sid, year) VALUES (1444, 3.0, '9-1-2017', 'Computer Science', 'Kyle Boxeth', '1', 3);
INSERT INTO greekLife.member_of (chapter_name, sid) VALUES ('Sigma Nu', 1);
INSERT INTO greekLife.serves_as (sid, position, term, chapter_name) VALUES (1, 'New Member Educator', '2018-2019', 'Sigma Nu');
INSERT INTO greekLife.chapter_member (badge_number, gpa, join_date, major, name, sid, year) VALUES (1445, 3.5, '9-1-2018', 'Computer Science', 'Matthew Yoon', '2', 2);
INSERT INTO greekLife.member_of (chapter_name, sid) VALUES ('Sigma Nu', 2);
INSERT INTO greekLife.serves_as (sid, position, term, chapter_name) VALUES (2, 'President', '2018-2019', 'Sigma Nu');
INSERT INTO greekLife.chapter_member (badge_number, gpa, join_date, major, name, sid, year) VALUES (10, 4.0, '9-1-2018', 'Computer Science', 'Jessica Kwok', '3', 3);
INSERT INTO greekLife.member_of (chapter_name, sid) VALUES ('Alpha Gamma Delta', 3);
INSERT INTO greekLife.serves_as (sid, position, term, chapter_name) VALUES (3, 'President', '2018-2019', 'Alpha Gamma Delta');
INSERT INTO greekLife.chapter_member (badge_number, gpa, join_date, major, name, sid, year) VALUES (1446, 3.25, '9-1-2018', 'Finance', 'Jason Shin', '4', 3);
INSERT INTO greekLife.member_of (chapter_name, sid) VALUES ('Sigma Nu', 4);
INSERT INTO greekLife.serves_as (sid, position, term, chapter_name) VALUES (4, 'Vice President', '2018-2019', 'Sigma Nu');
INSERT INTO greekLife.chapter_member (badge_number, gpa, join_date, major, name, sid, year) VALUES (11, 3.7, '9-1-2018', 'Marketing', 'Louie Tran', '5', 3);
INSERT INTO greekLife.member_of (chapter_name, sid) VALUES ('Alpha Gamma Delta', 5);
INSERT INTO greekLife.serves_as (sid, position, term, chapter_name) VALUES (5, 'Vice President', '2018-2019', 'Alpha Gamma Delta');


INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('2235 Murray Hill Rd', '1', 1);
INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('2235 Murray Hill Rd', '1', 2);
INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('2235 Murray Hill Rd', '1', 3);

use greekLife;
SELECT * from chapter c, chapter_member m WHERE NOT EXISTS (SELECT o.sid FROM member_of o WHERE o.sid=m.sid AND o.chapter_name=c.chapter_name AND o.sid NOT IN (SELECT l.sid FROM lives_in l, house_of h WHERE l.sid=m.sid AND l.address=h.address AND h.chapter_name=c.chapter_name));
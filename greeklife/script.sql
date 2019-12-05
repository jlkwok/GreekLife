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

INSERT INTO greekLife.chapter_member (badge_number, gpa, join_date, major, name, sid, year) VALUES (1444, 3.0, '9-1-2017', 'Computer Science', 'Kyle Boxeth', '100', 3);
INSERT INTO greekLife.member_of (chapter_name, sid) VALUES ('Sigma Nu', 101);
INSERT INTO greekLife.serves_as (sid, position, term, chapter_name) VALUES (101, 'New Member Educator', '2018-2019', 'Sigma Nu');
INSERT INTO greekLife.chapter_member (badge_number, gpa, join_date, major, name, sid, year) VALUES (1445, 3.5, '9-1-2018', 'Computer Science', 'Matthew Yoon', '101', 2);
INSERT INTO greekLife.member_of (chapter_name, sid) VALUES ('Sigma Nu', 102);
INSERT INTO greekLife.serves_as (sid, position, term, chapter_name) VALUES (102, 'President', '2018-2019', 'Sigma Nu');
INSERT INTO greekLife.chapter_member (badge_number, gpa, join_date, major, name, sid, year) VALUES (10, 4.0, '9-1-2018', 'Computer Science', 'Jessica Kwok', '102', 3);
INSERT INTO greekLife.member_of (chapter_name, sid) VALUES ('Alpha Gamma Delta', 103);
INSERT INTO greekLife.serves_as (sid, position, term, chapter_name) VALUES (103, 'President', '2018-2019', 'Alpha Gamma Delta');
INSERT INTO greekLife.chapter_member (badge_number, gpa, join_date, major, name, sid, year) VALUES (1446, 3.25, '9-1-2018', 'Finance', 'Jason Shin', '104', 3);
INSERT INTO greekLife.member_of (chapter_name, sid) VALUES ('Sigma Nu', 104);
INSERT INTO greekLife.serves_as (sid, position, term, chapter_name) VALUES (104, 'Vice President', '2018-2019', 'Sigma Nu');
INSERT INTO greekLife.chapter_member (badge_number, gpa, join_date, major, name, sid, year) VALUES (11, 3.7, '9-1-2018', 'Marketing', 'Louie Tran', '105', 3);
INSERT INTO greekLife.member_of (chapter_name, sid) VALUES ('Alpha Gamma Delta', 105);
INSERT INTO greekLife.serves_as (sid, position, term, chapter_name) VALUES (105, 'Vice President', '2018-2019', 'Alpha Gamma Delta');

INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('2235 Murray Hill Rd', '101', 1);
INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('2235 Murray Hill Rd', '101', 2);
INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('11428 Cedar Glen Parkway', '101', 3);
INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('2235 Murray Hill Rd', '102', 2);
INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('11428 Cedar Glen Parkway', '104', 3);

INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('101 Carlton Rd', '103', 1);
INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('101 Carlton Rd', '103', 2);
INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('101 Carlton Rd', '103', 3);
INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('101 Carlton Rd', '105', 1);
INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('101 Carlton Rd', '105', 2);
INSERT INTO greekLife.lives_in (address, sid, year) VALUES ('101 Carlton Rd', '105', 3);

INSERT INTO greekLife.philanthropy (date, event_name, budget, cause, location, money_raised, partner, ticket_price, total_attendance) VALUES ('12-12-2019', 'Pasta Nachos', 1000, 'Hunger', 'SS', 2500, 'Habitat For Humanity', 10, 250);
INSERT INTO greekLife.hosts (chapter_name, date, event_name) VALUES ('Sigma Nu', '12-12-2019', 'Pasta Nachos');
INSERT INTO greekLife.hosts (chapter_name, date, event_name) VALUES ('Alpha Gamma Delta', '12-12-2019', 'Pasta Nachos');

use greekLife;
SELECT * FROM chapter c WHERE NOT EXISTS (SELECT o.sid FROM member_of o, chapter_member m WHERE o.sid=m.sid AND o.chapter_name=c.chapter_name AND o.sid NOT IN (SELECT l.sid FROM lives_in l, house_of h WHERE l.year=m.year AND l.sid=m.sid AND l.address=h.address AND h.chapter_name=c.chapter_name));
INSERT INTO users (birthday, description, email, enabled, name, password, surname, time_created, username) VALUES
('2022-01-22', 'I am a new user1', 'khan@com', 1, 'khagani', '{noop}khan', 'abdullayev', '2021-04-30', 'khan'),
('2023-02-12', 'I am a new user2', 'adam@com', 1, 'adam', '{noop}adam', 'aliyev', '2022-01-22', 'adam'),
('2020-03-02', 'I am a new user3', 'dev@com', 1, 'developer', '{noop}dev', 'babayev', '2023-02-12', 'dev'),
('2021-04-30', 'I am a new user4', 'main@com', 1, 'main_admin', '{noop}mainadmin', 'rzayev', '2022-01-22', 'mainadmin');

INSERT INTO authorities (authority, enabled, username) VALUES
('user', 1, 'adam'), ('user', 1, 'khan'), ('admin', 1, 'dev'), ('admin', 1, 'mainadmin');

INSERT INTO groups_of_users (description, enabled, name, time_created, create_by_id) VALUES
('First_Group', 1, 'm1452a', '2022-01-01', 1),
('second_Group', 1, '1456a', '2017-10-21', 2),
('third_Group', 1, '1212r', '2013-04-17', 3);

INSERT INTO course (description, enabled, name, time_created, create_by_id) VALUES
('course_1', 1, 'c_1', '2022-01-12', '1'),
('course_2', 1, 'c_2', '2022-03-11', '2'),
('course_3', 0, 'c_3', '2022-05-21', '3'),
('course_4', 1, 'c_4', '2022-06-23', '4'),
('course_5', 0, 'c_5', '2022-08-21', '1');
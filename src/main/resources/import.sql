insert into city_table values (1, 'PAR', 'PARIS'), (2, 'LON', 'LONDON'), (3, 'BER', 'BERLIN'), (4, 'MAD', 'MADRID');

insert into player_table values (1, 'zios@gmail.com', 'zakaria', null, 'kaoukab', 'zios', null, 'zios', null, null);

insert into pitch_table values (1, 'Pitch 1', 1567, 10);
insert into pitch_table values (2, 'Pitch 2', 1562, 12);
insert into pitch_table values (3, 'Pitch 3', 1564, 22);

insert into team_table (id, code, name)  values (1, 'RMA', 'Real Madrid');
insert into team_table (id, code, name)  values (2, 'FCB', 'Barcelona');
insert into team_table (id, code, name)  values (3, 'BAY', 'Bayern munchen');
insert into team_table (id, code, name)  values (4, 'JUV', 'Juventus');
insert into team_table (id, code, name)  values (5, 'ARS', 'Arsenal');
insert into team_table (id, code, name)  values (6, 'MAN', 'Manchester United');
insert into team_table (id, code, name)  values (7, 'CHE', 'Chelsea');
insert into team_table (id, code, name)  values (8, 'ATM', 'Athletic Madrid');
insert into team_table (id, code, name)  values (9, 'DOR', 'Boroussia Dortmund');

insert into address_table values (1, 5678, 1);
insert into address_table values (2, 5678, 2);
insert into address_table values (3, 12030, 1 );


INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, host_id, guest_id, pitch_id) VALUES ('1', '2018-06-04 00:00:00', '0', '0', 'Match 1', '1', 1, 2, 1);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, host_id, guest_id, pitch_id) VALUES ('2', '2018-06-03 00:00:00', '0', '0', 'Match 2', '2', 4, 3, 2);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, host_id, guest_id, pitch_id) VALUES ('3', '2018-06-03 00:00:00', '0', '0', 'Match 3', '1', 5, 6, 1);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, host_id, guest_id, pitch_id) VALUES ('4', '2018-06-04 00:00:00', '0', '0', 'Match 4', '3', 7, 8, 3);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, host_id, guest_id, pitch_id) VALUES ('5', '2018-06-04 00:00:00', '0', '0', 'Match 5', '3', 9, 1, 1);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, host_id, guest_id, pitch_id) VALUES ('6', '2018-06-03 00:00:00', '0', '0', 'Match 6', '1', 3, 6, 1);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, host_id, guest_id, pitch_id) VALUES ('7', '2018-06-03 00:00:00', '0', '0', 'Match 7', '2', 5, 2, 3);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, host_id, guest_id, pitch_id) VALUES ('8', '2018-06-03 00:00:00', '0', '0', 'Match 8', '1', 8, 9, 2);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, host_id, guest_id, pitch_id) VALUES ('9', '2018-06-03 00:00:00', '0', '0', 'Match 9', '2', 7, 4, 3);


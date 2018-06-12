
insert into address_table values (1, "Temara", 12030);
insert into address_table values (2, "Paris", 12030);
insert into address_table values (3, "Tokyo", 12030);

insert into player_table values (1, 'zios@gmail.com', 'zakaria', null, 'kaoukab', 'zios', null, 'zios', 1, null);

insert into pitch_table values (1, 'Pitch 1', 1567, 10);
insert into pitch_table values (2, 'Pitch 2', 1562, 8);
insert into pitch_table values (3, 'Pitch 3', 1564, 12);

insert into team_table (id, code, name)  values (1, 'RMA', 'Real Madrid');
insert into team_table (id, code, name)  values (2, 'FCB', 'Barcelona');
insert into team_table (id, code, name)  values (3, 'BAY', 'Bayern munchen');
insert into team_table (id, code, name)  values (4, 'JUV', 'Juventus');
insert into team_table (id, code, name)  values (5, 'ARS', 'Arsenal');
insert into team_table (id, code, name)  values (6, 'MAN', 'Manchester United');
insert into team_table (id, code, name)  values (7, 'CHE', 'Chelsea');
insert into team_table (id, code, name)  values (8, 'ATM', 'Athletic Madrid');
insert into team_table (id, code, name)  values (9, 'DOR', 'Boroussia Dortmund');




INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, pitch_id, players_count, available_places) VALUES ('1', '2018-06-06 00:00:00', '0', '0', 'Match 1', '1', 1, 10, 10);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, pitch_id, players_count, available_places) VALUES ('2', '2018-06-06 00:00:00', '0', '0', 'Match 2', '2', 2, 10, 10);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, pitch_id, players_count, available_places) VALUES ('3', '2018-06-05 00:00:00', '0', '0', 'Match 3', '1', 1, 14, 14);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, pitch_id, players_count, available_places) VALUES ('4', '2018-06-05 00:00:00', '0', '0', 'Match 4', '3', 3, 14, 14);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, pitch_id, players_count, available_places) VALUES ('5', '2018-06-05 00:00:00', '0', '0', 'Match 5', '3', 2, 14, 12);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, pitch_id, players_count, available_places) VALUES ('6', '2018-06-06 00:00:00', '0', '0', 'Match 6', '1', 1, 22, 15);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, pitch_id, players_count, available_places) VALUES ('7', '2018-06-07 00:00:00', '0', '0', 'Match 7', '2', 3, 14, 14);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, pitch_id, players_count, available_places) VALUES ('8', '2018-06-07 00:00:00', '0', '0', 'Match 8', '1', 2, 22, 11);
INSERT INTO match_table (id, date, guest_goals, host_goals, label, address_id, pitch_id, players_count, available_places) VALUES ('9', '2018-06-07 00:00:00', '0', '0', 'Match 9', '2', 3, 10, 1);


# --- Sample dataset

# --- !Ups

insert into baby_sitter (id,first_name,last_name,birthday, phone, email, picture_url,basic_info, favorited, number_of_parent_recommendations) values (  1,'Matti','Paananen',NOW(), '+358401234567', 'matti@expresscare.com', '/assets/images/babysitters/1.jpg', 'I am a sports fan. Whether it is football, soccer, baseball or whateverball, I can handle it!', true, 3);
insert into baby_sitter (id,first_name,last_name,birthday, phone, email, picture_url,basic_info, favorited, number_of_parent_recommendations) values (  2,'Pekka','Paananen',NOW(), '+358411234589', 'pekka@expresscare.com', '/assets/images/babysitters/2.jpg', 'I am really fond of cooking (and) animals', true, 2);
insert into baby_sitter (id,first_name,last_name,birthday, phone, email, picture_url,basic_info, favorited, number_of_parent_recommendations) values (  3,'Reino','Tulikoura',NOW(), '+358401234589', 'reino@expresscare.com', '/assets/images/babysitters/3.jpg', 'I love animals and cooking.', false, 0);
insert into baby_sitter (id,first_name,last_name,birthday, phone, email, picture_url,basic_info, favorited, number_of_parent_recommendations) values (  4,'Äestäjä','Paananen',NOW(), '+358411234567', 'äestäjä@expresscare.com', '/assets/images/babysitters/4.jpg', 'I love cooking and stuff.', true, 5);

insert into baby_sitter_available (id,baby_sitter_id,start_time,end_time, requested, agreed) values (1, 1, '2012-05-01 12:12:12', '2012-05-13 12:12:12', false, false);
insert into baby_sitter_available (id,baby_sitter_id,start_time,end_time, requested, agreed) values (2, 2, '2012-05-05 12:12:12', '2012-06-01 12:12:12', false, false);
insert into baby_sitter_available (id,baby_sitter_id,start_time,end_time, requested, agreed) values (3, 3, '2012-05-01 12:12:12', '2012-05-14 12:12:12', false, false);
insert into baby_sitter_available (id,baby_sitter_id,start_time,end_time, requested, agreed) values (4, 4, '2012-05-13 12:12:12', '2012-06-12 12:12:12', false, false);

insert into parent (id,first_name,last_name,birthday,last_latitude,last_longitude,has_requested,last_start,last_end) values (1,'Testi','Kayttaja',NOW(), 60.180801306334295, 24.832318727734446, false, NOW(), NOW());


# --- !Downs

delete from baby_sitter;
delete from baby_sitter_available;
delete from parent;

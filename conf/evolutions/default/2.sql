# --- Sample dataset

# --- !Ups

insert into baby_sitter (id,first_name,last_name,birthday, phone, email, picture_url) values (  1,'Matti','Paananen',NOW(), '+358401234567', 'matti@expresscare.com', '/assets/images/babysitters/1.jpg');
insert into baby_sitter (id,first_name,last_name,birthday, phone, email, picture_url) values (  2,'Pekka','Paananen',NOW(), '+358411234589', 'pekka@expresscare.com', '/assets/images/babysitters/2.jpg');
insert into baby_sitter (id,first_name,last_name,birthday, phone, email, picture_url) values (  3,'Reino','Tulikoura',NOW(), '+358401234589', 'reino@expresscare.com', '/assets/images/babysitters/3.jpg');
insert into baby_sitter (id,first_name,last_name,birthday, phone, email, picture_url) values (  4,'Äestäjä','Paananen',NOW(), '+358411234567', 'äestäjä@expresscare.com', '/assets/images/babysitters/4.jpg');

insert into baby_sitter_available (id,baby_sitter_id,start_time,end_time, requested, agreed) values (1, 1, '2012-05-01 12:12:12', '2012-05-10 12:12:12', false, false);
insert into baby_sitter_available (id,baby_sitter_id,start_time,end_time, requested, agreed) values (2, 1, '2012-05-05 12:12:12', '2012-06-01 12:12:12', false, false);
insert into baby_sitter_available (id,baby_sitter_id,start_time,end_time, requested, agreed) values (3, 2, '2012-05-01 12:12:12', '2012-05-14 12:12:12', false, false);
insert into baby_sitter_available (id,baby_sitter_id,start_time,end_time, requested, agreed) values (4, 2, '2012-05-13 12:12:12', '2012-06-01 12:12:12', false, false);

insert into parent (id,first_name,last_name,birthday,last_latitude,last_longitude) values (1,'Testi','Kayttaja',NOW(), 60.180801306334295, 24.832318727734446);


# --- !Downs

delete from baby_sitter;
delete from baby_sitter_available;
delete from parent;

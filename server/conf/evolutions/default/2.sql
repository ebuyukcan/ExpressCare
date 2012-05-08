# --- Sample dataset

# --- !Ups

insert into baby_sitter (id,first_name,last_name,birthday, phone) values (  1,'Matti','Paananen',NOW(), '+358401234567');
insert into baby_sitter (id,first_name,last_name,birthday, phone) values (  2,'Pekka','Paananen',NOW(), '+358411234589');
insert into baby_sitter (id,first_name,last_name,birthday, phone) values (  3,'Reino','Tulikoura',NOW(), '+358401234589');
insert into baby_sitter (id,first_name,last_name,birthday, phone) values (  4,'Äestäjä','Paananen',NOW(), '+358411234567');

insert into baby_sitter_available (id,baby_sitter_id,start_time,end_time, requested, agreed) values (1, 1, '2012-05-01 12:12:12', '2012-05-10 12:12:12', false, false);
insert into baby_sitter_available (id,baby_sitter_id,start_time,end_time, requested, agreed) values (2, 1, '2012-05-14 12:12:12', '2012-06-01 12:12:12', false, false);
insert into baby_sitter_available (id,baby_sitter_id,start_time,end_time, requested, agreed) values (3, 2, '2012-05-01 12:12:12', '2012-05-12 12:12:12', false, false);
insert into baby_sitter_available (id,baby_sitter_id,start_time,end_time, requested, agreed) values (4, 2, '2012-05-13 12:12:12', '2012-06-01 12:12:12', false, false);

# --- !Downs

delete from baby_sitter;
delete from baby_sitter_available;

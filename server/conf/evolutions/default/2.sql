# --- Sample dataset

# --- !Ups

insert into baby_sitter (id,first_name,last_name,birthday) values (  1,'Matti','Paananen',NOW());
insert into baby_sitter (id,first_name,last_name,birthday) values (  2,'Pekka','Paananen',NOW());
insert into baby_sitter (id,first_name,last_name,birthday) values (  3,'Reino','Tulikoura',NOW());
insert into baby_sitter (id,first_name,last_name,birthday) values (  4,'Äestäjä','Paananen',NOW());

# --- !Downs

delete from baby_sitter;

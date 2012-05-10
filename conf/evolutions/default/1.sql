# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table baby_sitter (

  id                        bigint not null,

  first_name                varchar(255),

  last_name                 varchar(255),

  birthday                  timestamp,

  video                     varchar(255),

  basic_info                varchar(255),

  description               varchar(255),

  location                  varchar(255),
  
  phone		                varchar(255),
  
  email		                varchar(255),

  constraint pk_baby_sitter primary key (id))

;

create table parent (

  id                        bigint not null,

  first_name                varchar(255),

  last_name                 varchar(255),

  birthday                  timestamp,

  last_latitude              varchar(255),

  last_longitude             varchar(255),

  constraint pk_parent primary key (id))

;

create table baby_sitter_available (

  id                        bigint not null,

  baby_sitter_id            bigint,

  start_time                timestamp,

  end_time                  timestamp,
  
  requested					boolean,
  
  agreed					boolean,

  constraint pk_baby_sitter_available primary key (id))

;



create sequence baby_sitter_seq;

create sequence parent_seq;

create sequence baby_sitter_available_seq;



alter table baby_sitter_available add constraint fk_baby_sitter_available_babyS_1 foreign key (baby_sitter_id) references baby_sitter (id) on delete restrict on update restrict;

create index ix_baby_sitter_available_babyS_1 on baby_sitter_available (baby_sitter_id);






# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;



drop table if exists baby_sitter;

drop table if exists parent;

drop table if exists baby_sitter_available;



SET REFERENTIAL_INTEGRITY TRUE;



drop sequence if exists baby_sitter_seq;

drop sequence if exists parent_seq;

drop sequence if exists baby_sitter_available_seq;




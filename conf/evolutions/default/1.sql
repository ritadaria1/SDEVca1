# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table category (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_category primary key (id)
);

create table category_project (
  category_id                   bigint not null,
  project_id                    bigint not null,
  constraint pk_category_project primary key (category_id,project_id)
);

create table project (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  description                   varchar(255),
  department                    varchar(255),
  constraint pk_project primary key (id)
);

create table user (
  role                          varchar(255),
  email                         varchar(255) not null,
  f_name                        varchar(255),
  l_name                        varchar(255),
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table category_project add constraint fk_category_project_category foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_category_project_category on category_project (category_id);

alter table category_project add constraint fk_category_project_project foreign key (project_id) references project (id) on delete restrict on update restrict;
create index ix_category_project_project on category_project (project_id);


# --- !Downs

alter table category_project drop constraint if exists fk_category_project_category;
drop index if exists ix_category_project_category;

alter table category_project drop constraint if exists fk_category_project_project;
drop index if exists ix_category_project_project;

drop table if exists category;

drop table if exists category_project;

drop table if exists project;

drop table if exists user;


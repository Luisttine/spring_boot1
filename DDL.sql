drop schema if exists spring;

drop user if exists 'user'@'localhost';

create schema spring;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on spring.* to user@'localhost';

use spring;

create table emp_empregado (
  emp_id bigint primary key auto_increment,
  emp_nome_completo varchar(100) not null,
  emp_ctps bigint not null,
  emp_data_hora_cadastro datetime not null,
  emp_email varchar(30) not null,
  emp_carga_horaria float
);

insert into emp_empregado (emp_nome_completo, emp_ctps, emp_data_hora_cadastro, emp_email)
  values  ('Charles Smith', 12345678910, current_timestamp(), 'chsmith@email.com'),
          ('Ann Doe', 23456743212, current_timestamp(), 'anndoe@email.com');

select * from tab;

drop table userlogin;
create table user_login(id     varchar2(10),
                        passwd varchar2(30),
                        name   varchar2(50));

alter table user_login add constraint user_pk primary key(id);

drop table boards;
create table boards(board_no number not null,
                    title    varchar2(100) not null,
                    content  varchar2(300) not null,
                    writer   varchar2(10) not null,
                    creation_date date,
                    orig_no  number);
                    
                    
alter table boards add constraint board_pk primary key(board_no);



insert into user_login values('user1','1234','inho');
insert into user_login values('user2','1234','user2');
insert into user_login values('admin','1234','admin');

select * from user_login;

insert into boards values (1, 'titel1', 'content1', 'user1', sysdate, null);
insert into boards values (2, 'titel1', 'content1', 'user1', sysdate, null);
insert into boards values (3, 'titel1', 'content1', 'user1', sysdate, 1);
insert into boards values (4, 'titel1', 'content1', 'user1', sysdate, 2);

select * from boards;

select * from boards where orig_no=?;


select * from boards;


alter table boards modify title null;

update boards
set title = 'titel1',
content = 'content1'
where board_no = 7;

select * from boards;


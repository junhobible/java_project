select * from member

select id from member

select id, pw from member


select id, name from member

select id, tell from member

--  where 은 너무 하기 쉽다.
select * from member where id = 'park1'

 select id, tell from member where id = 'kim'
 
 
 select * from member where pw ='park' and id ='park';
 
-- C : create , R : read , U : update , D : delete

-- insert : ����

 insert into member values ('summer','summer','summer','summer');
 
 select * from member where id ='summer';
 
--  winter, spring �� �־� �˻��غ�����.

 insert into member values ('winter','winter','winter','winter');
 
 insert into member values ('spring','spring','spring','spring');
 
 select * from member where id = 'winter'; 
 select * from member where id = 'spring';

-- ����(update)

update member set tell = '999' where id = 'winter';
-- update ���̺�� set ������ �� where ����
select * from member where name = 'hahahah';

update member set name = 'hahahah' where id = 'winter';


update member set name = 'gogogo', tell = 'ringring' where id = 'winter'; 
select * from member where name ='gogogo';

-- ����(delete) : record ������ �����ȴ�!!!!

delete from member where id = 'park';

select * from member where id = 'park';

-- 

update member set tell = null where id = 'winter';
select * from member where id = 'winter';

-- 과연 그럴까?
select * from member where tell is null; 

-- table movies 

insert into movies values ('100', 'kisangchung', 'horror', '34.5%','bong');
insert into movies values ('200', '1917', 'war', '40.1%','sam');
insert into movies values ('300', 'Invisible Man', 'difficult', '15.5%','lee');
insert into movies values ('400', 'The Gentlemen', 'funr', '11.4%','guy');

insert into movies values ('500', 'Cloet','action','8.9%', 'lee');	

select * from movies;
select * from movies where id = '200';
select title, prepay from movies where id = '300';
select title, director, prepay from movies where content = 'action';
select title, content from movies where director = 'lee' and id = '300';

update movies set content = 'action' where director = 'sam';
select * from movies where director = 'sam';

update movies set prepay = '57.2%', content ='social' where director = 'bong';
select * from movies where director = 'bong';

update movies set prepay = null where id = '500';
select * from movies where prepay is null;

delete from movies where director = 'sam';
select * from movies where director = 'sam';

update movies set title = 'Closet' where id ='500';

update movies set title = 'Closet' where id = '500';

create 
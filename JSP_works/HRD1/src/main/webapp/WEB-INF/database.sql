create table member_tbl_02 (
	custno number(6) not null primary key, 
	custname varchar2(20),
	phone varchar2(13),
	address varchar2(60),
	joindate date,
	grade char(1),
	city char(2)
);

insert into member_tbl_02
	values(100001, '김행복', '010-1111-2222', '서울 동대문구 휘경1동', '20151202', 'A', '01');
insert into member_tbl_02
	values(100002, '이축복', '010-1111-3333', '서울 동대문구 휘경2동', '20151206', 'B', '01');
insert into member_tbl_02
	values(100003, '장믿음', '010-1111-4444', '울릉군 울릉읍 독도1리', '20151201', 'B', '30');
insert into member_tbl_02
	values(100004, '최사랑', '010-1111-5555', '울릉군 울릉읍 독도2리', '20151113', 'A', '30');
insert into member_tbl_02
	values(100005, '진평화', '010-1111-6666', '제주도 제주시 외나무골', '20151225', 'B', '60');
insert into member_tbl_02
	values(100006, '차공단', '010-1111-7777', '제주도 제주시 감나무골', '20151211', 'C', '69');
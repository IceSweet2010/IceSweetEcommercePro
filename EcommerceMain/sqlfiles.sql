
--1. 用户表 user
create table user(
	userid varchar(20) not null,
	tel varchar(20) not null,
	password varchar(20) not null,
	ortherinfo varchar(50) DEFAULT'',
	PRIMARY KEY(userid)
);

insert into user values('000','fjb','123456','i have nothing to say');


--2. 用户信息表 userinfo
create table userinfo(
	userid varchar(20) not null,
	tel varchar(20) not null,
	username varchar(20) DEFAULT'', 
	email varchar(50) DEFAULT'',
	ortherinfo varchar(50) DEFAULT'',
	PRIMARY KEY(userid)
);
 
--3. 用户收货地址表 useraddress
create table useraddress(
	userid varchar(20) not null,
	address varchar(100) not null,
	ifdefault int(1) DEFAULT 0
);

alter table useraddress add index index_userid(userid);

--4. 店铺商品上架信息表 commaininfo
create table commaininfo(
	shopid varchar(20) not null, 
	categoryid varchar(20) not null,
	comid varchar(20) not null,
	showphoto varchar(100) not null, 
	shortmsg varchar(100) not null, 
	ifrecommend int(1) DEFAULT 0,
	addtime datetime not null,
	PRIMARY KEY(shopid,comid)
);

--5. 商品参数表 comtotalinfo
create table comtotalinfo(
	shopid varchar(20) not null, 
	categoryid varchar(20) not null,
	comid varchar(20) not null,
	photos varchar(500) not null, 
	comparas varchar(500) not null, 
	PRIMARY KEY(shopid,comid)
);

--6. 首页推荐商品表（由平台维护） indexrecommend
create table indexrecommend(
	shopid varchar(20) not null, 
	comid varchar(20) not null,
	showphoto varchar(100) not null, 
	shortmsg varchar(100) not null, 
	begintime datetime not null,
	endtime datetime not null,
	PRIMARY KEY(shopid,comid)
);

--7. 店铺推荐商品表（由平台维护） indexrecommendofcatagory
create table indexrecommendofcatagory(
	shopid varchar(20) not null, 
	categoryid varchar(20) not null,
	comid varchar(20) not null,
	showphoto varchar(100) not null, 
	shortmsg varchar(100) not null, 
	begintime datetime not null,
	endtime datetime not null,
	PRIMARY KEY(shopid,comid)
);

--8. 商品详情表 comdetials
create table comdetials(
	shopid varchar(20) not null, 
	categoryid varchar(20) not null,
	comid varchar(20) not null,
	detials text default '', 
	PRIMARY KEY(shopid,comid)
);

--9. 商品评价表 evaluation
create table evaluation(
	shopid varchar(20) not null, 
	categoryid varchar(20) not null,
	comid varchar(20) not null,
	goodlevel int(1) default 5, 
	evaluations varchar(500) default '', 
	PRIMARY KEY(shopid,comid)
);

--10. 购物车表 shopcart
create table shopcart(
	cartid Varchar(40) not null,
	userid varchar(20) not null,
	comid varchar(20) not null,
	selectedparas varchar(500) not null, 
	quantity int not null,
	addtime datetime not null,
	PRIMARY KEY(cartid)
);

alter table shopcart add index index_shopcart(userid);

--11. 订单表 userorder
create table userorder(
	orderid Varchar(40) not null,
	userid varchar(20) not null,
	comid varchar(20) not null,
	selectedparas varchar(500) not null, 
	quantity int not null,
	address varchar(100) not null,
	recipient varchar(20) not null,
	recipientphone varchar(20) not null,
	cost Decimal(12,2) not null,
	orderdate datetime not null,
	primary key(orderid)
);

alter table userorder add index index_userorder(userid);


















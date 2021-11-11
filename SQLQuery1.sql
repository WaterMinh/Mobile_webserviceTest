Create database ExamWebservice
Go
Use ExamWebservice
Go

Create table TblMobile(
	MobId int identity primary key,
	MobName varchar(100) ,
	Producer varchar(100), 
	Price float, 
	Description varchar(500)

);
GO
Insert into TblMobile values ('Iphone', 'FOXCONN', 25000000, 'OK OK OK')
select * from TblMobile

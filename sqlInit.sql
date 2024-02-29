

CREATE TABLE SHOE (
shoeID int NOT NULL,
year year,
yearPurchased year,
make varchar(20) NOT NULL,
model varchar(40) NOT NULL,
shoeType varchar(40),
size int NOT NULL,
colorwayName varchar(50),
primaryColor varchar(50) NOT NULL,
secondaryColor varchar(50),
ownership boolean,
dateSold date,
primary key (shoeID)
);

CREATE TABLE ENTRY (
shoeID int NOT NULL,
dateWorn date NOT NULL,
primary key (shoeID, dateWorn),
foreign key (shoeID) references SHOE(shoeID)
);


INSERT INTO SHOE VALUES
( 1, 2016, 2016, 'Nike', 'Air Jordan 1', 'Casual', 12, 'Bred', 'Black', 'Red', true, NULL)
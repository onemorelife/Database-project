CONNECT 'jdbc:derby:PublisherDB;create=true';

-- drop tables (ignore errors if they don't exist)
DROP TABLE Anime;
DROP TABLE Studio;
DROP TABLE Merchandise; 

-- create Anime table
CREATE TABLE Anime
(
    Series VARCHAR(40), 
	Code VARCHAR(4), 
	Primier DATE,
	Episodes INT,
	Demographic VARCHAR(40)
);

-- insert data into Anime table
INSERT INTO Anime VALUES
('One Punch Man', 'OPMD', '2015-10-05', 12, 'Seinen');   	 

INSERT INTO Anime VALUES
('Code Geass', 'CGCC', '2006-10-05', 50, 'Shounen');

INSERT INTO Anime VALUES
('Cowboy Bebop', 'CBBP', '1998-04-03', 26, 'Seinen');

-- view data in Anime table (temporary for viewing purpose)
SELECT * FROM Anime;

-- create Studio table
CREATE TABLE Studio
(
	Studio VARCHAR(40),
	Code VARCHAR(4), 
	Debit DOUBLE,
	Credit DOUBLE,
	Billing DATE	
);

-- insert data into Studio table
INSERT INTO Studio VALUES
('Madhouse', 'OPMD', 250000, 250000, '2015-09-01');   	 

INSERT INTO Studio VALUES
('Sunrise', 'CGCC', 956720, 956720, '2006-08-15');  

INSERT INTO Studio VALUES
('Sunrise', 'CBBP', 956720, 956720, '2006-08-15');  

-- view data in Studio table
SELECT * FROM Studio; 

-- create Merchandisetable 
CREATE TABLE Merchandise
(
	Product VARCHAR(40),
	Inventory INT,
	Sold INT,
	Code VARCHAR(4),
	Profit DOUBLE
);

INSERT INTO Merchandise VALUES
('Plush Toy', 400, 2500, 'OPMB', 52879.36);   	 

INSERT INTO Merchandise VALUES
('OST', 900, 1200, 'CGCC', 6450.58);   	 

INSERT INTO Merchandise VALUES
('Poster', 300, 600, 'CBBP', 9000.11);   	 

-- view data in Merchandise table
SELECT * FROM Merchandise; 

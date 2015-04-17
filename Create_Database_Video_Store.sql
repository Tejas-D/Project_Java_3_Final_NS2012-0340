/********************************************************************
*       Filename: Create_Database_Video_Store						*
*       Author: Tejas Dwarkaram                                     *
*       Date: 20 July 2012											*
*       Description: Creating the database for the video store,     *
*					as well as adding the tables,and inserting the  *
*					sample data										*
********************************************************************/
USE master
GO

IF EXISTS(SELECT name FROM master.dbo.sysdatabases
		WHERE name = 'video_store')
		DROP DATABASE video_store
		GO

--Creating the database 
CREATE DATABASE video_store
ON PRIMARY
(
	NAME = 'video_store_data',
	FILENAME = 'C:\video_store.mdf', 
	SIZE = 10,
	MAXSIZE = UNLIMITED,
	FILEGROWTH = 2
)
--creating the log file for the database
LOG ON
(
	
	NAME = 'video_store_log',
	FILENAME = 'C:\video_store_log.ldf',
	SIZE =10,
	MAXSIZE = UNLIMITED,
	FILEGROWTH = 2
)
GO

USE video_store
GO

--creating all of the tables for the database
CREATE TABLE genre
(
	genre_id int NOT NULL IDENTITY(1, 1),
	genre_name VARCHAR(40) NOT NULL,
	CONSTRAINT prim_genreId PRIMARY KEY(genre_id)
)
GO

CREATE TABLE movie
(
	movie_id INT NOT NULL IDENTITY(1, 1),
	movie_name VARCHAR(40) NOT NULL,
	movie_description VARCHAR(150) NULL,
	genre_id int NOT NULL,
	CONSTRAINT prim_movie_id PRIMARY KEY(movie_id),
	CONSTRAINT for_genre_id FOREIGN KEY(genre_id) REFERENCES genre(genre_id)
)
GO

CREATE TABLE users
(
	users_id INT NOT NULL IDENTITY(1, 1),
	users_name VARCHAR(15) NOT NULL,
	users_password VARCHAR(20) NOT NULL,
	CONSTRAINT prim_users_id PRIMARY KEY(users_id)
)
GO

--inserting the sample data into the tables on the database
INSERT INTO genre(genre_name)
VALUES ('Action'), ('Comedy'), ('Drama'), ('Thrill'), ('Suspense')
GO

INSERT INTO movie(movie_name, movie_description, genre_id)
VALUES ('Die Hard 4.0','Intense action movie starring the esteemed Bruce Willis', 1),
	('Hang Over 2','Crazy comedy movie about a bachelor party gone wrong ', 2),
	('The Expendables','Hardcore action movie with Salvestor Stallon', 1),
	('Prometheus','Brilliant movie shown as the prequel to the Aliens of AvP', 5),
	('Kings Speech', 'Movie about a vocally challenged King who gives the best speech of all time', 3)
GO

INSERT INTO users(users_name, users_password)
VALUES ('Tejas', 'gero_$000'),
	('Roland', 'Iceangel4%100'),
	('minal', 'bongani#g')
GO


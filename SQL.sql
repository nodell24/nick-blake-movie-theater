
create table Theater (
    Theater_Id INT,
    Theater_Name VARCHAR(64),
    Theater_Address VARCHAR(64),
    Theater_Zip CHAR(5),
    PRIMARY KEY(Theater_Id)
);

create table Movie(
    Movie_Id INT,
    Movie_Name VARCHAR(64),
    Movie_Type VARCHAR(64),
    Movie_Duration INT,
    PRIMARY KEY(Movie_Id)
);

create table Times(
    Time_Id INT,
    Time_Time VARCHAR(8),
    PRIMARY KEY(Time_id)
);

create table Movie_Times(
    Time_Id INT,
    Movie_Id INT,
    FOREIGN KEY(Time_Id) references Times,
    FOREIGN KEY(Movie_Id) references Movie,
    PRIMARY KEY(Time_Id,Movie_Id)
);

insert into Theater values(
1,'UTD Theater','800 W Campbell Rd','75080');
insert into Theater values(
2,'For Fun Movie Theater','518 W Arapaho Rd','75080');
insert into Theater values(
3,'Generic Drive in Theater','625 W Lookout Dr','75080');
insert into Theater values(
4,'Hard to Find Theater','1313 West Shore Dr','75080');
insert into Theater values(
5,'The Lost Theater','2200 Independence Pkwy,','75075');
insert into Theater values(
6,'Return of the Theater','3045 W 15th St','75075');
insert into Theater values(
7,'Theater be Back','2300 W Plano Pkwy','75075');
insert into Theater values(
8,'Moon Landing Theater','811 N Central Expy','75075');
insert into Theater values(
9,'Theater of the Ages','17717 Coit Rd','75252');
insert into Theater values(
10,'Yikes Theater','18208 Preston Rd Suite D12','75252');
insert into Theater values(
11,'Movie Watching Theater','17370 Preston Rd','75252');
insert into Theater values(
12,'Theater 4 U','7421 Frankford Rd','75252');
insert into Theater values(
13,'A Theater in Time','5401 W Park Blvd,','75093');
insert into Theater values(
14,'Theater X','6600 Columbine Way','75093');
insert into Theater values(
15,'Wow! Theater','5601 W Parker Rd','75093');
insert into Theater values(
16,'Exciting Place to View Movies','3601 Dallas Pkwy, Plano','75093');

insert into Movie values(
1,'The Shawshank Redemption','Drama',142);
insert into Movie values(
2,'The Godfather','Crime,Drama',175);
insert into Movie values(
3,'The Dark Knight','Action,Crime,Drama',152);
insert into Movie values(
4,'The Godfather: Part II','Crime,Drama',202);
insert into Movie values(
5,'Pulp Fiction','Crime,Drama',154);
insert into Movie values(
6,'Schindlers List','Biography,Drama,History',195);
insert into Movie values(
7,'Inception','Action,Adventure,Sci-fi',148);
insert into Movie values(
8,'Avengers: Endgame','Action,Adventure,Sci-fi',181);
insert into Movie values(
9,'The Matrix','Action,Sci-fi',136);
insert into Movie values(
10,'Spirited Away','Animation,Adventure,Family',125);
insert into Movie values(
11,'Saving Private Ryan','Drama,War',169);
insert into Movie values(
12,'Life Is Beautiful','Comedy,Drama,Romance',116);
insert into Movie values(
13,'Spider-Man: Into the Spider-Verse','Animation,Action,Adventure',117);
insert into Movie values(
14,'The Prestige','Drama,Mystery,Sci-fi',130);
insert into Movie values(
15,'Back to the Future','Adventure,Comedy,Sci-fi',116);
insert into Movie values(
16,'Alien','Horror,Sci-fi',117);

insert into Times values(
1,'10:00 AM');
insert into Times values(
2,'11:30 AM');
insert into Times values(
3,'12:15 PM');
insert into Times values(
4,'1:20 PM');
insert into Times values(
5,'2:00 PM');
insert into Times values(
6,'3:45 PM');
insert into Times values(
7,'4:05 PM');
insert into Times values(
8,'5:00 PM');
insert into Times values(
9,'6:10 PM');
insert into Times values(
10,'7:30 PM');
insert into Times values(
11,'8:45 PM');
insert into Times values(
12,'10:00 PM');
insert into Times values(
13,'10:40 PM');
insert into Times values(
14,'11:00 PM');
insert into Times values(
15,'11:35 PM');
insert into Times values(
16,'12:00 PM');

insert into MOVIE_TIMES values(
1,1);
insert into MOVIE_TIMES values(
4,1);
insert into MOVIE_TIMES values(
8,1);
insert into MOVIE_TIMES values(
12,1);

insert into MOVIE_TIMES values(
2,2);
insert into MOVIE_TIMES values(
5,2);
insert into MOVIE_TIMES values(
9,2);
insert into MOVIE_TIMES values(
13,2);

insert into MOVIE_TIMES values(
3,3);
insert into MOVIE_TIMES values(
6,3);
insert into MOVIE_TIMES values(
10,3);
insert into MOVIE_TIMES values(
13,3);

insert into MOVIE_TIMES values(
4,4);
insert into MOVIE_TIMES values(
7,4);
insert into MOVIE_TIMES values(
11,4);
insert into MOVIE_TIMES values(
14,4);

insert into MOVIE_TIMES values(
5,5);
insert into MOVIE_TIMES values(
8,5);
insert into MOVIE_TIMES values(
12,5);
insert into MOVIE_TIMES values(
15,5);

insert into MOVIE_TIMES values(
6,6);
insert into MOVIE_TIMES values(
9,6);
insert into MOVIE_TIMES values(
13,6);
insert into MOVIE_TIMES values(
16,6);

insert into MOVIE_TIMES values(
3,7);
insert into MOVIE_TIMES values(
8,7);
insert into MOVIE_TIMES values(
11,7);
insert into MOVIE_TIMES values(
16,7);

insert into MOVIE_TIMES values(
2,8);
insert into MOVIE_TIMES values(
5,8);
insert into MOVIE_TIMES values(
9,8);
insert into MOVIE_TIMES values(
11,8);

insert into MOVIE_TIMES values(
1,9);
insert into MOVIE_TIMES values(
4,9);
insert into MOVIE_TIMES values(
8,9);
insert into MOVIE_TIMES values(
12,9);

insert into MOVIE_TIMES values(
2,10);
insert into MOVIE_TIMES values(
5,10);
insert into MOVIE_TIMES values(
9,10);
insert into MOVIE_TIMES values(
13,10);

insert into MOVIE_TIMES values(
3,11);
insert into MOVIE_TIMES values(
6,11);
insert into MOVIE_TIMES values(
10,11);
insert into MOVIE_TIMES values(
14,11);

insert into MOVIE_TIMES values(
4,12);
insert into MOVIE_TIMES values(
7,12);
insert into MOVIE_TIMES values(
11,12);
insert into MOVIE_TIMES values(
15,12);

insert into MOVIE_TIMES values(
5,13);
insert into MOVIE_TIMES values(
8,13);
insert into MOVIE_TIMES values(
12,13);
insert into MOVIE_TIMES values(
16,13);

insert into MOVIE_TIMES values(
1,14);
insert into MOVIE_TIMES values(
7,14);
insert into MOVIE_TIMES values(
13,14);
insert into MOVIE_TIMES values(
15,14);

insert into MOVIE_TIMES values(
3,15);
insert into MOVIE_TIMES values(
8,15);
insert into MOVIE_TIMES values(
12,15);
insert into MOVIE_TIMES values(
13,15);

insert into MOVIE_TIMES values(
1,16);
insert into MOVIE_TIMES values(
2,16);
insert into MOVIE_TIMES values(
3,16);
insert into MOVIE_TIMES values(
4,16);



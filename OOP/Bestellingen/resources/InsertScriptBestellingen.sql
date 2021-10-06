USE bestellingen;

insert into klant(klantnaam, plaats) values  ('de Smet', 'Durgerdam'),
  ('Bruggeman','Maasbrug'),
 ( 'Schoenmaker','Durgerdam'),
 ( 'El Hamdaoui', 'Harlingen'),
 ( 'Jozefzoon', 'Monnikendijk'),
 ( 'Bekker', 'Haarlem');

insert into artikel values ('A1', 'Pennen', 'laag', 15, 8968);
insert into artikel values ('A2', 'Floppen', 'hoog', 23, 2354);
insert into artikel values ('A3', 'Koffieapparaat', 'hoog', 3489, 45);
insert into artikel values ('A4', 'Beeldscherm', 'hoog', 899, 230);
insert into artikel values ('A5', 'MacBook pro', 'hoog', 1299, 30);

insert into bestelling(klantnr, besteldatum) values (1,'2017/01/05'),
( 2,  '2017/03/03'),
(3, '2017/03/02'),
 ( 4,  '2017/03/12'),
 ( 5, '2017/03/24'),
 (6,  '2017/04/21'),
 (3, '2017/03/12'),
 ( 4,  '2017/03/16');


insert into bestelregel values (1, 'A1', 50);
insert into bestelregel values (1, 'A2', 25);
insert into bestelregel values (2, 'A3', 3);
insert into bestelregel values (3, 'A4', 12);
insert into bestelregel values (3, 'A1', 80);
insert into bestelregel values (4, 'A1', 100);
insert into bestelregel values (4, 'A4', 1);
insert into bestelregel values (4, 'A2', 60);
insert into bestelregel values (5, 'A3', 1);
insert into bestelregel values (5, 'A4', 5);
insert into bestelregel values (6, 'A1', 200);
insert into bestelregel values (7, 'A1', 20);
insert into bestelregel values (8, 'A5', 1);



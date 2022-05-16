--Dodavanje Korisnika
INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role)
VALUES ('Administrator' , 'lukasenko','belorusija','ALeksandar', 'Lukasenko', 'Muski', '02.05.1976.', 0);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role)
VALUES ('Dostavljac' , 'milance','milance','Milan', 'Milkic', 'Muski', '02.05.1986.', 1);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role)
VALUES ('Dostavljac' , 'nikola123','dostava','Nikola', 'Nikolic', 'Muski', '12.04.1968.', 1);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role)
VALUES ('Menadzer' , 'misa','menadzer','Misa', 'Miskovic', 'Muski', '02.07.1996.', 3);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role)
VALUES ('Menadzer' , 'srki123','menadzer','Srdjan', 'Srdanovic', 'Muski', '02.5.1993.', 3);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role, broj_sakupljenih_poena, tip_kupca)
VALUES ('Kupac' , 'kupac1','kupovina','Aleksa', 'Milanovic', 'Muski', '03.04.1996.', 2, 25, 0);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role, broj_sakupljenih_poena, tip_kupca)
VALUES ('Kupac' , 'kupac2','kupovina2','Zeljko', 'Zelenski', 'Muski', '03.06.1976.', 2, 0, 3);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role, broj_sakupljenih_poena, tip_kupca)
VALUES ('Kupac' , 'kupac3','kupovina3','Vladimir', 'Putin', 'Muski', '03.07.1986', 2, 0, 1);

--Dodavanje Artikala

INSERT INTO ARTIKAL(naziv, tip_hrane, kolicina, opis)
VALUES ('Origano', 0, 12,'Zacin');

INSERT INTO ARTIKAL(naziv, tip_hrane, kolicina, opis)
VALUES ('Piletina',0, 25, 'Hrana');

INSERT INTO ARTIKAL(naziv, tip_hrane, kolicina, opis)
VALUES ('Pepsi',1 , 12,'Pice.');

--Dodavanje Restorana
INSERT INTO RESTORAN(Id, Naziv, tip_restorana, Lokacija,menadzer)
VALUES(1,'Pizza-bar',1,'Skadarska 3', 4);

INSERT INTO RESTORAN(Id, Naziv, tip_restorana, Lokacija, menadzer)
VALUES(2,'Srbija',2,'Skadarska 18', 4);

--Dodavanje Komentara
INSERT INTO KOMENTAR(id_kupca, id_restorana, komentar, ocena)
VALUES('6', 1, 'Fenomenalna usluga.', 5 );

INSERT INTO KOMENTAR(id_kupca, id_restorana, komentar, ocena)
VALUES('7', 2, 'Jako losa usluga.', 1 );






















--Dodavanje Korisnika
INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role)
VALUES ('Korisnik' , 'lukasenko','belorusija','ALeksandar', 'Lukasenko', 'Muski', '02.05.1976.', 0);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role)
VALUES ('Korisnik' , 'milance','milance','Milan', 'Milkic', 'Muski', '02.05.1986.', 1);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role)
VALUES ('Korisnik' , 'nikola123','dostava','Nikola', 'Nikolic', 'Muski', '12.04.1968.', 1);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role)
VALUES ('Korisnik' , 'misa','menadzer','Misa', 'Miskovic', 'Muski', '02.07.1996.', 3);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role)
VALUES ('Korisnik' , 'srki123','menadzer','Srdjan', 'Srdanovic', 'Muski', '02.5.1993.', 3);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role, broj_sakupljenih_poena, tip_kupca)
VALUES ('Korisnik' , 'kupac1','kupovina','Aleksa', 'Milanovic', 'Muski', '03.04.1996.', 2, 25, 0);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role, broj_sakupljenih_poena, tip_kupca)
VALUES ('Korisnik' , 'kupac2','kupovina2','Zeljko', 'Zelenski', 'Muski', '03.06.1976.', 2, 0, 3);

INSERT INTO KORISNIK(DTYPE, username,lozinka, ime, prezime, pol, datum_rodjenja, role, broj_sakupljenih_poena, tip_kupca)
VALUES ('Korisnik' , 'kupac3','kupovina3','Vladimir', 'Putin', 'Muski', '03.07.1986', 2, 0, 1);

--Dodavanje Restorana
INSERT INTO RESTORAN(Naziv, tip_restorana, status, Lokacija,menadzer)
VALUES('Pizza-bar','Italijanski',0, 'Skadarska 23', null);

INSERT INTO RESTORAN(Naziv, tip_restorana, status, Lokacija, menadzer)
VALUES('Srbija','Srpski',1, 'Dobricina 18', null);
--Dodavanje Artikala

INSERT INTO ARTIKAL(naziv, tip_hrane, kolicina, opis,cena,restoran_id)
VALUES ('Origano', 'Jelo', 12,'Zacin', 15, 1);

INSERT INTO ARTIKAL(naziv, tip_hrane, kolicina, opis, cena, restoran_id)
VALUES ('Piletina','Jelo', 25, 'Hrana', 225,null);

INSERT INTO ARTIKAL(naziv, tip_hrane, kolicina, opis, cena, restoran_id)
VALUES ('Pepsi','Pice' , 12,'Pice.', 10,null);


--Dodavanje Komentara
INSERT INTO KOMENTAR(id_kupca, id_restorana, komentar, ocena)
VALUES('6', 1, 'Fenomenalna usluga.', 5 );

INSERT INTO KOMENTAR(id_kupca, id_restorana, komentar, ocena)
VALUES('7', 2, 'Jako losa usluga.', 1 );

INSERT INTO LOKACIJA(geografska_duzina,geografska_sirina, adresa )
VALUES(22.23, 25.64, 'Sarajevska 123');

INSERT INTO LOKACIJA(geografska_duzina,geografska_sirina, adresa )
VALUES(42.44, 45.64, 'Novosadska 18');






















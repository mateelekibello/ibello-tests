# namespace: Licencek
@licenses
Feature: Licenc kezelés

	@tulajdonos @ervenyes @engedelyez
	Scenario: Tulajdonos érvényes licencet engedélyez
		Given Licencek: van érvényes licenc
		And Licencek: bejelentkezem tulajdonosként
		When Licencek: megnyitom a licencek oldalt
		And Licencek: engedélyezem a licencem
		And Licencek: Kijelentkezek a Licencek oldalról
		Then Licencek: licenc engedélyezve lesz a felhasználónak

	@tulajdonos @ervenyes @visszavon
	Scenario: Tulajdonos érvényes licencet visszavon
		Given Licencek: van engedélyezett licencem
		And Licencek: bejelentkezem tulajdonosként
		When Licencek: megnyitom a licencek oldalt
		And Licencek: visszavonom az engedélyezett licencem
		Given Licencek: Kijelentkezek a Licencek oldalról
		Then Licencek: licenc visszavonva a felhasználótól

	@tulajdonos @ervenyes @engedelyez
	Scenario: Tulajdonos érvényes licencet engedélyez - ismét
		Given Licencek: van érvényes licenc
		And Licencek: bejelentkezem tulajdonosként
		When Licencek: megnyitom a licencek oldalt
		And Licencek: engedélyezem a licencem
		And Licencek: Kijelentkezek a Licencek oldalról
		Then Licencek: licenc engedélyezve lesz a felhasználónak

	@felhasznalo @visszaad
	Scenario: Felhasználó licencet visszaad
		Given Licencek: van engedélyezett licencem
		And Licencek: bejelentkezem felhasználóként
		When Licencek: megnyitom a licencek oldalt
		And Licencek: visszaadom a nekem adott licencet
		Then Licencek: a licenc visszakerül a tulajdonoshoz
		And Licencek: a licenc törlődik a listáról
		Given Licencek: Kijelentkezek a Licencek oldalról

	Scenario: Tulajdonos lejárt licencet engedélyez - teljes
		Given Licencek: bejelentkezem tulajdonosként
		And Licencek: van lejárt licenc
		When Licencek: megnyitom a licencek oldalt
		And Licencek: kilistáztatom a lejárt licenceket
		Then Licencek: a lejárt licencek is megjelennek a listában
		When Licencek: engedélyezem a lejárt licencem
		Then Licencek: lejárt licenc nem engedélyezhető
		Given Licencek: Kijelentkezek a Licencek oldalról

	Scenario: Licenc megrendelése - teljes
		Given Licencek: bejelentkezem tulajdonosként
		And Licencek: megnyitom a licencek oldalt
		When Licencek: megrendelem a licencem
		Then Licencek: a licenc megrendelő oldal megnyílik
		When Licencek: választok előfizetést
		And Licencek: áttekintem a megrendelést
		And Licencek: véglegesítem a megrendelést
		Then Licencek: a licenc meg van rendelve
		Given Licencek: Kijelentkezek a Licencek oldalról

	@lejart
	Scenario: Lejárt licencek megjelenítése
		Given Licencek: van lejárt licenc
		And Licencek: megnyitom a licencek oldalt
		When Licencek: kilistáztatom a lejárt licenceket
		Then Licencek: a lejárt licencek is megjelennek a listában

	@tulajdonos @lejart @engedelyez
	Scenario: Tulajdonos lejárt licencet engedélyez
		Given Licencek: van lejárt licenc
		And Licencek: engedélyezem a lejárt licencem
		Then Licencek: lejárt licenc nem engedélyezhető
		Given Licencek: Kijelentkezek a Licencek oldalról

	@megrendeles
	Scenario: Licenc megrendelése első lépés
		Given Licencek: megnyitom a licencek oldalt
		When Licencek: megrendelem a licencem
		Then Licencek: a licenc megrendelő oldal megnyílik

	Scenario: Licenc megrendelése második lépés
		Given Licencek: megnyitott licenc megrendelő ablak
		When Licencek: választok előfizetést
		And Licencek: áttekintem a megrendelést
		And Licencek: véglegesítem a megrendelést
		Then Licencek: a licenc meg van rendelve

	Scenario: Bejelentkezés tulajdonosként
		Given Licencek: bejelentkezem tulajdonosként

	Scenario: Bejelentkezés felhasználóként
		Given Licencek: bejelentkezem felhasználóként

	Scenario: Kijelentkezés
		Given Licencek: Kijelentkezek a Licencek oldalról

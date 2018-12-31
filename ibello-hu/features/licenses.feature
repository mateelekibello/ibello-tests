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

	@tulajdonos @lejart @engedelyez
	Scenario: Tulajdonos lejárt licencet engedélyez
		Given Licencek: van lejárt licenc
		And Licencek: engedélyezem a lejárt licencem
		Then Licencek: lejárt licenc nem engedélyezhető
		Given Licencek: Kijelentkezek a Licencek oldalról

	@tulajdonos @ervenyes @visszavon
	Scenario: Tulajdonos érvényes licencet visszavon
		Given Licencek: van engedélyezett licencem
		And Licencek: bejelentkezem tulajdonosként
		When Licencek: megnyitom a licencek oldalt
		And Licencek: visszavonom az engedélyezett licencem
		Given Licencek: Kijelentkezek a Licencek oldalról
		Then Licencek: licenc visszavonva a felhasználótól

	@felhasznalo @visszaad
	Scenario: Felhasználó licencet visszaad
		Given Licencek: van engedélyezett licencem
		And Licencek: bejelentkezem felhasználóként
		When Licencek: megnyitom a licencek oldalt
		And Licencek: visszaadom a nekem adott licencet
		Then Licencek: a licenc visszakerül a tulajdonoshoz
		And Licencek: a licenc törlődik a listáról
		Given Licencek: Kijelentkezek a Licencek oldalról

	@megrendeles
	Scenario: Licenc megrendelése első lépés
		Given Licencek: megnyitom a licencek oldalt
		When Licencek: megrendelem a licencem
		Then Licencek: a licenc megrendelő oldal megnyílik

	@lejart
	Scenario: Lejárt licencek megjelenítése
		Given Licencek: van lejárt licenc
		And Licencek: megnyitom a licencek oldalt
		When Licencek: kilistáztatom a lejárt licenceket
		Then Licencek: a lejárt licencek is megjelennek a listában

	Scenario: Licenc megrendelése második lépés
		Given Licencek: megnyitott licenc megrendelő ablak
		When Licencek: választok előfizetést
		And Licencek: áttekintem a megrendelést
		And Licencek: véglegesítem a megrendelést
		Then Licencek: a licenc meg van rendelve

	Scenario: Kijelentkezés
		Given Licencek: Kijelentkezek a Licencek oldalról

	Scenario: Bejelentkezés tulajdonosként
		Given Licencek: bejelentkezem tulajdonosként

	Scenario: Bejelentkezés felhasználóként
		Given Licencek: bejelentkezem felhasználóként

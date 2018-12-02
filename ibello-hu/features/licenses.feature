# namespace: Licencek
Feature: Licenc kezelés

	@tulajdonos @ervenyes @engedelyez
	Scenario: Tulajdonos érvényes licencet engedélyez
		Given Licencek: bejelentkezem tulajdonosként
		And Licencek: van érvényes licenc
		When Licencek: megnyitom a licencek oldalt
		And Licencek: engedélyezem a licencem
		Then Licencek: licenc engedélyezve lesz a felhasználónak

	@tulajdonos @lejart @engedelyez
	Scenario: Tulajdonos lejárt licencet engedélyez
		Given Licencek: bejelentkezem tulajdonosként
		And Licencek: van lejárt licenc
		When Licencek: megnyitom a licencek oldalt
		And Licencek: engedélyezem a lejárt licencem
		Then Licencek: lejárt licenc nem engedélyezhető

	@tulajdonos @ervenyes @visszavon
	Scenario: Tulajdonos érvényes licencet visszavon
		Given Licencek: bejelentkezem tulajdonosként
		And Licencek: van engedélyezett licencem
		When Licencek: megnyitom a licencek oldalt
		And Licencek: visszavonom az engedélyezett licencem
		Then Licencek: licenc visszavonva a felhasználótól

	@felhasznalo @visszaad
	Scenario: Felhasználó licencet visszaad
		Given Licencek: bejelentkezem felhasználóként
		When Licencek: megnyitom a licencek oldalt
		And Licencek: visszaadom a nekem adott licencet
		Then Licencek: a licenc visszakerül a tulajdonoshoz
		And Licencek: a licenc törlődik a listáról

	@megrendeles
	Scenario: Licenc megrendelése első lépés
		Given Licencek: megnyitom a licencek oldalt
		When Licencek: megrendelem a licencem
		Then Licencek: a licenc megrendelő oldal megnyílik

	@lejart
	Scenario: Lejárt licencek megjelenítése
		Given Licencek: megnyitom a licencek oldalt
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

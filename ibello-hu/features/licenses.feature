# namespace: Licencek
@licenses
Feature: Licenc kezelés

	@tulajdonos @ervenyes @engedelyez
	Scenario: Tulajdonos érvényes licencet engedélyez
		Given Licencek: van érvényes licenc
		And Licencek: bejelentkezem tulajdonosként
		When Licencek: megnyitom a licencek oldalt
		And Licencek: a licenc engedélyezhető
		And Licencek: engedélyezem a licencem
		Then Licencek: licenc engedélyezve lesz a felhasználónak
		And Licencek: Kijelentkezek a Licencek oldalról

	@tulajdonos @ervenyes @visszavon
	Scenario: Tulajdonos érvényes licencet visszavon
		Given Licencek: van érvényes licenc
		And Licencek: bejelentkezem tulajdonosként
		When Licencek: megnyitom a licencek oldalt
		Given Licencek: a licenc visszavonható
		And Licencek: visszavonom az engedélyezett licencem
		Then Licencek: licenc visszavonva a felhasználótól
		Given Licencek: Kijelentkezek a Licencek oldalról

	@felhasznalo @visszaad
	Scenario: Felhasználó licencet visszaad
		Given Licencek: van engedélyezett licencem
		And Licencek: bejelentkezem felhasználóként
		When Licencek: megnyitom a licencek oldalt
		And Licencek: visszaadom a nekem adott licencet
		Then Licencek: a licenc visszakerül a tulajdonoshoz
		Given Licencek: Kijelentkezek a Licencek oldalról

	Scenario: Tulajdonos lejárt licencet engedélyez - teljes
		Given Licencek: van lejárt licenc
		And Licencek: bejelentkezem tulajdonosként
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

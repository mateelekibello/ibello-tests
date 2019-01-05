# namespace: Licencek
@licenses
Feature: Licenc kezelés

	@tulajdonos @ervenyes @engedelyez
	Scenario: Tulajdonos érvényes licencet engedélyez
		Given Licencek: Van érvényes licenc
		And Licencek: Bejelentkezem tulajdonosként
		When Licencek: Megnyitom a licencek oldalt
		And Licencek: A licenc engedélyezhető
		And Licencek: Engedélyezem a licencem
		Then Licencek: Licenc engedélyezve lesz a felhasználónak
		And Licencek: Kijelentkezek a Licencek oldalról

	@tulajdonos @ervenyes @visszavon
	Scenario: Tulajdonos érvényes licencet visszavon
		Given Licencek: Van érvényes licenc
		And Licencek: Bejelentkezem tulajdonosként
		When Licencek: Megnyitom a licencek oldalt
		Given Licencek: A licenc visszavonható
		And Licencek: Visszavonom az engedélyezett licencem
		Then Licencek: Licenc visszavonva a felhasználótól
		Given Licencek: Kijelentkezek a Licencek oldalról

	@felhasznalo @visszaad
	Scenario: Felhasználó licencet visszaad
		Given Licencek: Van engedélyezett licencem
		And Licencek: Bejelentkezem felhasználóként
		When Licencek: Megnyitom a licencek oldalt
		And Licencek: Visszaadom a nekem adott licencet
		Then Licencek: A licenc visszakerül a tulajdonoshoz
		Given Licencek: Kijelentkezek a Licencek oldalról

	Scenario: Tulajdonos lejárt licencet engedélyez
		Given Licencek: Van lejárt licenc
		And Licencek: Bejelentkezem tulajdonosként
		When Licencek: Megnyitom a licencek oldalt
		And Licencek: Kilistáztatom a lejárt licenceket
		Then Licencek: A lejárt licencek is megjelennek a listában
		When Licencek: Engedélyezem a lejárt licencem
		Then Licencek: Lejárt licenc nem engedélyezhető
		Given Licencek: Kijelentkezek a Licencek oldalról

	Scenario: Licenc megrendelése
		Given Licencek: Bejelentkezem tulajdonosként
		And Licencek: Megnyitom a licencek oldalt
		When Licencek: Megrendelem a licencem
		Then Licencek: A licenc megrendelő oldal megnyílik
		When Licencek: Választok előfizetést
		And Licencek: Áttekintem a megrendelést
		And Licencek: Véglegesítem a megrendelést
		Then Licencek: A licenc meg van rendelve
		Given Licencek: Kijelentkezek a Licencek oldalról

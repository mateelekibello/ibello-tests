# namespace: Licence

Step: Licence: megnyitom a licencek oldalt
	Given Step: Megnyitom a licencek menüt

Step: Licence: engedélyezem a licencem
	Given Step: Keresek egy érvényes licencet
	When Step: Rákattintok az engedélyez gombra
	When Step: Kitöltöm  a felhasználó e-mail címét
	When Step: Jóváhagyom az engedélyt
	Then A licence átkerül a felhasználóhoz

Step: Licence: engedélyezem a lejárt licencem
	Given Step: Keresek egy lejárt licencet
	When Step: Rákattintok az engedélyez gombra
	Then Step: Hibaüzenet jön

Step: Licence: visszavonom a licencem
	Given Step: Keresek egy kiadott licencet
	When Step: Rákattintok a visszavon gombra
	When Step: Figyelmeztet biztos visszavonom-e
	When Step: Visszavonra kattintok
	Then Licence vissza lett vonva

Step: Licence: megrendelem a licencem
	Given Step: Licencek oldalt megnyitom
	When Step: Megrendelés gombra kattintok
	When Step: Megrendelés oldalon választok 1 Bronz előfizetést
	When Step: Megrendelés áttekintése gombra nyomok
	When Step: Megnyílik az áttekintő ablak
	When Step: Megrendelés véglegesítése
	Then Step: A licence megrendelve

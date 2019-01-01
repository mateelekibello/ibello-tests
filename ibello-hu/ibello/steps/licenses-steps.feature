# namespace: Licencek

Step: Licencek: van érvényes licenc

Step: Licencek: bejelentkezem tulajdonosként
	Given Navigáció: Az ibello honlapján vagyok
	Given Navigáció: Megnyitom a bejelentkező oldalt
	Given Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználóval

Step: Licencek: megnyitom a licencek oldalt
	Given Navigáció: Ellenőrzöm hogy a bejelentkezett menü látható
	When Navigáció: Megnyitom a Licencek oldalt

Step: Licencek: engedélyezem a licencem
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	When Licencek oldal: elindítom az engedélyezést
	Then Licencek oldal: megnyílik a licenc engedélyezés dialógusablak
	When Licencek oldal: ellenőrzöm a licenc adatait
	When Licencek oldal: beírom a felhasználó nevét
	When Licencek oldal: engedélyezem a licencet
	Then Licencek oldal: a listában megjelenik az engedélyezett licenc

Step: Licencek: Kijelentkezek a Licencek oldalról
	When Licencek oldal: Kijelentkezek a Licencek oldalról
	Then Navigáció: Megnyílik az ibello Bejelentkező oldala

Step: Licencek: licenc engedélyezve lesz a felhasználónak
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	When Licencek: bejelentkezem felhasználóként
	Given Navigáció: Megnyitom a Licencek oldalt
	Then Licencek oldal: a licenc visszaadható
	Given Licencek: Kijelentkezek a Licencek oldalról

Step: Licencek: van engedélyezett licencem

Step: Licencek: visszavonom az engedélyezett licencem
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	When Licencek oldal: elindítom a licenc visszavonását
	Then Licencek oldal: megjelenik a licenc visszavonása dialógusablak
	Given Licencek oldal: ellenőrzöm a licenc adatait
	When Licencek oldal: visszavonom a licencet
	Then Licencek oldal: a licenc engedélyezhető

Step: Licencek: licenc visszavonva a felhasználótól
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	Given Licencek: bejelentkezem felhasználóként
	Given Navigáció: Megnyitom a Licencek oldalt
	Given Licencek oldal: a licenc nincs a listán
	Given Licencek oldal: Kijelentkezek a Licencek oldalról

Step: Licencek: bejelentkezem felhasználóként
	Given Navigáció: Az ibello honlapján vagyok
	Given Navigáció: Megnyitom a bejelentkező oldalt
	Given Bejelentkezés: Megpróbálok bejelentkezni egy teszt felhasználóval

Step: Licencek: visszaadom a nekem adott licencet
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	Given Licencek: van engedélyezett licencem
	When Licencek oldal: elindítom a licenc visszaadását
	Given Licencek oldal: ellenőrzöm a licenc adatait
	Then Licencek oldal: megjelenik a licenc visszaadása dialógusablak
	When Licencek oldal: visszaadom a licencet
	Then Licencek oldal: a licenc nem visszaadható

Step: Licencek: a licenc visszakerül a tulajdonoshoz
	Given Licencek oldal: Kijelentkezek a Licencek oldalról
	And Licencek: bejelentkezem tulajdonosként
	And Navigáció: Megnyitom a Licencek oldalt
	When Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	Then Licencek oldal: a licenc engedélyezhető
	Given Licencek: Kijelentkezek a Licencek oldalról
	And Licencek: bejelentkezem felhasználóként

Step: Licencek: a licenc törlődik a listáról
	Given Navigáció: Megnyitom a Licencek oldalt
	When Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	Then Licencek oldal: a licenc nincs a listán

Step: Licencek: van lejárt licenc

Step: Licencek: kilistáztatom a lejárt licenceket
	Given Licencek oldal: kilistáztatom a lejárt licenceket

Step: Licencek: a lejárt licencek is megjelennek a listában
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "invalid"
	Then Licencek oldal: a licenc engedélyezhető

Step: Licencek: engedélyezem a lejárt licencem
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "invalid"
	When Licencek oldal: elindítom az engedélyezést

Step: Licencek: lejárt licenc nem engedélyezhető

Step: Licencek: megrendelem a licencem
	When Licencek oldal: megrendelem a licencem

Step: Licencek: a licenc megrendelő oldal megnyílik
	Given Navigáció: Megnyílik a megrendelő oldal

Step: Licencek: választok előfizetést
	Given Tesztadat: Az Aktuális Rendelés Neve Legyen "order"
	When Megrendelés oldal: beállítom a bronz licencek számát
	When Megrendelés oldal: beállítom az ezüst licencek számát
	When Megrendelés oldal: beállítom az arany licencek számát

Step: Licencek: áttekintem a megrendelést
	Given Megrendelés oldal: áttekintem a megrendelést
	Given Megrendelés oldal: megjelenik a véglegesítés üzenetablak
	Given Megrendelés oldal: ellenőrzöm a megrendelés adatait

Step: Licencek: véglegesítem a megrendelést
	Given Megrendelés oldal: véglegesítem a megrendelést

Step: Licencek: a licenc meg van rendelve
	Then Megrendelés oldal: megjelenik a sikeres megrendelés dialógusablak
	When Megrendelés oldal: bezárom a felugró ablakot
	Then Navigáció: Megnyílik a licencek oldal

Step: Licencek: megnyitott licenc megrendelő ablak
	Given Navigáció: Megnyílik a megrendelő oldal

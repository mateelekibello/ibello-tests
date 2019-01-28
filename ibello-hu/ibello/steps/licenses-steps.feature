# namespace: Licencek

Step: Licencek: Van érvényes licenc

Step: Licencek: Bejelentkezem tulajdonosként
	Given Navigáció: Az Ibello Honlapján Vagyok
	Given Navigáció: Megnyitom a Bejelentkező Oldalt
	Given Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználóval

Step: Licencek: Megnyitom a licencek oldalt
	Given Navigáció: Ellenőrzöm Hogy a Bejelentkezett Menü Látható
	When Navigáció: Megnyitom a Licencek Oldalt

Step: Licencek: A licenc engedélyezhető
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	Given Licencek oldal: Beállítom a Licenc Státuszát
	Given Licencek oldal: Az Aktuális Licenc Legyen Engedélyezhető

Step: Licencek: Engedélyezem a licencem
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	When Licencek oldal: Elindítom Az Engedélyezést
	Then Licencek oldal: Megnyílik a Licenc Engedélyezés Dialógusablak
	When Licencek oldal: Ellenőrzöm a Licenc Adatait
	When Licencek oldal: Beírom a Felhasználó Nevét
	When Licencek oldal: Engedélyezem a Licencet

Step: Licencek: Kijelentkezek a Licencek oldalról
	When Licencek oldal: Kijelentkezek a Licencek Oldalról
	Then Navigáció: Megnyílik Az Ibello Bejelentkező Oldala

Step: Licencek: Licenc engedélyezve lesz a felhasználónak
	Then Licencek oldal: Az Engedélyezett Licenc Megjelenik a Listában
	Given Licencek oldal: Kijelentkezek a Licencek Oldalról
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	When Licencek: Bejelentkezem felhasználóként
	Given Navigáció: Megnyitom a Licencek Oldalt
	Then Licencek oldal: Az Aktuális Licenc Visszaadható

Step: Licencek: Van engedélyezett licencem
	Given Licencek: Bejelentkezem tulajdonosként
	Given Navigáció: Megnyitom a Licencek Oldalt
	Given Licencek oldal: Beállítom a Licenc Státuszát
	When Licencek oldal: Az Aktuális Licenc Legyen Visszavonható
	Given Licencek oldal: Kijelentkezek a Licencek Oldalról

Step: Licencek: Visszavonom az engedélyezett licencem
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	When Licencek oldal: Elindítom a Licenc Visszavonását
	Then Licencek oldal: Megjelenik a Licenc Visszavonása Dialógusablak
	Given Licencek oldal: Ellenőrzöm a Licenc Adatait
	When Licencek oldal: Visszavonom a Licencet

Step: Licencek: Licenc visszavonva a felhasználótól
	Then Licencek oldal: Az Aktuális Licenc Engedélyezhető
	Given Licencek oldal: Kijelentkezek a Licencek Oldalról
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	Given Licencek: Bejelentkezem felhasználóként
	Given Navigáció: Megnyitom a Licencek Oldalt
	Given Licencek oldal: Az Aktuális Licenc Nincs a Listán

Step: Licencek: Bejelentkezem felhasználóként
	Given Navigáció: Az Ibello Honlapján Vagyok
	Given Navigáció: Megnyitom a Bejelentkező Oldalt
	Given Bejelentkezés: Megpróbálok bejelentkezni egy teszt felhasználóval

Step: Licencek: Visszaadom a nekem adott licencet
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	When Licencek oldal: Elindítom a Licenc Visszaadását
	Given Licencek oldal: Ellenőrzöm a Licenc Adatait
	Then Licencek oldal: Megjelenik a Licenc Visszaadása Dialógusablak
	When Licencek oldal: Visszaadom a Licencet

Step: Licencek: A licenc visszakerül a tulajdonoshoz
	Then Licencek oldal: Az Aktuális Licenc Nem Visszaadható
	When Licencek oldal: Frissítem Az Oldalt
	Then Licencek oldal: Az Aktuális Licenc Nincs a Listán
	Given Licencek: Kijelentkezek a Licencek oldalról
	And Licencek: Bejelentkezem tulajdonosként
	And Navigáció: Megnyitom a Licencek Oldalt
	When Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	Then Licencek oldal: Az Aktuális Licenc Engedélyezhető

Step: Licencek: A licenc törlődik a listáról
	Given Navigáció: Megnyitom a Licencek Oldalt
	When Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	Then Licencek oldal: Az Aktuális Licenc Nincs a Listán

Step: Licencek: Van lejárt licenc

Step: Licencek: Kilistáztatom a lejárt licenceket
	Given Licencek oldal: Kilistáztatom a Lejárt Licenceket

Step: Licencek: A lejárt licencek is megjelennek a listában
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "invalid"
	Then Licencek oldal: Az Aktuális Licenc Legyen Engedélyezhető

Step: Licencek: Engedélyezem a lejárt licencem
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "invalid"
	When Licencek oldal: Elindítom Az Engedélyezést

Step: Licencek: Lejárt licenc nem engedélyezhető
	Given Licencek oldal: Megjelenik a Lejárt Licenc Üzenetablak
	Then Licencek oldal: Bezárom Az Üzenetablakot

Step: Licencek: Megrendelem a licencem
	When Licencek oldal: Megrendelem a Licencem

Step: Licencek: A licenc megrendelő oldal megnyílik
	Given Navigáció: Megnyílik a Megrendelő Oldal

Step: Licencek: Választok előfizetést
	Given Tesztadat: Az Aktuális Rendelés Neve Legyen "order"
	When Megrendelés oldal: Beállítom a Bronz Licencek Számát
	When Megrendelés oldal: Beállítom Az Ezüst Licencek Számát
	When Megrendelés oldal: Beállítom Az Arany Licencek Számát

Step: Licencek: Áttekintem a megrendelést
	Given Megrendelés oldal: Áttekintem a Megrendelést
	Given Megrendelés oldal: Megjelenik a Véglegesítés Üzenetablak
	Given Megrendelés oldal: Ellenőrzöm a Megrendelés Adatait

Step: Licencek: Véglegesítem a megrendelést
	Given Megrendelés oldal: Véglegesítem a Megrendelést

Step: Licencek: A licenc meg van rendelve
	Then Megrendelés oldal: Megjelenik a Sikeres Megrendelés Dialógusablak
	When Megrendelés oldal: Bezárom a Felugró Ablakot
	Then Navigáció: Megnyílik a Licencek Oldal

Step: Licencek: Megnyitott licenc megrendelő ablak
	Given Navigáció: Megnyílik a Megrendelő Oldal

Step: Licencek: A licenc visszavonható
	Given Tesztadat: Az Aktuális Licenc Neve Legyen "user"
	Given Licencek oldal: Beállítom a Licenc Státuszát
	Given Licencek oldal: Az Aktuális Licenc Legyen Visszavonható

# namespace: Licencek

Step: Licencek: bejelentkezem tulajdonosként
	Given Navigáció: Az ibello honlapján vagyok
	Given Navigáció: Megnyitom a bejelentkező oldalt
	Given Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználóval

Step: Licencek: van érvényes licenc

Step: Licencek: megnyitom a licencek oldalt
	Given Navigáció: Ellenőrzöm hogy a bejelentkezett menü látható
	When Navigáció: Megnyitom a Licencek oldalt

Step: Licencek: engedélyezem a licencem
	When Licencek oldal: elindítom az engedélyezést
	Then Licencek oldal: megnyílik a licenc engedélyezés dialógusablak
	When Licencek oldal: beírom a felhasználó nevét
	When Licencek oldal: engedélyezem a licencet
	Then Licencek oldal: a listában megjelenik az engedélyezett licenc

Step: Licencek: licenc engedélyezve lesz a felhasználónak

Step: Licencek: van lejárt licenc

Step: Licencek: engedélyezem a lejárt licencem

Step: Licencek: lejárt licenc nem engedélyezhető

Step: Licencek: van engedélyezett licencem

Step: Licencek: visszavonom az engedélyezett licencem
	When Licencek oldal: elindítom a licenc visszavonását
	Then Licencek oldal: megjelenik a licenc visszavonása dialógusablak
	When Licencek oldal: visszavonom a licencet
	Then Licencek oldal: a licenc engedélyezhető

Step: Licencek: licenc visszavonva a felhasználótól

Step: Licencek: bejelentkezem felhasználóként
	Given Navigáció: Az ibello honlapján vagyok
	Given Navigáció: Megnyitom a bejelentkező oldalt
	Given Bejelentkezés: Megpróbálok bejelentkezni egy teszt felhasználóval

Step: Licencek: visszaadom a nekem adott licencet
	Given Licencek: van engedélyezett licencem
	When Licencek oldal: elindítom a licenc visszaadását
	Then Licencek oldal: megjelenik a licenc visszaadása dialógusablak
	When Licencek oldal: visszaadom a licencet
	Then Licencek oldal: a licenc nem visszaadható

Step: Licencek: a licenc visszakerül a tulajdonoshoz

Step: Licencek: a licenc törlődik a listáról
	When Licencek oldal: frissítem az oldalt
	Then Licencek oldal: a licenc nincs a listán

Step: Licencek: megrendelem a licencem
	When Licencek oldal: megrendelem a licencem

Step: Licencek: a licenc megrendelő oldal megnyílik
	Given Navigáció: A Licenc megrendelő oldalon vagyok

Step: Licencek: kilistáztatom a lejárt licenceket
	Given Licencek oldal: kilistáztatom a lejárt licenceket

Step: Licencek: a lejárt licencek is megjelennek a listában

Step: Licencek: megnyitott licenc megrendelő ablak
	Given Megrendelés oldal: a Megrendelés oldalon vagyok

Step: Licencek: választok előfizetést
	When Megrendelés oldal: beállítom a bronz licencek számát
	When Megrendelés oldal: beállítom az ezüst licencek számát
	When Megrendelés oldal: beállítom az arany licencek számát

Step: Licencek: áttekintem a megrendelést
	Given Megrendelés oldal: áttekintem a megrendelést
	Given Megrendelés oldal: megjelenik a véglegesítés üzenetablak

Step: Licencek: véglegesítem a megrendelést
	Given Megrendelés oldal: véglegesítem a megrendelést

Step: Licencek: a licenc meg van rendelve
	Then Megrendelés oldal: megjelenik a sikeres megrendelés dialógusablak
	When Megrendelés oldal: bezárom a felugró ablakot

Step: Licencek: Kijelentkezek a Licencek oldalról

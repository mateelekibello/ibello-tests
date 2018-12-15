# namespace: Személyes

Step: Személyes: Megpróbálok bejelentkezni egy regisztrált felhasználóval
	Given Navigáció: Az ibello honlapján vagyok
	Given Navigáció: Megnyitom a bejelentkező oldalt
	When Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználóval

Step: Személyes: Felhasználói adatok beállítása
	When Személyes oldal: Beállítom a keresztnevet
	When Személyes oldal: Beállítom a vezetéknevet
	When Személyes oldal: Beállítom a szervezet nevét
	When Személyes oldal: Beállítom a számlázási keresztnevet
	When Személyes oldal: Beállítom a számlázási vezetéknevet
	When Személyes oldal: Beállítom a számlázási szervezet nevét
	When Személyes oldal: Beállítom a számlázási adószámot
	When Személyes oldal: Beállítom a számlázási országot
	When Személyes oldal: Beállítom a számlázási várost
	When Személyes oldal: Beállítom a számlázási államot
	When Személyes oldal: Beállítom a számlázási irányítószámot
	When Személyes oldal: Beállítom a számlázási cím első részét
	When Személyes oldal: Beállítom a számlázási cím második részét

Step: Személyes: Kijelentkezek a Személyes oldalról
	When Személyes oldal: Kijelentkezek a Személyes oldalról
	Then Navigáció: Megnyílik az ibello Bejelentkező oldala

Step: Személyes: Az átírt adatok ellenőrzése
	When Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "modified"
	Then Személyes oldal: A beállított felhasználói adatok jelennek meg

Step: Személyes: Felhasználói adatok visszaállítása
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "valid"
	When Személyes: Felhasználói adatok beállítása
	Given Személyes: Mentem a változásokat

Step: Személyes: Felhasználói adatok átírása
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "modified"
	When Személyes: Felhasználói adatok beállítása
	When Személyes: Mentem a változásokat

Step: Személyes: Mentem a változásokat
	When Személyes oldal: Mentem a változásokat
	Then Személyes oldal: Megjelenik a sikeres mentés üzenetablak
	When Személyes oldal: Bezárom a felugró ablakot

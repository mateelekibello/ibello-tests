# namespace: Személyes

Step: Személyes: Megpróbálok bejelentkezni egy regisztrált felhasználóval
	Given Navigáció: Az Ibello Honlapján Vagyok
	Given Navigáció: Megnyitom a Bejelentkező Oldalt
	When Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználóval

Step: Személyes: Felhasználói adatok beállítása
	When Személyes oldal: Beállítom a Keresztnevet
	When Személyes oldal: Beállítom a Vezetéknevet
	When Személyes oldal: Beállítom a Szervezet Nevét
	When Személyes oldal: Beállítom a Számlázási Keresztnevet
	When Személyes oldal: Beállítom a Számlázási Vezetéknevet
	When Személyes oldal: Beállítom a Számlázási Szervezet Nevét
	When Személyes oldal: Beállítom a Számlázási Adószámot
	When Személyes oldal: Beállítom a Számlázási Országot
	When Személyes oldal: Beállítom a Számlázási Várost
	When Személyes oldal: Beállítom a Számlázási Államot
	When Személyes oldal: Beállítom a Számlázási Irányítószámot
	When Személyes oldal: Beállítom a Számlázási Cím Első Részét
	When Személyes oldal: Beállítom a Számlázási Cím Második Részét

Step: Személyes: Kijelentkezek a Személyes oldalról
	When Személyes oldal: Kijelentkezek a Személyes Oldalról
	Then Navigáció: Megnyílik Az Ibello Bejelentkező Oldala

Step: Személyes: Az átírt adatok ellenőrzése
	When Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "modified"
	Then Személyes oldal: Az Átírt Felhasználó Adatok Jelennek Meg

Step: Személyes: Felhasználói adatok visszaállítása
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "valid"
	When Személyes: Felhasználói adatok beállítása
	Given Személyes: Mentem a változásokat

Step: Személyes: Felhasználói adatok átírása
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "modified"
	When Személyes: Felhasználói adatok beállítása
	When Személyes: Mentem a változásokat

Step: Személyes: Mentem a változásokat
	When Személyes oldal: Mentem a Változásokat
	Then Személyes oldal: Megjelenik a Sikeres Mentés Üzenetablak
	When Személyes oldal: Bezárom a Felugró Ablakot

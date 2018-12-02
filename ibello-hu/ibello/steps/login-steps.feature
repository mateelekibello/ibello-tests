# namespace: Bejelentkezés

Step: Bejelentkezés: Az ibello bejelentkező oldalán vagyok
	Given Navigáció: Az ibello honlapján vagyok
	When Navigáció: Megnyitom a bejelentkező oldalt

Step: Bejelentkezés: Megpróbálok bejelentkezni egy nem regisztrált felhasználóval
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "invalid"
	When Bejelentkező oldal: Beírom a felhasználónevet
	When Bejelentkező oldal: Beírom a jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: A bejelentkezés sikertelen
	Then Bejelentkező oldal: Felugrik a sikertelen bejelentkezés üzenetablak
	When Bejelentkező oldal: Bezárom a felugró ablakot

Step: Bejelentkezés: A bejelentkezés sikeres
	Then Navigáció: Megnyílik az ibello Személyes oldala
	Then Személyes oldal: A beállított felhasználói adatok jelennek meg

Step: Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználóval
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "valid"
	When Bejelentkező oldal: Beírom a felhasználónevet
	When Bejelentkező oldal: Beírom a jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: Megpróbálok bejelentkezni egy nem létező felhasználóval
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "nonexisting"
	When Bejelentkező oldal: Beírom a felhasználónevet
	When Bejelentkező oldal: Beírom a jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználó e-mail-címével
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "valid"
	When Bejelentkező oldal: Beírom az e-mail-címet
	When Bejelentkező oldal: Beírom a jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: Megnyílik az ibello bejelentkező oldala
	Then Navigáció: Megnyílik az ibello Bejelentkező oldala

Step: Bejelentkezés: Kijelentkezek a Személyes oldalról
	When Személyes: Kijelentkezek a Személyes oldalról

Step: Bejelentkezés: Megpróbálok bejelentkezni egy teszt felhasználóval
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "user"
	When Bejelentkező oldal: Beírom a felhasználónevet
	When Bejelentkező oldal: Beírom a jelszót
	When Bejelentkező oldal: Bejelentkezek

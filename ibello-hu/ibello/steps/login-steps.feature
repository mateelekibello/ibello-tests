# namespace: Bejelentkezés

Step: Bejelentkezés: Az ibello bejelentkező oldalán vagyok
	Given Navigáció: Az Ibello Honlapján Vagyok
	Given Nyelvválasztó: Magyar Nyelv Kiválasztása
	When Navigáció: Megnyitom a Bejelentkező Oldalt

Step: Bejelentkezés: Megpróbálok bejelentkezni egy nem regisztrált felhasználóval
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "invalid"
	When Bejelentkező oldal: Beírom a Felhasználónevet
	When Bejelentkező oldal: Beírom a Jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: A bejelentkezés sikertelen
	Then Bejelentkező oldal: Felugrik a Sikertelen Bejelentkezés Üzenetablak
	When Bejelentkező oldal: Bezárom a Felugró Ablakot

Step: Bejelentkezés: A bejelentkezés sikeres
	Given Navigáció: Megnyílik Az Ibello Nyitóoldala
	Given Navigáció: Megnyitom a Személyes Oldalt
	Then Navigáció: Megnyílik Az Ibello Személyes Oldala
	Then Személyes oldal: Az Átírt Felhasználó Adatok Jelennek Meg

Step: Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználóval
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "valid"
	When Bejelentkező oldal: Beírom a Felhasználónevet
	When Bejelentkező oldal: Beírom a Jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: Megpróbálok bejelentkezni egy nem létező felhasználóval
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "nonexisting"
	When Bejelentkező oldal: Beírom a Felhasználónevet
	When Bejelentkező oldal: Beírom a Jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználó e-mail-címével
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "valid"
	When Bejelentkező oldal: Beírom Az Email Címet
	When Bejelentkező oldal: Beírom a Jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: Megnyílik az ibello bejelentkező oldala
	Then Navigáció: Megnyílik Az Ibello Bejelentkező Oldala

Step: Bejelentkezés: Kijelentkezek a Személyes oldalról
	When Személyes: Kijelentkezek a Személyes oldalról

Step: Bejelentkezés: Megpróbálok bejelentkezni egy teszt felhasználóval
	Given Tesztadat: Az Aktuális Felhasználó Azonosítója Legyen "user"
	When Bejelentkező oldal: Beírom a Felhasználónevet
	When Bejelentkező oldal: Beírom a Jelszót
	When Bejelentkező oldal: Bejelentkezek

# namespace: Bejelentkezés

Step: Bejelentkezés: Az ibello bejelentkező oldalán vagyok
	Given Navigáció: Az ibello honlapján vagyok
	When Navigáció: Megnyitom a bejelentkező oldalt

Step: Bejelentkezés: Megpróbálok bejelentkezni egy nem regisztrált felhasználóval
	Given Tesztadat: Az aktuális felhasználói adatok azonosítója legyen "invalid"
	When Bejelentkező oldal: Beírom a felhasználónevet
	When Bejelentkező oldal: Beírom a jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: A bejelentkezés sikertelen
	Then Bejelentkező oldal: Felugrik a sikertelen bejelentkezés üzenetablak

Step: Bejelentkezés: A bejelentkezés sikeres
	Then Navigáció: Megnyílik az ibello Személyes oldala
	Then Személyes oldal: A bejelentkezett felhasználó adatai jelennek meg

Step: Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználóval
	Given Tesztadat: Az aktuális felhasználói adatok azonosítója legyen "valid"
	When Bejelentkező oldal: Beírom a felhasználónevet
	When Bejelentkező oldal: Beírom a jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: Megpróbálok bejelentkezni egy nem létező felhasználóval
	Given Tesztadat: Az aktuális felhasználói adatok azonosítója legyen "nonexisting"
	When Bejelentkező oldal: Beírom a felhasználónevet
	When Bejelentkező oldal: Beírom a jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználó e-mail-címével
	Given Tesztadat: Az aktuális felhasználói adatok azonosítója legyen "valid"
	When Bejelentkező oldal: Beírom az e-mail-címet
	When Bejelentkező oldal: Beírom a jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: Kijelentkezek a Személyes oldalról
	Given Személyes oldal: Kijelentkezek a Személyes oldalról
	Then Navigáció: Megnyitom a bejelentkező oldalt


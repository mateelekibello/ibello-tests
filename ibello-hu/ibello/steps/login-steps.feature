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

Step: Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználóval
	Given Tesztadat: Az aktuális felhasználói adatok azonosítója legyen "valid"
	When Bejelentkező oldal: Beírom a felhasználónevet
	When Bejelentkező oldal: Beírom a jelszót
	When Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: Belépek a licence tulajdonosával
	Given Tesztadat: A felhasználónak legyen licence
	When Bejelentkező oldal: Beírom a  tulajdonos felhasználónevet
	When Bejelentkező oldal: Beírom a  tulajdonos jelszavát
	Then Bejelentkező oldal: Bejelentkezek

Step: Bejelentkezés: Belépek a licence felhasználójával
	Given Tesztadat: A felhasználónak legyen kapott licence
	When Bejelentkező oldal: Beírom a felhasználó felhasználónevet
	And Bejelentkező oldal: Beírom a felhasználó jelszavát
	Then Bejelentkező oldal: Bejelentkezek

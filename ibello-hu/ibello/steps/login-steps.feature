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

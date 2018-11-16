# namespace: Személyes

Step: Személyes: Felhasználói adatok átírása
	Given Tesztadat: Az aktuális felhasználói adatok azonosítója legyen "modified"
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
	When Személyes oldal: Mentem a változásokat

Step: Személyes: Kijelentkezek a Személyes oldalról
	When Személyes oldal: Kijelentkezek a Személyes oldalról
	Then Navigáció: Megnyitom a bejelentkező oldalt

Step: Személyes: Az átírt adatok ellenőrzése
	Then Személyes oldal: Az átírt adatok jelennek meg

Step: Személyes: Felhasználói adatok visszaállítása
	Given Tesztadat: Az aktuális felhasználói adatok azonosítója legyen "valid"
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
	Given Személyes oldal: Mentem a változásokat

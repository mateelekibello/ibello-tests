# namespace: Blog

Step: Blog: Kiválasztok egy posztot
	Given Tesztadat: Az Aktuális Poszt Címe Legyen "180912"

Step: Blog: Megnyitom a blog oldalt
	Given Navigáció: Az Ibello Honlapján Vagyok
	When Navigáció: Megnyitom a Blog Oldalt

Step: Blog: Ellenőrzöm hogy a poszt megjelenik a blog oldalon
	Then Blog oldalak: Kiválasztott Poszt Megjelenik a Magyar Blog Oldalon

Step: Blog: Blog oldalról indulva ellenőrzöm hogy a poszt megjelenik a kategóriái oldalain
	When Blog oldalak: Bővítmények Kategória Ellenőrzése
	When Blog oldalak: Grafikus Felület Kategória Ellenőrzése
	When Blog oldalak: Mesterséges Intelligencia Kategória Ellenőrzése
	When Blog oldalak: Parancssor Kategória Ellenőrzése
	When Blog oldalak: Példák Kategória Ellenőrzése
	When Blog oldalak: Tanulmányok Kategória Ellenőrzése
	When Blog oldalak: Újdonságok Kategória Ellenőrzése
	When Blog oldalak: Áttekintés Kategória Ellenőrzése
	Given Navigáció: Megnyitom a Blog Oldalt

Step: Blog: Megnyitom a kiválasztott posztot
	When Blog oldalak: Megnyitom a Kiválasztott Posztot

Step: Blog: Ellenőrzöm hogy a poszt megjelenik a blog poszt oldalon
	Given Blog oldalak: Megjelenik a Kiválasztott Poszt Fejléce Magyarul
	Given Blog oldalak: Megjelenik a Kiválasztott Poszt Szövege Magyarul
	Given Blog oldalak: Megjelenik Az Ibello Blog Poszt Oldala Magyarul

Step: Blog: Fejlécből indulva ellenőrzöm hogy a poszt megjelenik a blog poszt oldalon

Step: Blog: Kategóriák menüből indulva ellenőrzöm hogy a poszt megjelenik a kategóriái oldalain

Step: Blog: A blog poszt oldal angolul jelenik meg
	Given Blog oldalak: Megjelenik Az Ibello Blog Poszt Oldala Angolul

Step: Blog: A blog poszt oldal magyarul jelenik meg
	Given Blog oldalak: Megjelenik Az Ibello Blog Poszt Oldala Magyarul
	Given Blog oldalak: Megjelenik a Poszt Címe Az Oldal Fejlécében Magyarul

Step: Blog: A magyar nyelv kiválasztása
	Given Blog oldalak: Magyar nyelv kiválasztása

Step: Blog: A poszt angolul jelenik meg
	Given Blog oldalak: Megjelenik a Kiválasztott Poszt Fejléce Angolul
	Given Blog oldalak: Megjelenik a Kiválasztott Poszt Szövege Angolul

Step: Blog: A poszt létezik angolul is

Step: Blog: A poszt létezik magyarul is

Step: Blog: A poszt magyarul jelenik meg
	Given Blog oldalak: Megjelenik a Kiválasztott Poszt Fejléce Magyarul
	Given Blog oldalak: Megjelenik a Kiválasztott Poszt Szövege Magyarul

Step: Blog: Az angol nyelv kiválasztása
	Given Blog oldalak: Angol Nyelv Kiválasztása

Step: Blog: Megnyitom a kezdő oldalt
	Given Navigáció: Az Ibello Honlapján Vagyok

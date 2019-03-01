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

Step: Blog: Fejlécből indulva ellenőrzöm hogy a poszt megjelenik a blog poszt oldalon

Step: Blog: Kategóriák menüből indulva ellenőrzöm hogy a poszt megjelenik a kategóriái oldalain

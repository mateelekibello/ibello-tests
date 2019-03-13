# namespace: Blog

Step: Blog: Megnyitom a blog oldalt
	Given Navigáció: Az Ibello Honlapján Vagyok
	Given Blog oldalak: Magyar Nyelv Kiválasztása
	When Navigáció: Megnyitom a Blog Oldalt

Step: Blog: Kiválasztok egy posztot
	Given Tesztadat: Az Aktuális Poszt Címe Legyen "180912"

Step: Blog: Ellenőrzöm hogy a poszt megjelenik a blog oldalon
	Then Blog oldalak: Kiválasztott Poszt Megjelenik a Magyar Blog Oldalon

Step: Blog: Blog oldalról indulva ellenőrzöm hogy a poszt megjelenik a kategóriái oldalain
	When Blog oldalak: Bővítmények Kategória Ellenőrzése "a blog oldal csempéjén"
	When Blog oldalak: Grafikus Felület Kategória Ellenőrzése "a blog oldal csempéjén"
	When Blog oldalak: Mesterséges Intelligencia Kategória Ellenőrzése "a blog oldal csempéjén"
	When Blog oldalak: Parancssor Kategória Ellenőrzése "a blog oldal csempéjén"
	When Blog oldalak: Példák Kategória Ellenőrzése "a blog oldal csempéjén"
	When Blog oldalak: Tanulmányok Kategória Ellenőrzése "a blog oldal csempéjén"
	When Blog oldalak: Újdonságok Kategória Ellenőrzése "a blog oldal csempéjén"
	When Blog oldalak: Áttekintés Kategória Ellenőrzése "a blog oldal csempéjén"
	Given Navigáció: Megnyitom a Blog Oldalt

Step: Blog: Megnyitom a kiválasztott posztot
	When Blog oldalak: Megnyitom a Kiválasztott Posztot

Step: Blog: Ellenőrzöm hogy a poszt megjelenik a blog poszt oldalon
	Given Blog: A blog poszt oldal magyarul jelenik meg
	Given Blog: A poszt magyarul jelenik meg

Step: Blog: Fejlécből indulva ellenőrzöm hogy a poszt megjelenik a kategóriái oldalain
	Given Blog oldalak: Bővítmények Kategória Ellenőrzése "a blog fejlécén"
	Given Blog oldalak: Grafikus Felület Kategória Ellenőrzése "a blog fejlécén"
	Given Blog oldalak: Mesterséges Intelligencia Kategória Ellenőrzése "a blog fejlécén"
	Given Blog oldalak: Parancssor Kategória Ellenőrzése "a blog fejlécén"
	Given Blog oldalak: Példák Kategória Ellenőrzése "a blog fejlécén"
	Given Blog oldalak: Tanulmányok Kategória Ellenőrzése "a blog fejlécén"
	Given Blog oldalak: Újdonságok Kategória Ellenőrzése "a blog fejlécén"
	Given Blog oldalak: Áttekintés Kategória Ellenőrzése "a blog fejlécén"

Step: Blog: Kategóriák menüből indulva ellenőrzöm hogy a poszt megjelenik a kategóriái oldalain
	Given Blog oldalak: Bővítmények Kategória Ellenőrzése "a kategóriák menüben"
	Given Blog oldalak: Grafikus Felület Kategória Ellenőrzése "a kategóriák menüben"
	Given Blog oldalak: Mesterséges Intelligencia Kategória Ellenőrzése "a kategóriák menüben"
	Given Blog oldalak: Parancssor Kategória Ellenőrzése "a kategóriák menüben"
	Given Blog oldalak: Példák Kategória Ellenőrzése "a kategóriák menüben"
	Given Blog oldalak: Tanulmányok Kategória Ellenőrzése "a kategóriák menüben"
	Given Blog oldalak: Újdonságok Kategória Ellenőrzése "a kategóriák menüben"
	Given Blog oldalak: Áttekintés Kategória Ellenőrzése "a kategóriák menüben"

Step: Blog: Kiválasztom az előző posztot
	Given Tesztadat: Az Aktuális Poszt Címe Legyen "180930"

Step: Blog: Kiválasztom a következő posztot
	Given Tesztadat: Az Aktuális Poszt Címe Legyen "181113"

Step: Blog: Előre lépek
	Given Blog oldalak: Továbblépés a Következő Posztra

Step: Blog: Visszalépek
	Given Blog oldalak: Visszalépés Az Előző Posztra

Step: Blog: A poszt létezik angolul is

Step: Blog: A poszt létezik magyarul is

Step: Blog: A blog poszt oldal magyarul jelenik meg
	Given Blog oldalak: Megjelenik Az Ibello Blog Poszt Oldala Magyarul
	Given Blog oldalak: Megjelenik a Poszt Címe Az Oldal Fejlécében Magyarul

Step: Blog: A blog poszt oldal angolul jelenik meg
	Given Blog oldalak: Megjelenik Az Ibello Blog Poszt Oldala Angolul
	Given Blog oldalak: Megjelenik a Poszt Címe Az Oldal Fejlécében Angolul

Step: Blog: A poszt magyarul jelenik meg
	Given Blog oldalak: Megjelenik a Kiválasztott Poszt Fejléce Magyarul
	Given Blog oldalak: Megjelenik a Kiválasztott Poszt Szövege Magyarul

Step: Blog: A poszt angolul jelenik meg
	Given Blog oldalak: Megjelenik a Kiválasztott Poszt Fejléce Angolul
	Given Blog oldalak: Megjelenik a Kiválasztott Poszt Szövege Angolul

Step: Blog: Az angol nyelv kiválasztása
	Given Blog oldalak: Angol Nyelv Kiválasztása

Step: Blog: A magyar nyelv kiválasztása
	Given Blog oldalak: Magyar Nyelv Kiválasztása

Step: Blog: Megnyitom a kezdő oldalt
	Given Navigáció: Az Ibello Honlapján Vagyok

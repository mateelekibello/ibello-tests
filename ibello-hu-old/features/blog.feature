# namespace: Blog
@blog
Feature: Az ibello blog tesztelése

	Scenario: Egy poszt tesztelése
		Given Blog: Megnyitom a blog oldalt
		When Blog: Kiválasztok egy posztot
		Then Blog: Ellenőrzöm hogy a poszt megjelenik a blog oldalon
		Then Blog: Blog oldalról indulva ellenőrzöm hogy a poszt megjelenik a kategóriái oldalain
		Given Blog: Megnyitom a kiválasztott posztot
		Given Blog: Ellenőrzöm hogy a poszt megjelenik a blog poszt oldalon
		Then Blog: Fejlécből indulva ellenőrzöm hogy a poszt megjelenik a kategóriái oldalain
		Then Blog: Kategóriák menüből indulva ellenőrzöm hogy a poszt megjelenik a kategóriái oldalain

	Scenario: Az előre és vissza gombok tesztelése
		Given Blog: Megnyitom a blog oldalt
		Given Blog: Kiválasztom az előző posztot
		Given Blog: Ellenőrzöm hogy a poszt megjelenik a blog oldalon
		Given Blog: Megnyitom a kiválasztott posztot
		Given Blog: Ellenőrzöm hogy a poszt megjelenik a blog poszt oldalon
		Given Blog: Előre lépek
		Given Blog: Kiválasztom a következő posztot
		Given Blog: Ellenőrzöm hogy a poszt megjelenik a blog poszt oldalon
		Given Blog: Visszalépek
		Given Blog: Kiválasztom az előző posztot
		Given Blog: Ellenőrzöm hogy a poszt megjelenik a blog poszt oldalon

	Scenario: A nyelvválasztó átállítása magyarról angolra a blog egyik posztjánál
		Given Blog: Megnyitom a blog oldalt
		And Blog: Kiválasztok egy posztot
		Given Blog: A poszt létezik angolul is
		And Blog: Megnyitom a kiválasztott posztot
		Given Blog: Az angol nyelv kiválasztása
		Given Blog: A blog poszt oldal angolul jelenik meg
		Given Blog: A poszt angolul jelenik meg

	Scenario: A nyelvválasztó átállítása angolról magyarra a blog egyik posztjánál
		Given Blog: A blog poszt oldal angolul jelenik meg
		And Blog: A poszt angolul jelenik meg
		Given Blog: A poszt létezik magyarul is
		Given Blog: A magyar nyelv kiválasztása
		Given Blog: A blog poszt oldal magyarul jelenik meg
		Given Blog: A poszt magyarul jelenik meg
		Given Blog: Megnyitom a kezdő oldalt

	Scenario: A nyelvválasztó átállítása magyarról angolra a blog egyik indexszel hivatkozott posztjánál
		Given Blog: Megnyitom a blog oldalt
		Given Blog: Kiválasztok egy posztot
		Given Blog: A poszt létezik angolul is
		Given Blog: Megnyitom a kiválasztott posztot
		Given Blog: Visszalépek
		Given Blog: Előre lépek
		Given Blog: Az angol nyelv kiválasztása
		Given Blog: A blog poszt oldal angolul jelenik meg
		Given Blog: A poszt angolul jelenik meg

	Scenario: A nyelvválasztó átállítása angolról magyarra a blog egyik indexszel hivatkozott posztjánál
		Given Blog: A blog poszt oldal angolul jelenik meg
		Given Blog: A poszt angolul jelenik meg
		Given Blog: A poszt létezik magyarul is
		Given Blog: Visszalépek
		Given Blog: Előre lépek
		Given Blog: A magyar nyelv kiválasztása
		Given Blog: A blog poszt oldal magyarul jelenik meg
		Given Blog: A poszt magyarul jelenik meg
		Given Blog: Megnyitom a kezdő oldalt

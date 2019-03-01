# namespace: Blog
@blog
Feature: Az ibello blog tesztelése

	Scenario: Egy poszt tesztelése
		Given Blog: Megnyitom a blog oldalt
		When Blog: Kiválasztok egy posztot
		Then Blog: Ellenőrzöm hogy a poszt megjelenik a blog oldalon
		Then Blog: Blog oldalról indulva ellenőrzöm hogy a poszt megjelenik a kategóriái oldalain
		Given Blog: Megnyitom a kiválasztott posztot
		Then Blog: Fejlécből indulva ellenőrzöm hogy a poszt megjelenik a blog poszt oldalon
		Then Blog: Kategóriák menüből indulva ellenőrzöm hogy a poszt megjelenik a kategóriái oldalain

	Scenario: Az előre és vissza gombok tesztelése

	Scenario: A nyelvválasztó átállítása magyarról angolra a blog egyik posztjánál

	Scenario: A nyelvválasztó átállítása angolról magyarra a blog egyik posztjánál

	Scenario: A nyelvválasztó átállítása magyarról angolra a blog egyik indexszel hivatkozott posztjánál

	Scenario: A nyelvválasztó átállítása angolról magyarra a blog egyik indexszel hivatkozott posztjánál

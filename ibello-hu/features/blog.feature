# namespace: Blog
@blog
Feature: Az ibello blog tesztelése

	Scenario: Egy poszt tesztelése
		Given Blog: Megnyitom a blog oldalt
		Given Blog: Kiválasztok egy posztot
		Given Blog: Ellenőrzöm hogy a poszt megjelenik a blog oldalon

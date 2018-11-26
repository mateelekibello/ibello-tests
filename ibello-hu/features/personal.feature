# namespace: Személyes
Feature: Personal

	Scenario: Személyes adatok átírása
		Given Személyes: Felhasználói adatok átírása
		Given Személyes: Kijelentkezek a Személyes oldalról
		Given Személyes: Megpróbálok bejelentkezni egy regisztrált felhasználóval
		Given Személyes: Az átírt adatok ellenőrzése
		Given Személyes: Felhasználói adatok visszaállítása

	Scenario: Bejelentkezés
		When Személyes: Megpróbálok bejelentkezni egy regisztrált felhasználóval

	Scenario: Kijelentkezés
		When Személyes: Kijelentkezek a Személyes oldalról

# namespace: Bejelentkezés
Feature: Login

	Scenario: Nem regisztrált felhasználó belépése sikertelen
		Given Bejelentkezés: Az ibello bejelentkező oldalán vagyok
		When Bejelentkezés: Megpróbálok bejelentkezni egy nem regisztrált felhasználóval
		Then Bejelentkezés: A bejelentkezés sikertelen

	Scenario: Regisztrált felhasználó belépése sikeres
		Given Bejelentkezés: Az ibello bejelentkező oldalán vagyok
		When Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználóval
		Then Bejelentkezés: A bejelentkezés sikeres

	Scenario: Belépek a licence tulajdonosával

	Scenario: Belépek a licence felhasználójával

# namespace: Bejelentkezés
Feature: Login

	Scenario: Nem regisztrált felhasználó belépése sikertelen
		Given Bejelentkezés: Az ibello bejelentkező oldalán vagyok
		When Bejelentkezés: Megpróbálok bejelentkezni egy nem regisztrált felhasználóval
		Then Bejelentkezés: A bejelentkezés sikertelen

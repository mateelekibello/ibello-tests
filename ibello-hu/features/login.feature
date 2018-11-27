# namespace: Bejelentkezés
@login
Feature: Login

	Scenario: Nem regisztrált felhasználó belépése sikertelen
		Given Bejelentkezés: Az ibello bejelentkező oldalán vagyok
		When Bejelentkezés: Megpróbálok bejelentkezni egy nem regisztrált felhasználóval
		Then Bejelentkezés: A bejelentkezés sikertelen

	Scenario: Regisztrált felhasználó belépése sikeres
		Given Bejelentkezés: Az ibello bejelentkező oldalán vagyok
		When Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználóval
		Then Bejelentkezés: A bejelentkezés sikeres
		Given Bejelentkezés: Kijelentkezek a Személyes oldalról

	Scenario: Nem létező felhasználó bejelentkezése sikertelen
		Given Bejelentkezés: Az ibello bejelentkező oldalán vagyok
		When Bejelentkezés: Megpróbálok bejelentkezni egy nem létező felhasználóval
		Then Bejelentkezés: A bejelentkezés sikertelen

	Scenario: Regisztrált felhasználó belépése e-mail-címmel sikeres
		Given Bejelentkezés: Az ibello bejelentkező oldalán vagyok
		When Bejelentkezés: Megpróbálok bejelentkezni egy regisztrált felhasználó e-mail-címével
		Then Bejelentkezés: A bejelentkezés sikeres
		Given Bejelentkezés: Kijelentkezek a Személyes oldalról

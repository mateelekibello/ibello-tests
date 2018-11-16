# namespace: Licencek
Feature: null

	Scenario: Tulajdonos érvényes licencet engedélyez
		Given Licence: megnyitom a licencek oldalt
		When Licence: engedélyezem a licencem

	Scenario: Tulajdonos lejárt licencet engedélyez
		Given Licence: megnyitom a licencek oldalt
		When Licence: engedélyezem a lejárt licencem

	Scenario: Tulajdonos érvényes licencet visszavon
		Given Licence: megnyitom a licencek oldalt
		When Licence: visszavonom a licencem

	Scenario: Felhasználó licencet visszaad

	Scenario: Licence megrendelése
		Given Licence: megnyitom a licencek oldalt
		When Licence: megrendelem a licencem

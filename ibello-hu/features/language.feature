# namespace: Nyelvválasztó
@language
Feature: A nyelvválasztó viselkedésének tesztelése

	Scenario: A nyelvválasztó tesztelése blog oldalon
		Given Nyelvválasztó:	A megnyitott blog oldal magyarul van
		And Nyelvválasztó:	A blog oldal létezik angolul is
		When Nyelvválasztó: Angol Nyelv Kiválasztása
		Then Nyelvválasztó:	A blog szövege angolul jelenik meg
		And Nyelvválasztó:	A blog fejléce angolul jelenik meg
		Given Nyelvválasztó:	Angolra váltott nyelvű a blog oldal
		When Nyelvválasztó: Magyar Nyelv Kiválasztása
		Then Nyelvválasztó:	A blog szövege magyarul jelenik meg
		And Nyelvválasztó:	A blog fejléce magyarul jelenik meg
		Given Nyelvválasztó:	A megnyitott blog oldal angoul van
		And Nyelvválasztó:	A blog oldal létezik magarul is
		When Nyelvválasztó: Magyar Nyelv Kiválasztása
		Then Nyelvválasztó:	A blog szövege magyarul jelenik meg
		And Nyelvválasztó:	A blog fejléce magyarul jelenik meg
		Given Nyelvválasztó:	Magyarra váltott nyelvű a blog oldal
		When Nyelvválasztó: Angol Nyelv Kiválasztása
		Then Nyelvválasztó:	A blog szövege angolul jelenik meg
		And Nyelvválasztó:	A blog fejléce angolul jelenik meg

# namespace: Nyelvválasztó
@language
Feature: A nyelvválasztó viselkedésének tesztelése

	Scenario:	A nyelvválasztó tesztelése blog oldalon
		Given Nyelvválasztó:	A megnyitott blog oldal magyarul van
		And Nyelvválasztó:	A blog oldal létezik angolul is
		
		When Nyelvválasztó:	Átváltjuk a nyelvváltót angolra
		Then Nyelvválasztó:	A blog szövege angolul jelenik meg
		And Nyelvválasztó:	A blog fejléce angolul jelenik meg
		
		Given Nyelvválasztó:	Angolra váltott nyelvű a blog oldal
	
		When Nyelvválasztó:	Visszaváltjuk a nyelvválasztót magyarra
		Then Nyelvválasztó:	A blog szövege magyarul jelenik meg
		And Nyelvválasztó:	A blog fejéce magyarul jelenik meg
		
		
		
		Given Nyelvválasztó:	A megnyitott blog oldal angoul van
		And Nyelvválasztó:	A blog oldal létezik magarul is
		
		When Nyelvválasztó:	Átváltjuk a nyelvváltót magyarra
		Then Nyelvválasztó:	A blog szövege magyarul jelenik meg
		And Nyelvválasztó:	A blog fejléce magyarul jelenik meg
		
		Given Nyelvválasztó:	Magyarra váltott nyelvű a blog oldal
	
		When Nyelvválasztó:	Visszaváltjuk a nyelvválasztót angolra
		Then Nyelvválasztó:	A blog szövege angolul jelenik meg
		And Nyelvválasztó:	A blog fejéce angolul jelenik meg
		
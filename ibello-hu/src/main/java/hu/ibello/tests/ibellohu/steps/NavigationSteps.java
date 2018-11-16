package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.tests.ibellohu.pages.LoginPage;
import hu.ibello.tests.ibellohu.pages.MainPage;
import hu.ibello.tests.ibellohu.pages.PersonalPage;

@Name("Navigáció")
public class NavigationSteps extends AbstractSteps {
	
	private MainPage mainPage;
	private LoginPage loginPage;
	private PersonalPage personalPage;

	@Name("Az ibello honlapján vagyok")
	public void az_ibello_honlapján_vagyok() {
		mainPage.megnyitás();
		mainPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
	@Name("Megnyitom a bejelentkező oldalt")
	public void megnyitom_a_bejelentkező_oldalt() {
		mainPage.menü_elem_ügyfeleknek();
		loginPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
	@Name("Megnyílik az ibello Személyes oldala")
	public void megnyílik_az_ibello_személyes_oldala() {
		personalPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}

	
}

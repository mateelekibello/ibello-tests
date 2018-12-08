package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.tests.ibellohu.pages.MainPage;
import hu.ibello.tests.ibellohu.pages.MenuPage;
import hu.ibello.tests.ibellohu.pages.LoginPage;
import hu.ibello.tests.ibellohu.pages.PersonalPage;
import hu.ibello.tests.ibellohu.pages.LicensesPage;
import hu.ibello.tests.ibellohu.pages.OrderPage;

@Name("Navigáció")
public class NavigationSteps extends AbstractSteps {
	
	private MainPage mainPage;
	private MenuPage menuPage;
	private LoginPage loginPage;
	private PersonalPage personalPage;
	private LicensesPage licensesPage;
	private OrderPage orderPage;

	@Name("Az ibello honlapján vagyok")
	public void az_ibello_honlapján_vagyok() {
		mainPage.megnyitás();
		mainPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
	@Name("Megnyitom a bejelentkező oldalt")
	public void megnyitom_a_bejelentkező_oldalt() {
		menuPage.ügyfeleknek_menüelem_választása();
		loginPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
	@Name("Megnyitom a Licencek oldalt")
	public void megnyitom_a_licencek_oldalt() {
		menuPage.licencek_menüelem_választása();
		licensesPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
	@Name("Megnyílik az ibello Bejelentkező oldala")
	public void megnyílik_az_ibello_bejelentkező_oldala() {
		loginPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
	@Name("Megnyílik az ibello Személyes oldala")
	public void megnyílik_az_ibello_személyes_oldala() {
		personalPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}

	@Name("Ellenőrzöm hogy a bejelentkezett menü látható")
	public void ellenőrzöm_hogy_a_bejelentkezett_menü_látható( ) {
		menuPage.ellenőrzés_hogy_a_bejelentkezett_menü_látható();
	}
}

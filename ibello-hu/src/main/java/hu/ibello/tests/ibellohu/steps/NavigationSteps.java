package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.tests.ibellohu.pages.LicensesPage;
import hu.ibello.tests.ibellohu.pages.LoginPage;
import hu.ibello.tests.ibellohu.pages.MainPage;
import hu.ibello.tests.ibellohu.pages.OpenPage;
import hu.ibello.tests.ibellohu.pages.MenuPage;
import hu.ibello.tests.ibellohu.pages.OrderPage;
import hu.ibello.tests.ibellohu.pages.PersonalPage;

@Name("Navigáció")
public class NavigationSteps extends AbstractSteps {
	
	private MainPage mainPage;
	private OpenPage openPage;
	private MenuPage menuPage;
	private LoginPage loginPage;
	private PersonalPage personalPage;
	private LicensesPage licensesPage;
	private OrderPage orderPage;

//	@Name("Az ibello honlapján vagyok")
	public void az_ibello_honlapján_vagyok() {
		mainPage.megnyitás();
		mainPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
//	@Name("Megnyitom a bejelentkező oldalt")
	public void megnyitom_a_bejelentkező_oldalt() {
		menuPage.nyitóoldali_bejelentkezés_menüelem_választása();
		loginPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}

//	@Name("Megnyitom a személyes oldalt")
	public void megnyitom_a_személyes_oldalt() {
		openPage.kattintás_a_személyes_beállítások_gombra();
		personalPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
//	@Name("Megnyitom a licencek oldalt")
	public void megnyitom_a_licencek_oldalt() {
		openPage.kattintás_a_licencek_kezelése_gomra();
		licensesPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
//	@Name("Megnyitom a megrendelés oldalt")
	public void megnyitom_a_megrendelés_oldalt() {
		openPage.kattintás_az_új_licenc_megrendelése_gomra();
		licensesPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
//	@Name("Megnyílik az ibello bejelentkező oldala")
	public void megnyílik_az_ibello_bejelentkező_oldala() {
		loginPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
//	@Name("Megnyílik az ibello nyitóoldala")
	public void megnyílik_az_ibello_nyitóoldala() {
		openPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
//	@Name("Megnyílik az ibello személyes oldala")
	public void megnyílik_az_ibello_személyes_oldala() {
		personalPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
//	@Name("Megnyílik a megrendelő oldal")
	public void megnyílik_a_megrendelő_oldal() {
		orderPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}
	
//	@Name("Megnyílik a licencek oldal")
	public void megnyílik_a_licencek_oldal() {
		licensesPage.ellenőrzés_hogy_az_oldal_megnyílt();
	}

}
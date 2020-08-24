package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class HomePage extends AbstractPage {

	@Find(by=By.BUTTON_TEXT, using="${homePage.licensesButton}")
	private WebElement licensesButton;
	
	@Find(by=By.BUTTON_TEXT, using="${homePage.orderButton}")
	private WebElement orderButton;

	@Find(by=By.BUTTON_TEXT, using="${homePage.personalButton}")
	private WebElement personalButton;
	
	@Find(by=By.BUTTON_TEXT, using="${homePage.logoutButton}")
	private WebElement logoutButton;
	
	@Find(by=By.ID, using="personal-lane")
	private WebElement personalLane;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(personalLane).toBe().displayed();
	}

	public void kattintás_a_licencek_kezelése_gomra() {
		doWith(licensesButton).click();
	}
	
	public void kattintás_az_új_licenc_megrendelése_gomra() {
		doWith(orderButton).click();
	}
	
	public void kattintás_a_személyes_beállítások_gombra() {
		doWith(personalButton).click();
	}
	
	public void kattintás_a_kilépés_gombra() {
		doWith(logoutButton).click();
	}

}

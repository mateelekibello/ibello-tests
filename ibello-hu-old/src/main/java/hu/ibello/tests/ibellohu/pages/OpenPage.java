package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class OpenPage extends AbstractPage {
	
	@Find(by=By.BUTTON_TEXT, using="${openPage.licensesButton}")
	private WebElement licensesButton;
	
	@Find(by=By.BUTTON_TEXT, using="${openPage.orderButton}")
	private WebElement orderButton;

	@Find(by=By.BUTTON_TEXT, using="${openPage.personalButton}")
	private WebElement personalButton;
	
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

}

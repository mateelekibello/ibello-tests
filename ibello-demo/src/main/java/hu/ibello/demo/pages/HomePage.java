package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class HomePage extends PageObject {

	@Find(by=By.BUTTON_TEXT, using="Kilépés")
	private WebElement kilépésButton;
	
	@Find(by=By.BUTTON_TEXT, using="Licencek kezelése")
	private WebElement licencekKezeléseButton;
	
	@Find(by=By.BUTTON_TEXT, using="További dokumentációk")
	private WebElement továbbiDokumentációkLink;
	
	public void expect_page_is_opened() {
		expectations().expect(kilépésButton).toBe().displayed();
	}
	
	public void click_kilépés_button() {
		doWith(kilépésButton).withPageRefreshWait().click();
	}
	
	public void click_licencek_kezelése_button() {
		doWith(licencekKezeléseButton).withPageRefreshWait().click();
	}
	
	public void click_további_dokumentációk_link() {
		doWith(továbbiDokumentációkLink).withPageRefreshWait().click();
	}
}

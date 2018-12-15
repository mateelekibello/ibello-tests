package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class MenuPage extends AbstractPage {
	
	@Find(by=By.CLASS_NAME, using="navbar-brand")
	private WebElement navbarBrandLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.advantages}")
	private WebElement előnyökLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.customers}")
	private WebElement ügyfeleknekLink;
	
	@Find(by=By.BUTTON_TEXT, using="${loginPage.menu.login}")
	private WebElement bejelentkezésLink;
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.logout}")
	private WebElement kijelentkezésLink;
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.licenses}")
	private WebElement licencekLink;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(navbarBrandLink).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_főoldali_menü_látható() {
		expectations().expect(előnyökLink).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_alkalmazás_menü_látható() {
		expectations().expect(bejelentkezésLink).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_bejelentkezett_menü_látható() {
		expectations().expect(kijelentkezésLink).toBe().displayed();
	}
	
	public boolean főoldali_menü() {
		return checkThat(előnyökLink).isDisplayed();
	}
	
	public boolean alkalmazás_menü() {
		return checkThat(bejelentkezésLink).isDisplayed();
	}
	
	public boolean bejelentkezett_menü() {
		return checkThat(kijelentkezésLink).isDisplayed();
	}
	
	public void előnyök_menüelem_választása() {
		doWith(előnyökLink).click();
	}
	
	public void ügyfeleknek_menüelem_választása() {
		doWith(ügyfeleknekLink).click();
	}
	
	public void bejelentkezés_menüelem_választása() {
		doWith(bejelentkezésLink).click();
	}
	
	public void kijelentkezés_menüelem_választása() {
		doWith(kijelentkezésLink).click();
	}
	
	public void licencek_menüelem_választása() {
		doWith(licencekLink).click();
	}
}

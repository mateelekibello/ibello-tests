package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class MenuPage extends AbstractPage {
	
	@Find(by=By.CLASS_NAME, using="navbar-brand")
	private WebElement navbarBrandLink;
	
	@Find(by=By.BUTTON_TEXT, using="Előnyök")
	private WebElement előnyökLink;
	
	@Find(by=By.BUTTON_TEXT, using="Bejelentkezés")
	private WebElement bejelentkezésLink;
	
	@Find(by=By.BUTTON_TEXT, using="Kijelentkezés")
	private WebElement kijelentkezésLink;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(navbarBrandLink).toBe().displayed();
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
}

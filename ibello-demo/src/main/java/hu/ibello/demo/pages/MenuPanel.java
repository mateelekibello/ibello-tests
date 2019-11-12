package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class MenuPanel extends PageObject {

	@Find(by=By.CSS_SELECTOR, using="[title='Bejelentkezés']")
	private WebElement bejelentkezésLink;

	@Find(by=By.CLASS_NAME, using="navbar-brand")
	private WebElement navbarBrandLink;
	
	@Find(by=By.CSS_SELECTOR, using="[title='Főoldal']")
	private WebElement főoldalLink;

	public void click_bejelentkezés_link() {
		doWith(bejelentkezésLink).withPageRefreshWait().click();
	}
	
	public void click_navbar_brand_link() {
		doWith(navbarBrandLink).withPageRefreshWait().click();
	}
	
	public void click_főoldal_link() {
		doWith(főoldalLink).withPageRefreshWait().click();
	}
	
}

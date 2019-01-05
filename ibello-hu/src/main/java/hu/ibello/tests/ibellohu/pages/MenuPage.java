package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class MenuPage extends AbstractPage {
	
	@Find(by=By.CLASS_NAME, using="navbar-brand")
	private WebElement navbarBrandLink;
	
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.advantages}")
	private WebElement advantagesLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.about}")
	private WebElement aboutLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.support}")
	private WebElement supportLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.pricing}")
	private WebElement pricingLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.contact}")
	private WebElement contactLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.blog}")
	private WebElement blogLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.customers}")
	private WebElement customersLink;
	
	
	@Find(by=By.BUTTON_TEXT, using="${loginPage.menu.documentation}")
	private WebElement documentationLink1;
	
	@Find(by=By.BUTTON_TEXT, using="${loginPage.menu.blog}")
	private WebElement blogLink1;
	
	@Find(by=By.BUTTON_TEXT, using="${loginPage.menu.downloads}")
	private WebElement downloadsLink1;
	
	@Find(by=By.BUTTON_TEXT, using="${loginPage.menu.login}")
	private WebElement loginLink;
	
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.documentation}")
	private WebElement documentationLink2;
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.blog}")
	private WebElement blogLink2;
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.downloads}")
	private WebElement downloadsLink2;
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.home}")
	private WebElement homeLink;
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.licenses}")
	private WebElement licensesLink;
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.logout}")
	private WebElement logoutLink;
	
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(navbarBrandLink).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_főoldali_menü_látható() {
		expectations().expect(advantagesLink).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_alkalmazás_menü_látható() {
		expectations().expect(loginLink).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_bejelentkezett_menü_látható() {
		expectations().expect(logoutLink).toBe().displayed();
	}
	
	public boolean főoldali_menü() {
		return checkThat(advantagesLink).isDisplayed();
	}
	
	public boolean alkalmazás_menü() {
		return checkThat(loginLink).isDisplayed();
	}
	
	public boolean bejelentkezett_menü() {
		return checkThat(logoutLink).isDisplayed();
	}
	
	public void ibello_menüelem_választása() {
		doWith(advantagesLink).click();
	}
	
	public void főoldali_előnyök_menüelem_választása() {
		doWith(advantagesLink).click();
	}
	
	public void főoldali_bemutatkozás_menüelem_választása() {
		doWith(aboutLink).click();
	}
	
	public void főoldali_dokumentációk_menüelem_választása() {
		doWith(supportLink).click();
	}
	
	public void főoldali_árak_menüelem_választása() {
		doWith(pricingLink).click();
	}
	
	public void főoldali_kapcsolat_menüelem_választása() {
		doWith(contactLink).click();
	}
	
	public void főoldali_blog_menüelem_választása() {
		doWith(blogLink).click();
	}
	
	public void főoldali_ügyfeleknek_menüelem_választása() {
		doWith(customersLink).click();
	}
	
	
	public void alkalmazás_dokumentációk_menüelem_választása() {
		doWith(documentationLink1).click();
	}
	
	public void alkalmazás_blog_menüelem_választása() {
		doWith(blogLink1).click();
	}
	
	public void alkalmazás_letöltések_menüelem_választása() {
		doWith(downloadsLink1).click();
	}
	
	public void alkalmazás_bejelentkezés_menüelem_választása() {
		doWith(loginLink).click();
	}
	
	
	public void bejelentkezett_dokumentációk_menüelem_választása() {
		doWith(documentationLink2).click();
	}
	
	public void bejelentkezett_blog_menüelem_választása() {
		doWith(blogLink2).click();
	}
	
	public void bejelentkezett_letöltések_menüelem_választása() {
		doWith(downloadsLink2).click();
	}
	
	public void bejelentkezett_személyes_menüelem_választása() {
		doWith(homeLink).click();
	}
	
	public void bejelentkezett_licencek_menüelem_választása() {
		doWith(licensesLink).click();
	}
	
	public void bejelentkezett_kijelentkezés_menüelem_választása() {
		doWith(logoutLink).click();
	}
}

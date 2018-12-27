package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class MenuPage extends AbstractPage {
	
	@Find(by=By.CLASS_NAME, using="navbar-brand")
	private WebElement navbarBrandLink;
	
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.advantages}")
	private WebElement előnyökLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.about}")
	private WebElement bemutatkozásLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.support}")
	private WebElement dokumentációkLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.pricing}")
	private WebElement árakLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.contact}")
	private WebElement kapcsolatLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.blog}")
	private WebElement blogLink;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.customers}")
	private WebElement ügyfeleknekLink;
	
	
	@Find(by=By.BUTTON_TEXT, using="${loginPage.menu.documentation}")
	private WebElement dokumentációkLink1;
	
	@Find(by=By.BUTTON_TEXT, using="${loginPage.menu.blog}")
	private WebElement blogLink1;
	
	@Find(by=By.BUTTON_TEXT, using="${loginPage.menu.downloads}")
	private WebElement letöltésekLink1;
	
	@Find(by=By.BUTTON_TEXT, using="${loginPage.menu.login}")
	private WebElement bejelentkezésLink;
	
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.documentation}")
	private WebElement dokumentációkLink2;
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.blog}")
	private WebElement blogLink2;
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.downloads}")
	private WebElement letöltésekLink2;
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.home}")
	private WebElement személyesLink;
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.licenses}")
	private WebElement licencekLink;
	
	@Find(by=By.BUTTON_TEXT, using="${personalPage.menu.logout}")
	private WebElement kijelentkezésLink;
	
	
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
	
	public void ibello_menüelem_választása() {
		doWith(előnyökLink).click();
	}
	
	public void főoldali_előnyök_menüelem_választása() {
		doWith(előnyökLink).click();
	}
	
	public void főoldali_bemutatkozás_menüelem_választása() {
		doWith(bemutatkozásLink).click();
	}
	
	public void főoldali_dokumentációk_menüelem_választása() {
		doWith(dokumentációkLink).click();
	}
	
	public void főoldali_árak_menüelem_választása() {
		doWith(árakLink).click();
	}
	
	public void főoldali_kapcsolat_menüelem_választása() {
		doWith(kapcsolatLink).click();
	}
	
	public void főoldali_blog_menüelem_választása() {
		doWith(blogLink).click();
	}
	
	public void főoldali_ügyfeleknek_menüelem_választása() {
		doWith(ügyfeleknekLink).click();
	}
	
	
	public void alkalmazás_dokumentációk_menüelem_választása() {
		doWith(dokumentációkLink1).click();
	}
	
	public void alkalmazás_blog_menüelem_választása() {
		doWith(blogLink1).click();
	}
	
	public void alkalmazás_letöltések_menüelem_választása() {
		doWith(letöltésekLink1).click();
	}
	
	public void alkalmazás_bejelentkezés_menüelem_választása() {
		doWith(bejelentkezésLink).click();
	}
	
	
	public void bejelentkezett_dokumentációk_menüelem_választása() {
		doWith(dokumentációkLink2).click();
	}
	
	public void bejelentkezett_blog_menüelem_választása() {
		doWith(blogLink2).click();
	}
	
	public void bejelentkezett_letöltések_menüelem_választása() {
		doWith(letöltésekLink2).click();
	}
	
	public void bejelentkezett_személyes_menüelem_választása() {
		doWith(személyesLink).click();
	}
	
	public void bejelentkezett_licencek_menüelem_választása() {
		doWith(licencekLink).click();
	}
	
	public void bejelentkezett_kijelentkezés_menüelem_választása() {
		doWith(kijelentkezésLink).click();
	}
}

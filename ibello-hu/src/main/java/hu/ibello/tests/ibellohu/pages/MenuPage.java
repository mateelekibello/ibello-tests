package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class MenuPage extends AbstractPage {
	
	@Find(by=By.CLASS_NAME, using="navbar-brand")
	private WebElement navbarBrandLink;
	
	
	@Find(by=By.BUTTON_TEXT, using="${menu.blog}")
	private WebElement outLandingBlogLink;
	
	@Find(by=By.CSS_SELECTOR, using="[title='${menu.login}']")
	private WebElement outLandingLoginLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.services}")
	private WebElement outLandingServicesLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.advantages}")
	private WebElement outLandingAdvantagesLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.docs}")
	private WebElement outLandingDocsLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.pricing}")
	private WebElement outLandingPricingLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.contact}")
	private WebElement outLandingContactLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.blog}")
	private WebElement inLandingBlogLink;
	
	@Find(by=By.CSS_SELECTOR, using="[title='${menu.logout}']")
	private WebElement inLandingLogoutLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.docs}")
	private WebElement inLandingDocsLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.docs}")
	private WebElement inLandingDownloadsLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.docs}")
	private WebElement inLandingLicensesLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.contact}")
	private WebElement inLandingContactLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.landing}")
	private WebElement outOtherLandingLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.blog}")
	private WebElement outOtherBlogLink;
	
	@Find(by=By.CSS_SELECTOR, using="[title='${menu.login}']")
	private WebElement outOtherLoginLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.landing}")
	private WebElement inOtherLandingLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.blog}")
	private WebElement inOtherBlogLink;
	
	@Find(by=By.CSS_SELECTOR, using="[title='${menu.logout}']")
	private WebElement inOtherLogoutLink;
	
	@Find(by=By.TAG_NAME, using="select")
	private WebElement languageSelectField;
	
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(navbarBrandLink).toBe().displayed();
	}
	
	public boolean nyilóoldali_menü() {
		return !checkThat(inOtherLandingLink).isDisplayed();
	}
	
	public boolean bejelentkezett_menü() {
		return checkThat(inOtherLogoutLink).isDisplayed();
	}
	
	public void ibello_menüelem_választása() {
		doWith(navbarBrandLink).click();
	}
	
	
	public void nyitóoldali_blog_menüelem_választása() {
		doWith(outLandingBlogLink).click();
	}
	
	public void nyitóoldali_bejelentkezés_menüelem_választása() {
		doWith(outLandingLoginLink).click();
	}
	
	public void bejelentkezett_nyitóoldali_blog_menüelem_választása() {
		doWith(inLandingBlogLink).click();
	}
	
	public void bejelentkezett_nyitóoldali_kijelentkezés_menüelem_választása() {
		doWith(inLandingLogoutLink).click();
	}
	
	public void blog_menüelem_választása() {
		doWith(outOtherBlogLink).click();
	}
	
	public void bejelentkezés_menüelem_választása() {
		doWith(outOtherLoginLink).click();
	}
	
	public void nyitóoldal_menüelem_választása() {
		doWith(outOtherLandingLink).click();
	}
	
	public void bejelentkezett_blog_menüelem_választása() {
		doWith(inOtherBlogLink).click();
	}
	
	public void bejelentkezett_kijelentkezés_menüelem_választása() {
		doWith(inOtherLogoutLink).click();
	}
	
	public void bejelentkezett_nyitóoldal_menüelem_választása() {
		doWith(inOtherLandingLink).click();
	}
	
	public void beállítom_a_nyelvválasztót(String language) {
		doWith(languageSelectField).selectOption(language);
	}
	
}

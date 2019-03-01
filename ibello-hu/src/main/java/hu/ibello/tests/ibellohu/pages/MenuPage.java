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
	
	@Find(by=By.BUTTON_TEXT, using="${menu.dowloads}")
	private WebElement outLandingDownloadsLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.licenses}")
	private WebElement outLandingLicensesLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.overview}")
	private WebElement outLandingOverviewLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.contact}")
	private WebElement outLandingContactLink;
	
/*	
	@Find(by=By.CSS_SELECTOR, using="[title='${menu.logout}']")
	private WebElement inLandingLogoutLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.personal}")
	private WebElement inLandingPersonalLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.dowloads}")
	private WebElement inLandingDownloadsLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.licenses}")
	private WebElement inLandingLicensesLane;
	*/
	@Find(by=By.BUTTON_TEXT, using="${menu.blog}")
	private WebElement inLandingBlogLink;
	
	@Find(by=By.CSS_SELECTOR, using="[title='${menu.home}']")
	private WebElement inLandingHomeLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.company}")
	private WebElement inLandingCompanyLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.evaluate}")
	private WebElement inLandingEvaluateLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.overview}")
	private WebElement inLandingOverviewLane;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.contact}")
	private WebElement inLandingContactLane;
	
	/*
	@Find(by=By.BUTTON_TEXT, using="${menu.landing}")
	private WebElement outOtherLandingLink;
	*/
	@Find(by=By.BUTTON_TEXT, using="${menu.blog}")
	private WebElement outOtherBlogLink;
	
	@Find(by=By.CSS_SELECTOR, using="[title='${menu.login}']")
	private WebElement outOtherLoginLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.dowloads}")
	private WebElement outOtherDownloadsLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.licenses}")
	private WebElement outOtherLicensesLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.overview}")
	private WebElement outOtherOverviewLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.contact}")
	private WebElement outOtherContactLink;
/*	
	@Find(by=By.CSS_SELECTOR, using="[title='${menu.logout}']")
	private WebElement inOtherLogoutLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.landing}")
	private WebElement inOtherLandingLink;
	*/
	@Find(by=By.BUTTON_TEXT, using="${menu.blog}")
	private WebElement inOtherBlogLink;
	
	@Find(by=By.CSS_SELECTOR, using="[title='${menu.home}']")
	private WebElement inOtherHomeLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.dowloads}")
	private WebElement inOtherDownloadsLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.licenses}")
	private WebElement inOtherLicensesLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.overview}")
	private WebElement inOtherOverviewLink;
	
	@Find(by=By.BUTTON_TEXT, using="${menu.contact}")
	private WebElement inOtherContactLink;
	
	
	@Find(by=By.TAG_NAME, using="select")
	private WebElement languageSelectField;
	
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(navbarBrandLink).toBe().displayed();
	}
	/*
	public boolean nyilóoldali_menü() {
		return !checkThat(inOtherHomeLink).isDisplayed();
	}
	
	public boolean bejelentkezett_menü() {
		return checkThat(inOtherHomeLink).isDisplayed();
	}
	*/
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
		doWith(inLandingHomeLink).click();
	}
	
	public void blog_menüelem_választása() {
		doWith(outOtherBlogLink).click();
	}
	
	public void bejelentkezés_menüelem_választása() {
		doWith(outOtherLoginLink).click();
	}
	/*
	public void nyitóoldal_menüelem_választása() {
		doWith(outOtherLandingLink).click();
	}
	*/
	public void bejelentkezett_blog_menüelem_választása() {
		doWith(inOtherBlogLink).click();
	}
	/*
	public void bejelentkezett_kijelentkezés_menüelem_választása() {
		doWith(inOtherLogoutLink).click();
	}
	
	public void bejelentkezett_nyitóoldal_menüelem_választása() {
		doWith(inOtherLandingLink).click();
	}
	*/
	public void beállítom_a_nyelvválasztót(String language) {
		doWith(languageSelectField).selectOption(language);
	}
	
	public void a_nyelvválasztó_állásának_ellenőrzése(String language) {
		expectations().expect(languageSelectField).toHave().selectedOption(language);
	}
	
	public void főoldal_menüelem_választása() {
		doWith(inOtherHomeLink).click();
	}
	
}

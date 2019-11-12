package hu.ibello.demo.pages;

import hu.ibello.core.Name;
import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;

@Name("Landing Page")
public class LandingPage extends PageObject {

	@Find(by=By.BUTTON_TEXT, using="További dokumentációk")
	private WebElement továbbiDokumentációkLink;
	
	public void open_page() {
		browser().openURL(getConfigurationValue("baseUrl").toString());
	}

	public void click_további_dokumentációk_link() {
		doWith(továbbiDokumentációkLink).withPageRefreshWait().click();
	}
}

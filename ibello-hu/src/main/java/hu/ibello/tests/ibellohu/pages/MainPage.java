package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class MainPage extends AbstractPage {

	@Find(by=By.CLASS_NAME, using="revslider-initialised")
	private WebElement slider;
	
	@Find(by=By.BUTTON_TEXT, using="${mainPage.menu.customers}")
	private WebElement ügyfeleknekLink;
	
	public void megnyitás() {
		String url = getConfigurationValue("main.url").toString();
		browser().openURL(url);
	}
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(slider).toBe().displayed();
	}
	
	public void menü_elem_ügyfeleknek() {
		doWith(ügyfeleknekLink).click();
	}
	
}

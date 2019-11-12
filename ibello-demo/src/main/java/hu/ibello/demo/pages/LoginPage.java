package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class LoginPage extends PageObject {

	@Find(by=By.NAME, using="userid")
	private WebElement useridField;
	
	@Find(by=By.NAME, using="password")
	private WebElement passwordField;
	
	@Find(by=By.BUTTON_TEXT, using="Bejelentkezés")
	private WebElement submitButton;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.CSS_SELECTOR, using=".page-title")
	@Find(by=By.TEXT, using="Bejelentkezés")
	private WebElement title;
	
	public void expect_page_is_opened() {
		expectations().expect(title).toBe().displayed();
	}
	
	public void set_userid_field(String value) {
		doWith(useridField).setValue(value);
	}
	
	public void set_password_field(String value) {
		doWith(passwordField).setValue(value);
	}
	
	public void click_submit_button() {
		doWith(submitButton).withPageRefreshWait().click();
	}
}

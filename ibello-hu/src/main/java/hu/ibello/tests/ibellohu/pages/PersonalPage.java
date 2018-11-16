package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.inject.Inject;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;
import hu.ibello.tests.ibellohu.tools.TestData;


public class PersonalPage extends AbstractPage {
	
	@Inject
	private TestData testData;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.CLASS_NAME, using="page-title")
	@Find(by=By.TEXT, using="${personalPage.title}")
	private WebElement pageTitle;
	
	@Find(by=By.ID, using="username")
	private WebElement usernameField;
	
	@Find(by=By.ID, using="email")
	private WebElement emailField;
	
	@Find(by=By.ID, using="firstName")
	private WebElement firstNameField;
	
	@Find(by=By.ID, using="lastName")
	private WebElement lastNameField;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(pageTitle).toBe().displayed();
	}
	
	public void felhasználóNév(String value) {
		expectations().assume(usernameField).toHave().value(value);
	}
	
	public void emailCím(String value) {
		expectations().assume(emailField).toHave().value(value);
	}
	
	public void keresztnév(String value) {
		expectations().assume(firstNameField).toHave().value(value);
	}
	
	public void vezetéknév(String value) {
		expectations().assume(lastNameField).toHave().value(value);
	}
	
	public void felhasználóiAdatok() {
		felhasználóNév(testData.user.username);
		emailCím(testData.user.email);
		keresztnév(testData.user.firstname);
		vezetéknév(testData.user.lastname);
	}
	
}

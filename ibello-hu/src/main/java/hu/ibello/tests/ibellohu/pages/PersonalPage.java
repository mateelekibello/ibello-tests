package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.inject.Inject;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;
import hu.ibello.tests.ibellohu.tools.TestData;


public class PersonalPage extends AbstractPage {
	
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
	
	@Find(by=By.ID, using="companyName")
	private WebElement companyNameField;
	
	@Find(by=By.ID, using="billingFirstName")
	private WebElement billingFirstNameField;
	
	@Find(by=By.ID, using="billingLastName")
	private WebElement billingLastNameField;
	
	@Find(by=By.ID, using="billingCompanyName")
	private WebElement billingCompanyNameField;
	
	@Find(by=By.ID, using="billingTaxNumber")
	private WebElement billingTaxNumberField;
	
	@Find(by=By.ID, using="billingCountry")
	private WebElement billingCountryField;
	
	@Find(by=By.ID, using="billingCity")
	private WebElement billingCityField;
	
	@Find(by=By.ID, using="billingState")
	private WebElement billingStateField;

	@Find(by=By.ID, using="billingZipCode")
	private WebElement billingZipCodeField;
	
	@Find(by=By.ID, using="billingAddressLine1")
	private WebElement billingAddressLine1Field;
	
	@Find(by=By.ID, using="billingAddressLine2")
	private WebElement billingAddressLine2Field;
	
	@Find(by=By.BUTTON_TEXT, using="Kijelentkezés")
	private WebElement kijelentkezésLink;
	
	@Find(by=By.BUTTON_TEXT, using="Mentés")
	private WebElement submitButton;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(pageTitle).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_felhasználónév_$(String value) {
		expectations().assume(usernameField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_az_emailCím_$(String value) {
		expectations().assume(emailField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_keresztnév_$(String value) {
		expectations().assume(firstNameField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_vezetéknév_$(String value) {
		expectations().assume(lastNameField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_szervezet_neve_$(String value) {
		expectations().assume(companyNameField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_számlázási_keresztnév_$(String value) {
		expectations().assume(billingFirstNameField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_számlázási_vezetéknév_$(String value) {
		expectations().assume(billingCompanyNameField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_számlázási_szervezet_neve_$(String value) {
		expectations().assume(billingLastNameField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_számlázási_adószám_$(String value) {
		expectations().assume(billingTaxNumberField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_számlázási_ország_$(String value) {
		expectations().assume(billingCountryField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_számlázási_város_$(String value) {
		expectations().assume(billingCityField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_számlázási_állam_$(String value) {
		expectations().assume(billingStateField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_számlázási_irányítószám_$(String value) {
		expectations().assume(billingZipCodeField).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_számlázási_cím_eleje_$(String value) {
		expectations().assume(billingAddressLine1Field).toHave().value(value);
	}
	
	public void ellenőrzés_hogy_a_számlázási_cím_vége_$(String value) {
		expectations().assume(billingAddressLine2Field).toHave().value(value);
	}
	
	public void a_felhasználónév_legyen_$(String value) {
		doWith(usernameField).setValue(value);
	}
	
	public void az_emailcím_legyen_$(String value) {
		doWith(emailField).setValue(value);
	}
	
	public void a_keresztnév_legyen_$(String value) {
		doWith(firstNameField).setValue(value);
	}
	
	public void a_vezetéknév_legyen_$(String value) {
		doWith(lastNameField).setValue(value);
	}
	
	public void a_szervezet_neve_legyen_$(String value) {
		doWith(companyNameField).setValue(value);
	}
	
	public void a_számlázási_keresztnév_legyen_$(String value) {
		doWith(billingFirstNameField).setValue(value);
	}
	
	public void a_számlázási_vezetéknév_legyen_$(String value) {
		doWith(billingLastNameField).setValue(value);
	}
	
	public void a_számlázási_szervezet_neve_legyen_$(String value) {
		doWith(billingCompanyNameField).setValue(value);
	}
	
	public void a_számlázási_adószám_legyen_$(String value) {
		doWith(billingTaxNumberField).setValue(value);
	}
	
	public void a_számlázási_ország_legyen_$(String value) {
		doWith(billingCountryField).selectOption(value);
	}
	
	public void a_számlázási_város_legyen_$(String value) {
		doWith(billingCityField).setValue(value);
	}
	
	public void a_számlázási_állam_legyen_$(String value) {
		doWith(billingStateField).setValue(value);
	}
	
	public void a_számlázási_irányítószám_legyen_$(String value) {
		doWith(billingZipCodeField).setValue(value);
	}
	
	public void a_számlázási_cím1_legyen_$(String value) {
		doWith(billingAddressLine1Field).setValue(value);
	}
	
	public void a_számlázási_cím2_legyen_$(String value) {
		doWith(billingAddressLine2Field).setValue(value);
	}
	
	public void kijelentkezés() {
		doWith(kijelentkezésLink).click();
	}
	
	public void mentés_gomb() {
		doWith(submitButton).click();
	}
}

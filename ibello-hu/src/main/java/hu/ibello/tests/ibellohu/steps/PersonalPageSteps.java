package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.inject.Inject;
import hu.ibello.tests.ibellohu.pages.PersonalPage;
import hu.ibello.tests.ibellohu.pages.MenuPage;
import hu.ibello.tests.ibellohu.tools.TestData;

@Name("Személyes oldal")
public class PersonalPageSteps extends AbstractSteps{
	
	private PersonalPage personalPage;
	private MenuPage menuPage;
	
	@Inject
	private TestData testData;
	
	@Name("A beállított felhasználói adatok jelennek meg")
	public void a_beállított_felhasználó_adatok_jelennek_meg() {
		personalPage.ellenőrzés_hogy_a_felhasználónév_$(testData.user.username);
		personalPage.ellenőrzés_hogy_az_emailCím_$(testData.user.email);
		personalPage.ellenőrzés_hogy_a_keresztnév_$(testData.user.firstname);
		personalPage.ellenőrzés_hogy_a_vezetéknév_$(testData.user.lastname);
		personalPage.ellenőrzés_hogy_a_szervezet_neve_$(testData.user.organisation);
		personalPage.ellenőrzés_hogy_a_számlázási_keresztnév_$(testData.user.billingAddress.firstname);
		personalPage.ellenőrzés_hogy_a_számlázási_vezetéknév_$(testData.user.billingAddress.lastname);
		personalPage.ellenőrzés_hogy_a_számlázási_szervezet_neve_$(testData.user.billingAddress.organisation);
		personalPage.ellenőrzés_hogy_a_számlázási_adószám_$(testData.user.billingAddress.taxNumber);
		personalPage.ellenőrzés_hogy_a_számlázási_ország_$(testData.user.billingAddress.country);
		personalPage.ellenőrzés_hogy_a_számlázási_város_$(testData.user.billingAddress.city);
		personalPage.ellenőrzés_hogy_a_számlázási_állam_$(testData.user.billingAddress.state);
		personalPage.ellenőrzés_hogy_a_számlázási_irányítószám_$(testData.user.billingAddress.zipCode);
		personalPage.ellenőrzés_hogy_a_számlázási_cím_eleje_$(testData.user.billingAddress.address1);
		personalPage.ellenőrzés_hogy_a_számlázási_cím_vége_$(testData.user.billingAddress.address2);
	}
	
	@Name("Kijelentkezek a Személyes oldalról")
	public void kijelentkezek_a_személyes_oldalról() {
		menuPage.bejelentkezett_kijelentkezés_menüelem_választása();
	}

	@Name("Beállítom a keresztnevet")
	public void keresztnév() {
		String firstName = testData.user.firstname;
		personalPage.a_keresztnév_legyen_$(firstName);
	}
	
	@Name("Beállítom a vezetéknevet")
	public void vezetéknév() {
		String lastName = testData.user.lastname;
		personalPage.a_vezetéknév_legyen_$(lastName);
	}
	
	@Name("Beállítom a szervezet nevét")
	public void szervezetNeve() {
		String companyName = testData.user.organisation;
		personalPage.a_szervezet_neve_legyen_$(companyName);
	}
	
	@Name("Beállítom a számlázási keresztnevet")
	public void számlázásiKeresztnév() {
		String billingFirstName = testData.user.billingAddress.firstname;
		personalPage.a_számlázási_keresztnév_legyen_$(billingFirstName);
	}
	
	@Name("Beállítom a számlázási vezetéknevet")
	public void számlázásiVezetéknév() {
		String billingLastName = testData.user.billingAddress.lastname;
		personalPage.a_számlázási_vezetéknév_legyen_$(billingLastName);
	}
	
	@Name("Beállítom a számlázási szervezet nevét")
	public void számlázásiSzervezetNeve() {
		String billingCompanyName = testData.user.billingAddress.organisation;
		personalPage.a_számlázási_szervezet_neve_legyen_$(billingCompanyName);
	}
	
	@Name("Beállítom a számlázási adószámot")
	public void számlázásiAdószám() {
		String billingTaxNumber = testData.user.billingAddress.taxNumber;
		personalPage.a_számlázási_adószám_legyen_$(billingTaxNumber);
	}
	
	@Name("Beállítom a számlázási országot")
	public void számlázásiOrszág() {
		String billingCountry = testData.user.billingAddress.country;
		personalPage.a_számlázási_ország_legyen_$(billingCountry);
	}
	
	@Name("Beállítom a számlázási várost")
	public void számlázásiVáros() {
		String billingCity = testData.user.billingAddress.city;
		personalPage.a_számlázási_város_legyen_$(billingCity);
	}
	
	@Name("Beállítom a számlázási államot")
	public void számlázásiÁllam() {
		String billingState = testData.user.billingAddress.state;
		personalPage.a_számlázási_állam_legyen_$(billingState);
	}
	
	@Name("Beállítom a számlázási irányítószámot")
	public void számlázásiIrányítószám() {
		String billingZipCode = testData.user.billingAddress.zipCode;
		personalPage.a_számlázási_irányítószám_legyen_$(billingZipCode);
	}
	
	@Name("Beállítom a számlázási cím első részét")
	public void számlázásiCím1() {
		String billingAdress1 = testData.user.billingAddress.address1;
		personalPage.a_számlázási_cím1_legyen_$(billingAdress1);
	}
	
	@Name("Beállítom a számlázási cím második részét")
	public void számlázásiCím2() {
		String billingAdress2 = testData.user.billingAddress.address2;
		personalPage.a_számlázási_cím2_legyen_$(billingAdress2);
	}
	
	@Name("Mentem a változásokat")
	public void mentem_a_változásokat() {
		personalPage.mentés_gomb();
	}
	
	@Name("Megjelenik a sikeres mentés üzenetablak")
	public void megjelenik_a_sikeres_mentés_üzenetablak() {
		personalPage.dialógus();
	}
	
	@Name("Bezárom a felugró ablakot")
	public void bezárom_a_felugró_ablakot() {
		personalPage.dialógus_bezárás();
	}
	
}

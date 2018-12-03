package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.inject.Inject;
import hu.ibello.tests.ibellohu.tools.TestData;
import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.tests.ibellohu.pages.LoginPage;

@Name("Bejelentkező oldal")
public class LoginPageSteps extends AbstractSteps {

	@Inject
	private TestData testData;
	
	private LoginPage loginPage;
	
	@Find(by=By.NAME, using="userid")
	private WebElement useridField;
	
	@Find(by=By.NAME, using="password")
	private WebElement passwordField;
	
	@Find(by=By.BUTTON_TEXT, using="Bejelentkezés")
	private WebElement submitButton;
	
	@Name("Beírom a felhasználónevet")
	public void beírom_a_felhasználónevet() {
		String userName = testData.user.username;
		loginPage.felhasználónév_mező_kitöltése(userName);
	}
	
	@Name("Beírom az e-mail-címet")
	public void beírom_az_email_címet() {
		String email = testData.user.email;
		loginPage.emailcím_mező_kitöltése(email);
	}
	
	@Name("Beírom a jelszót")
	public void beírom_a_jelszót() {
		String password = testData.user.password;
		loginPage.jelszó_mező_kitöltése(password);
	}
	
	@Name("Bejelentkezek")
	public void bejelentkezek() {
		loginPage.kattintás_a_bejelnetkezés_gombra();
	}
	
	@Name("Felugrik a sikertelen bejelentkezés üzenetablak")
	public void felugrik_a_sikertelen_bejelentkezés_üzenetablak() {
		loginPage.ellenőrzés_hogy_a_dialógusablak_megnyílt();
	}
	
	@Name("Bezárom a felugró ablakot")
	public void bezárom_a_felugró_ablakot() {
		loginPage.dialógus_bezárása();
	}
}

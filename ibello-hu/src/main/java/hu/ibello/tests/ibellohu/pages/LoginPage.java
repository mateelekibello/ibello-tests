package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class LoginPage extends AbstractPage {

	@Relation(type=RelationType.DESCENDANT_OF, by=By.CLASS_NAME, using="page-title")
	@Find(by=By.TEXT, using="${loginPage.title}")
	private WebElement pageTitle;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.CLASS_NAME, using="au-target")
	@Find(by=By.TEXT, using="${loginPage.dialogtext.incorrect}")
	private WebElement dialogContent;
	
	@Find(by=By.BUTTON_TEXT, using="Ok")
	private WebElement okButton;
	
	@Find(by=By.NAME, using="userid")
	private WebElement useridField;
	
	@Find(by=By.NAME, using="password")
	private WebElement passwordField;
	
	@Find(by=By.BUTTON_TEXT, using="Bejelentkezés")
	private WebElement submitButton;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(pageTitle).toBe().displayed();
	}
	
	public void kattintás_a_bejelnetkezés_gombra() {
		doWith(submitButton).click();
	}
	
	public void felhasználónév_mező_kitöltése(String userName) {
		doWith(useridField).setValue(userName);
	}
	
	public void emailcím_mező_kitöltése(String email) {
		doWith(useridField).setValue(email);
	}
	
	public void jelszó_mező_kitöltése(String password) {
		doWith(passwordField).setValue(password);
	}
	
	public void ellenőrzés_hogy_a_dialógusablak_megnyílt() {
		expectations().expect(dialogContent).toBe().displayed();
		expectations().expect(okButton).toBe().displayed();
	}

	public void dialógus_bezárása() {
		doWith(okButton).click();
		expectations().expect(dialogContent).toNotBe().displayed();
	}
}

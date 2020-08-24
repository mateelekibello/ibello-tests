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
	
	@Find(by=By.ID, using="message-dialog")
	private WebElement messageDialog;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.ID, using="message-dialog")
	@Find(by=By.TEXT, using="${loginPage.dialogtext.incorrect}")
	private WebElement dialogText;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.ID, using="message-dialog")
	@Find(by=By.BUTTON_TEXT, using="${loginPage.okButton}")
	private WebElement okButton;
	
	@Find(by=By.NAME, using="userid")
	private WebElement useridField;
	
	@Find(by=By.NAME, using="password")
	private WebElement passwordField;
	
	@Find(by=By.BUTTON_TEXT, using="${loginPage.submitButton}")
	private WebElement submitButton;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(pageTitle).toBe().displayed();
	}
	
	public void kattintás_a_bejelentkezés_gombra() {
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
		expectations().expect(messageDialog).toBe().displayed();
		expectations().expect(dialogText).toBe().displayed();
		expectations().expect(okButton).toBe().displayed();
	}

	public void dialógus_bezárása() {
		doWith(okButton).click();
		expectations().expect(messageDialog).toBe().displayed();
	}
}

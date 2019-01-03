package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;
import hu.ibello.search.Position;
import hu.ibello.search.PositionType;

public class LicensesPage extends AbstractPage {
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.CLASS_NAME, using="page-title")
	@Find(by=By.TEXT, using="${licensesPage.title}")
	private WebElement pageTitle;
	
	@Position(type=PositionType.COLUMN, by=By.TEXT, using="${licensesPage.licenseIdHeather}")
	@Find(by=By.TEXT, using="${0}")
	private WebElement azonosítóCella;
	
	@Position(type=PositionType.ROW, by=By.TEXT, using="${0}")
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.grantButton}")
	private WebElement engedélyezButton;
	
	@Position(type=PositionType.ROW, by=By.TEXT, using="${0}")
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.revokeButton}")
	private WebElement visszavonButton;
	
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.giveBackButton}")
	private WebElement visszaadButton;
	
	@Relation(type=RelationType.ANCESTOR_OF, by=By.PARTIAL_TEXT, using="${licensesPage.grantDialogText}")
	@Find(by=By.CLASS_NAME, using="au-target")
	private WebElement grantDialog;
	
	@Relation(type=RelationType.ANCESTOR_OF, by=By.PARTIAL_TEXT, using="${licensesPage.revokeDialogText}")
	@Find(by=By.CLASS_NAME, using="au-target")
	private WebElement revokeDialog;
	
	@Relation(type=RelationType.ANCESTOR_OF, by=By.PARTIAL_TEXT, using="${licensesPage.giveBackDialogText}")
	@Find(by=By.CLASS_NAME, using="au-target")
	private WebElement giveBackDialog;
	
	@Find(by=By.ID, using="licent_grant_user")
	private WebElement licentGrantUserField;
	
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.grantButton}")
	private WebElement engedélyezButton1;
	
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.cancelButton}")
	private WebElement mégsemButton;
	
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.revokeButton}")
	private WebElement visszavonButton1;
	
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.cancelButton}")
	private WebElement mégsemButton1;
	
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.giveBackButton}")
	private WebElement visszaadButton1;
	
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.cancelButton}")
	private WebElement mégsemButton2;
	
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.orderButton}")
	private WebElement megrendelésButton;
	
	@Find(by=By.ID, using="showInvalid")
	private WebElement showInvalidButton;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ul")
	@Find(by=By.PARTIAL_TEXT, using="${0}")
	private WebElement idLi;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ul")
	@Find(by=By.PARTIAL_TEXT, using="${0}")
	private WebElement typeLi;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ul")
	@Find(by=By.PARTIAL_TEXT, using="${0}")
	private WebElement classLi;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ul")
	@Find(by=By.PARTIAL_TEXT, using="${0}")
	private WebElement ownerLi;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ul")
	@Find(by=By.PARTIAL_TEXT, using="${0}")
	private WebElement validThruLi;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(pageTitle).toBe().displayed();
	}
	
	public boolean az_$_licenchez_az_engedélyez_gomb_megjelent(String licenceId) {
		return checkThat(engedélyezButton.applyParameters(licenceId)).isDisplayed();
	}
	
	public boolean az_$_licenchez_a_visszavon_gomb_megjelent(String licenceId) {
		return checkThat(visszavonButton.applyParameters(licenceId)).isDisplayed();
	}
	
	public void kattintás_az_engedélyez_gombra_a_$_licenchez(String licenceId) {
		doWith(engedélyezButton.applyParameters(licenceId)).click();
	}
	
	public void kattintás_a_visszavon_gombra_a_$_licenchez(String licenceId) {
		doWith(visszavonButton.applyParameters(licenceId)).click();
	}
	
	public void kattintás_a_visszaad_gombra_a_$_licenchez(String licenceId) {
		doWith(visszaadButton.applyParameters(licenceId)).click();
	}
	
	public void ellenőrzés_hogy_az_engedélyező_dialógusablak_megnyílt() {
		expectations().expect(grantDialog).toBe().displayed();
		expectations().expect(licentGrantUserField).toBe().displayed();
		expectations().expect(engedélyezButton1).toBe().displayed();
		expectations().expect(mégsemButton).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_visszavonó_dialógusablak_megnyílt() {
		expectations().expect(revokeDialog).toBe().displayed();
		expectations().expect(visszavonButton1).toBe().displayed();
		expectations().expect(mégsemButton1).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_visszaadó_dialógusablak_megnyílt() {
		expectations().expect(giveBackDialog).toBe().displayed();
		expectations().expect(visszaadButton1).toBe().displayed();
		expectations().expect(mégsemButton2).toBe().displayed();
	}
	
	public void licenc_adatok_ellenőrzése(String lId, String lType, String lClass, String lOwner, String lValidThru) {
		expectations().expect(idLi.applyParameters(lId)).toBe().displayed();
		expectations().expect(typeLi.applyParameters(lType)).toBe().displayed();
		expectations().expect(classLi.applyParameters(lClass)).toBe().displayed();
		expectations().expect(ownerLi.applyParameters(lOwner)).toBe().displayed();
		expectations().expect(validThruLi.applyParameters(lValidThru)).toBe().displayed();
	}
	
	public void felhasználó_nevének_beírása(String userName) {
		doWith(licentGrantUserField).setValue(userName);
	}
	
	public void kattintás_az_engdélyezés_gombra() {
		doWith(engedélyezButton1).click();
	}
	
	public void kattintás_a_visszavon_gombra() {
		doWith(visszavonButton1).click();
	}
	
	public void kattintás_a_visszaad_gombra() {
		doWith(visszaadButton1).click();
	}
	
	public void ellenőrzés_hogy_a_$_lincenc_visszavonható(String licenseId) {
		expectations().expect(visszavonButton.applyParameters(licenseId)).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_$_lincenc_engedélyezhető(String licenseId) {
		expectations().expect(engedélyezButton.applyParameters(licenseId)).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_$_lincenc_nem_visszaadható(String licenseId) {
		expectations().expect(visszaadButton.applyParameters(licenseId)).toNotBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_$_lincenc_visszaadható(String licenseId) {
		expectations().expect(visszaadButton.applyParameters(licenseId)).toBe().displayed();
	}
	
	public void frissítem_az_oldalt() {
		browser().reload();
	}
	
	public void ellenőrzés_hogy_a_licenc_nincs_a_listán(String licenseId) {
		expectations().expect(azonosítóCella.applyParameters(licenseId)).toNotBe().displayed();
	}
	
	public void kattintás_a_megrendelés_gombra() {
		doWith(megrendelésButton).click();
	}
	
	public void lejárt_licencek_megjelenítése_választása() {
		if (!checkThat(showInvalidButton).isSelected()) doWith(showInvalidButton).click();
	}

}

package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;
import hu.ibello.search.Position;
import hu.ibello.search.PositionType;

public class LicensesPage extends AbstractPage {
	
//	private License license;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.CLASS_NAME, using="page-title")
	@Find(by=By.TEXT, using="${licensesPage.title}")
	private WebElement pageTitle;
	
	@Position(type=PositionType.ROW, by=By.TEXT, using="${0}")
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.grantButton}")
	private WebElement engedélyezButton;
	
	@Position(type=PositionType.ROW, by=By.TEXT, using="${0}")
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.revokeButton}")
	private WebElement visszavonButton;
	
	@Relation(type=RelationType.ANCESTOR_OF, by=By.PARTIAL_TEXT, using="Szeretné engedélyezni")
	@Find(by=By.CLASS_NAME, using="au-target")
	private WebElement grantDialog;
	
	@Relation(type=RelationType.ANCESTOR_OF, by=By.PARTIAL_TEXT, using="Vissza szeretné vonni")
	@Find(by=By.CLASS_NAME, using="au-target")
	private WebElement revokeDialog;
	
	@Find(by=By.ID, using="licent_grant_user")
	private WebElement licentGrantUserField;
	
	@Find(by=By.BUTTON_TEXT, using="Engedélyez")
	private WebElement engedélyezButton1;
	
	@Find(by=By.BUTTON_TEXT, using="Mégsem")
	private WebElement mégsemButton;
	
	@Find(by=By.BUTTON_TEXT, using="Visszavon")
	private WebElement visszavonButton1;
	
	@Find(by=By.BUTTON_TEXT, using="Mégsem")
	private WebElement mégsemButton1;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ul")
	@Find(by=By.PARTIAL_TEXT, using="0W6S4-C3W5K-1L100-65F53")
	private WebElement idLi;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ul")
	@Find(by=By.PARTIAL_TEXT, using="ibello")
	private WebElement typeLi;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ul")
	@Find(by=By.PARTIAL_TEXT, using="Teszt")
	private WebElement classLi;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ul")
	@Find(by=By.PARTIAL_TEXT, using="test_valid")
	private WebElement ownerLi;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ul")
	@Find(by=By.PARTIAL_TEXT, using="2020-12-31")
	private WebElement validThruLi;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(pageTitle).toBe().displayed();
	}
	
	public void kattintás_az_engedélyez_gombra_a_$_licenchez(String licenceId) {
		doWith(engedélyezButton.applyParameters(licenceId)).click();
	}
	
	public void ellenőrzés_hogy_a_dialógusablak_megnyílt() {
		expectations().expect(grantDialog).toBe().displayed();
		expectations().expect(licentGrantUserField).toBe().displayed();
		expectations().expect(engedélyezButton1).toBe().displayed();
		expectations().expect(mégsemButton).toBe().displayed();
	}
	
	public void licenc_adatok_ellenőrzése() {
		expectations().expect(idLi).toBe().displayed();
		expectations().expect(typeLi).toBe().displayed();
		expectations().expect(classLi).toBe().displayed();
		expectations().expect(ownerLi).toBe().displayed();
		expectations().expect(validThruLi).toBe().displayed();
	}
	
	public void felhasználó_nevének_beírása(String userName) {
		doWith(licentGrantUserField).setValue(userName);
	}
	
	public void kattintás_az_engdélyezés_gombra() {
		doWith(engedélyezButton1).click();
	}
	
	public void ellenőrzés_hogy_a_$_lincenc_visszavonható(String licenseId) {
		expectations().expect(visszavonButton.applyParameters(licenseId)).toBe().displayed();
	}
	
	public void kattintás_a_visszavon_gombra_a_$_licenchez(String licenseId) {
		doWith(visszavonButton.applyParameters(licenseId)).click();
	}
}

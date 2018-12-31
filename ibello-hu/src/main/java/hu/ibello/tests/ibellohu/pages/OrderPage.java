package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;
import hu.ibello.search.Position;
import hu.ibello.search.PositionType;

public class OrderPage extends AbstractPage {
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.CLASS_NAME, using="page-title")
	@Find(by=By.TEXT, using="${orderPage.title}")
	private WebElement pageTitle;
	
	@Position(type=PositionType.ROW, by=By.PARTIAL_TEXT, using="${orderPage.bronze}")
	@Find(by=By.TAG_NAME, using="input")
	private WebElement field1;
	
	@Position(type=PositionType.ROW, by=By.PARTIAL_TEXT, using="${orderPage.silver}")
	@Find(by=By.TAG_NAME, using="input")
	private WebElement field2;

	@Position(type=PositionType.ROW, by=By.PARTIAL_TEXT, using="${orderPage.gold}")
	@Find(by=By.TAG_NAME, using="input")
	private WebElement field3;
	
	@Find(by=By.BUTTON_TEXT, using="${orderPage.submitButton}")
	private WebElement aMegrendelésÁttekintéseButton;
	
	@Find(by=By.BUTTON_TEXT, using="${orderPage.finalizeButton}")
	private WebElement aMegrendelésVéglegesítéseButton;
	
	@Find(by=By.BUTTON_TEXT, using="${orderPage.cancelButton}")
	private WebElement mégsemButton;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ux-dialog")
	@Find(by=By.PARTIAL_TEXT, using="${orderPage.finalizeDialogText}")
	private WebElement Felirat1;
	
	@Find(by=By.BUTTON_TEXT, using="${orderPage.okButton}")
	private WebElement okButton;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ux-dialog")
	@Find(by=By.PARTIAL_TEXT, using="${orderPage.okDialogText}")
	private WebElement Felirat2;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(pageTitle).toBe().displayed();
	}
	
	public void bronz_licencek_száma_legyen_$(int number) {
		doWith(field1).setValue(String.valueOf(number));
	}
	
	public void ezüst_licencek_száma_legyen_$(int number) {
		doWith(field2).setValue(String.valueOf(number));
	}
	
	public void arany_licencek_száma_legyen_$(int number) {
		doWith(field3).setValue(String.valueOf(number));
	}
	
	public void kattintás_az_áttekintő_gombra() {
		doWith(aMegrendelésÁttekintéseButton).click();
	}
	
	public void kattintás_a_véglegesítő_gombra() {
		doWith(aMegrendelésVéglegesítéseButton).click();
	}
	
	public void ellenőrzés_hogy_a_véglegesítő_üzenetablak_megnyílt() {
		expectations().expect(Felirat1).toBe().displayed();
		expectations().expect(aMegrendelésVéglegesítéseButton).toBe().displayed();
		expectations().expect(mégsemButton).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_visszaigazoló_dialógusablak_megnyílt() {
		expectations().expect(Felirat2).toBe().displayed();
		expectations().expect(okButton).toBe().displayed();
	}
	
	public void kattintás_az_Ok_gombra() {
		doWith(okButton).click();
	}
	
	public int tétel_árának_kiolvasása(int number) {
		return Integer.parseInt("45000 ");
	}
}

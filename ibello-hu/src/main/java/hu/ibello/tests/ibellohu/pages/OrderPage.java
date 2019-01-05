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
	private WebElement inputNumberBronze;
	
	@Position(type=PositionType.ROW, by=By.PARTIAL_TEXT, using="${orderPage.silver}")
	@Find(by=By.TAG_NAME, using="input")
	private WebElement inputNumberSilver;

	@Position(type=PositionType.ROW, by=By.PARTIAL_TEXT, using="${orderPage.gold}")
	@Find(by=By.TAG_NAME, using="input")
	private WebElement inputNumberGold;
	
	@Find(by=By.BUTTON_TEXT, using="${orderPage.submitButton}")
	private WebElement orderSubmitButton;
	
	@Find(by=By.BUTTON_TEXT, using="${orderPage.finalizeButton}")
	private WebElement orderfinalizeButton;
	
	@Find(by=By.BUTTON_TEXT, using="${orderPage.cancelButton}")
	private WebElement cancelButton;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ux-dialog")
	@Find(by=By.PARTIAL_TEXT, using="${orderPage.finalizeDialogText}")
	private WebElement finalizeDialogText;
	
	@Find(by=By.BUTTON_TEXT, using="${orderPage.okButton}")
	private WebElement okButton;
	
	@Relation(type=RelationType.DESCENDANT_OF, by=By.TAG_NAME, using="ux-dialog")
	@Find(by=By.PARTIAL_TEXT, using="${orderPage.okDialogText}")
	private WebElement okDialogText;
	
	@Position(type=PositionType.ROW, by=By.PARTIAL_TEXT, using="${0}")
	@Find(by=By.TEXT, using="${1}")
	private WebElement itemPriceField;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(pageTitle).toBe().displayed();
	}
	
	public void bronz_licencek_száma_legyen_$(int number) {
		doWith(inputNumberBronze).setValue(String.valueOf(number));
	}
	
	public void ezüst_licencek_száma_legyen_$(int number) {
		doWith(inputNumberSilver).setValue(String.valueOf(number));
	}
	
	public void arany_licencek_száma_legyen_$(int number) {
		doWith(inputNumberGold).setValue(String.valueOf(number));
	}
	
	public void kattintás_az_áttekintő_gombra() {
		doWith(orderSubmitButton).click();
	}
	
	public void kattintás_a_véglegesítő_gombra() {
		doWith(orderfinalizeButton).click();
	}
	
	public void ellenőrzés_hogy_a_véglegesítő_üzenetablak_megnyílt() {
		expectations().expect(finalizeDialogText).toBe().displayed();
		expectations().expect(orderfinalizeButton).toBe().displayed();
		expectations().expect(cancelButton).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_visszaigazoló_dialógusablak_megnyílt() {
		expectations().expect(okDialogText).toBe().displayed();
		expectations().expect(okButton).toBe().displayed();
	}
	
	public void kattintás_az_Ok_gombra() {
		doWith(okButton).click();
	}
	
	public void megrendelés_tételének_ára(String item, String price) {
		expectations().expect(itemPriceField.applyParameters(item,price)).toBe().displayed();
	}
}

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
	
	@Position(type=PositionType.ROW, by=By.TEXT, using="${licensesPage.licensId}")
	@Find(by=By.BUTTON_TEXT, using="${licensesPage.grantButton}")
	private WebElement érvényesButton;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(pageTitle).toBe().displayed();
	}
}

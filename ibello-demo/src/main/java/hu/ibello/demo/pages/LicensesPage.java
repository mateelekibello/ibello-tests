package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class LicensesPage extends PageObject {

	@Relation(type=RelationType.DESCENDANT_OF, by=By.CSS_SELECTOR, using=".page-title")
	@Find(by=By.TEXT, using="Licencek")
	private WebElement title;
	
	public void expect_page_is_opened() {
		expectations().expect(title).toBe().displayed();
	}
}

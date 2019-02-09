package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class BlogPostPage extends AbstractPage {

	@Relation(type=RelationType.DESCENDANT_OF, by=By.CLASS_NAME, using="page-title")
	@Find(by=By.TEXT, using="${0}")
	private WebElement pageTitle;
	
	@Find(by=By.BUTTON_TEXT, using="${blogPage.moreInformationButton}")
	private WebElement moreInformationButton;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Bővítmények")
	private WebElement bővítményekLink;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Grafikus felület")
	private WebElement grafikusFelületLink;

	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Mesterséges intelligencia")
	private WebElement mesterségesIntelligenciaLink;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Parancssor")
	private WebElement parancssorLink;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Példák")
	private WebElement példákLink2;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Tanulmányok")
	private WebElement tanulmányokLink;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Újdonságok")
	private WebElement újdonságokLink2;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(moreInformationButton).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_$_című_poszt_jelenik_meg(String title) {
		expectations().expect(pageTitle.applyParameters(title)).toBe().displayed();
	}
	
	
}

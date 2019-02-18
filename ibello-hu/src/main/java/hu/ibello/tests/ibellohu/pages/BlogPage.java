package hu.ibello.tests.ibellohu.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class BlogPage extends AbstractPage {

	@Relation(type=RelationType.DESCENDANT_OF, by=By.CLASS_NAME, using="page-title")
	@Find(by=By.TEXT, using="${blogPage.title}")
	private WebElement pageTitle;
	
	@Relation(type=RelationType.ANCESTOR_OF, by=By.TEXT, using="${0}")
	@Find(by=By.CLASS_NAME, using="post")
	private WebElement postDiv;
	
	private WebElement imageLink;
	private WebElement titleLink;
	private WebElement categoryBővítményekLink;
	private WebElement categoryGrafikusFelületLink;
	private WebElement categoryMesterségesIntelligenciaLink;
	private WebElement categoryParancssorLink;
	private WebElement categoryPéldákLink;
	private WebElement categoryTanulmányokLink;
	private WebElement categoryÚjdonságokLink;
	private WebElement authorLabel;
	private WebElement dateLabel;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(pageTitle).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_aktuális_poszt_megjelenik(String title) {
		expectations().expect(postDiv.applyParameters(title)).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_aktuális_poszt_képe_megjelenik() {
		imageLink = postDiv.find().using(By.TAG_NAME,"figure").first().find().using(By.TAG_NAME,"a").first();
		expectations().expect(imageLink).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_aktuális_poszt_címe_megjelenik(String title) {
		titleLink = postDiv.find().using(By.BUTTON_TEXT,"${0}").first();
		expectations().expect(titleLink.applyParameters(title)).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_aktuális_poszt_szerzője_megjelenik(String author) {
		authorLabel = postDiv.find().using(By.TEXT,"${0}").first();
		expectations().expect(authorLabel.applyParameters(author)).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_aktuális_poszt_dátuma_megjelenik(String date) {
		dateLabel = postDiv.find().using(By.TEXT,"${0}").first();
		expectations().expect(dateLabel.applyParameters(date)).toBe().displayed();
	}
	
	public void bővítmények_kategória_link_ellenőrzése() {
		categoryBővítményekLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.extensions}").first();
		expectations().expect(categoryBővítményekLink).toBe().displayed();
	}
	
	public void grafikus_felület_kategória_link_ellenőrzése() {
		categoryGrafikusFelületLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.gui}").first();
		expectations().expect(categoryGrafikusFelületLink).toBe().displayed();
	}
	
	public void mesterséges_intelligencia_kategória_link_ellenőrzése() {
		categoryMesterségesIntelligenciaLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.ai}").first();
		expectations().expect(categoryMesterségesIntelligenciaLink).toBe().displayed();
	}
	
	public void parancssor_kategória_link_ellenőrzése() {
		categoryParancssorLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.commandLine}").first();
		expectations().expect(categoryParancssorLink).toBe().displayed();
	}
	
	public void példák_kategória_link_ellenőrzése() {
		categoryPéldákLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.examples}").first();
		expectations().expect(categoryPéldákLink).toBe().displayed();
	}
	
	public void tanulmányok_kategória_link_ellenőrzése() {
		categoryTanulmányokLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.studies}").first();
		expectations().expect(categoryTanulmányokLink).toBe().displayed();
	}
	
	public void újdonságok_kategória_link_ellenőrzése() {
		categoryÚjdonságokLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.newFunction}").first();
		expectations().expect(categoryÚjdonságokLink).toBe().displayed();
	}


}

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
	
	@Find(by=By.BUTTON_TEXT, using="${blogPage.moreInformationButton.en}")
	private WebElement moreInformationButtonEn;
	
	@Find(by=By.CSS_SELECTOR, using="[title='${blog.previousButton}']")
	private WebElement previousButton;
	
	@Find(by=By.CSS_SELECTOR, using="[title='${blog.nextButton}']")
	private WebElement nextButton;
	
	@Relation(type=RelationType.ANCESTOR_OF, by=By.TEXT, using="${0}")
	@Find(by=By.CLASS_NAME, using="post")
	private WebElement postDiv;
	
	private WebElement authorLabel;
	
	private WebElement dateLabel;
	
	private WebElement postTitle;
	
	private WebElement paragraph;
	
	private WebElement categoryBővítményekLink;
	private WebElement categoryGrafikusFelületLink;
	private WebElement categoryMesterségesIntelligenciaLink;
	private WebElement categoryParancssorLink;
	private WebElement categoryPéldákLink;
	private WebElement categoryTanulmányokLink;
	private WebElement categoryÚjdonságokLink;
	private WebElement categoryÁttekintésLink;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Bővítmények")
	private WebElement bővítményekLink;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Grafikus felület")
	private WebElement grafikusFelületLink;

	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Mesterséges intelligencia")
	private WebElement mesterségesIntelligenciaLink;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Parancssor")
	private WebElement parancssorLink;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Példák")
	private WebElement példákLink;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Tanulmányok")
	private WebElement tanulmányokLink;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Újdonságok")
	private WebElement újdonságokLink;
	
	@Find(by=By.PARTIAL_BUTTON_TEXT, using="Áttekintés")
	private WebElement áttekintésLink;
	
	@Override
	public void ellenőrzés_hogy_az_oldal_megnyílt() {
		expectations().expect(moreInformationButton).toBe().displayed();
		expectations().expect(previousButton).toBe().displayed();
		expectations().expect(nextButton).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_oldal_megnyílt_$_nyelven(String language) {
		if (language.equals("Magyar")) expectations().expect(moreInformationButton).toBe().displayed();
		else if (language.equals("English")) expectations().expect(moreInformationButtonEn).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_a_$_cím_jelenik_meg(String title) {
		expectations().expect(pageTitle.applyParameters(title)).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_aktuális_poszt_megjelenik(String title) {
		expectations().expect(postDiv.applyParameters(title)).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_aktuális_poszt_címe_megjelenik(String title) {
		expectations().expect(postDiv.applyParameters(title)).toBe().displayed();
		postTitle = postDiv.find().using(By.TEXT,"${0}").first();
		expectations().expect(postTitle.applyParameters(title)).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_aktuális_poszt_szerzője_megjelenik(String author) {
		authorLabel = postDiv.find().using(By.TEXT,"${0}").first();
		expectations().expect(authorLabel.applyParameters(author)).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_aktuális_poszt_dátuma_megjelenik(String date) {
		dateLabel = postDiv.find().using(By.TEXT,"${0}").first();
		expectations().expect(dateLabel.applyParameters(date)).toBe().displayed();
	}
	
	public void ellenőrzés_hogy_az_aktuális_poszt_egy_bekezdése_megjelenik(String text) {
		paragraph = postDiv.find().using(By.PARTIAL_TEXT,"${0}").first();
		expectations().expect(paragraph.applyParameters(text)).toBe().displayed();
	}
	
	public void bővítmények_kategória_link_ellenőrzése() {
		categoryBővítményekLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.extensions}").first();
		expectations().expect(categoryBővítményekLink).toBe().displayed();
	}
	
	public void bővítmények_link_választása() {
		categoryBővítményekLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.extensions}").first();
		doWith(categoryBővítményekLink).click();
	}
	
	public void bővítmények_menü_link_választása() {
		doWith(bővítményekLink).click();
	}
	
	public void grafikus_felület_kategória_link_ellenőrzése() {
		categoryGrafikusFelületLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.gui}").first();
		expectations().expect(categoryGrafikusFelületLink).toBe().displayed();
	}
	
	public void grafikus_felület_link_választása() {
		categoryGrafikusFelületLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.gui}").first();
		doWith(categoryGrafikusFelületLink).click();
	}
	
	public void grafikus_felület_menü_link_választása() {
		doWith(grafikusFelületLink).click();
	}
	
	public void mesterséges_intelligencia_kategória_link_ellenőrzése() {
		categoryMesterségesIntelligenciaLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.ai}").first();
		expectations().expect(categoryMesterségesIntelligenciaLink).toBe().displayed();
	}
	
	public void mesterséges_intelligencia_link_választása() {
		categoryMesterségesIntelligenciaLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.ai}").first();
		doWith(categoryMesterségesIntelligenciaLink).click();
	}
	
	public void mesterséges_intelligencia_menü_link_választása() {
		doWith(mesterségesIntelligenciaLink).click();
	}
	
	public void parancssor_kategória_link_ellenőrzése() {
		categoryParancssorLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.commandLine}").first();
		expectations().expect(categoryParancssorLink).toBe().displayed();
	}
	
	public void parancssor_link_választása() {
		categoryParancssorLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.commandLine}").first();
		doWith(categoryParancssorLink).click();
	}
	
	public void parancssor_menü_link_választása() {
		doWith(parancssorLink).click();
	}
	
	public void példák_kategória_link_ellenőrzése() {
		categoryPéldákLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.examples}").first();
		expectations().expect(categoryPéldákLink).toBe().displayed();
	}
	
	public void példák_link_választása() {
		categoryPéldákLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.examples}").first();
		doWith(categoryPéldákLink).click();
	}
	
	public void példák_menü_link_választása() {
		doWith(példákLink).click();
	}
	
	public void tanulmányok_kategória_link_ellenőrzése() {
		categoryTanulmányokLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.studies}").first();
		expectations().expect(categoryTanulmányokLink).toBe().displayed();
	}
	
	public void tanulmányok_link_választása() {
		categoryTanulmányokLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.studies}").first();
		doWith(categoryTanulmányokLink).click();
	}
	
	public void tanulmányok_menü_link_választása() {
		doWith(tanulmányokLink).click();
	}
	
	public void újdonságok_kategória_link_ellenőrzése() {
		categoryÚjdonságokLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.newFunctions}").first();
		expectations().expect(categoryÚjdonságokLink).toBe().displayed();
	}
	
	public void újdonságok_link_választása() {
		categoryÚjdonságokLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.newFunctions}").first();
		doWith(categoryÚjdonságokLink).click();
	}
	
	public void újdonságok_menü_link_választása() {
		doWith(újdonságokLink).click();
	}
	
	public void áttekintés_kategória_link_ellenőrzése() {
		categoryÁttekintésLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.overview}").first();
		expectations().expect(categoryÁttekintésLink).toBe().displayed();
	}
	
	public void áttekintés_link_választása() {
		categoryÁttekintésLink = postDiv.find().using(By.BUTTON_TEXT,"${blog.categories.overview}").first();
		doWith(categoryÁttekintésLink).click();
	}
	
	public void áttekintés_menü_link_választása() {
		doWith(áttekintésLink).click();
	}
	
	public void kattintás_a_előző_gombra() {
		doWith(previousButton).click();
	}
	
	public void kattintás_a_következő_gombra() {
		doWith(nextButton).click();
	}
}

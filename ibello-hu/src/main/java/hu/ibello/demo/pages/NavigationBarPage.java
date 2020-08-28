package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class NavigationBarPage extends PageObject {

    @Find(by = By.CSS_SELECTOR, using = "a[href='#home-ibello']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "menu-component")
    private WebElement productLink;

    @Find(by = By.CSS_SELECTOR, using = "a[href='#home-services']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "menu-component")
    private WebElement servicesLink;

    @Find(by = By.CSS_SELECTOR, using = "a[href='#home-about']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "menu-component")
    private WebElement aboutUsLink;

    @Find(by = By.CSS_SELECTOR, using = "a[href='#home-support']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "menu-component")
    private WebElement supportLink;

    @Find(by = By.ID, using = "language-selector")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "menu-component")
    private WebElement languageLink;

    @Find(by = By.CSS_SELECTOR, using = "a[title='magyar']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.ID, using = "language-selector")
    private WebElement hungarianLink;

    @Find(by = By.CSS_SELECTOR, using = "a[title='english']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.ID, using = "language-selector")
    private WebElement englishLink;

    @Find(by = By.CSS_SELECTOR, using = "a[href='#home']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "menu-component")
    private WebElement homeLink;

    public void click_product_link() {
        doWith(productLink).click();
    }

    public void click_services_link() {
        doWith(servicesLink).click();
    }

    public void click_about_us_link() {
        doWith(aboutUsLink).click();
    }

    public void click_support_link() {
        doWith(supportLink).click();
    }

    public void click_language_link() {
        doWith(languageLink).click();
    }

    public void click_hungarian_link() {
        doWith(hungarianLink).click();
    }

    public void click_english_link() {
        doWith(englishLink).click();
    }

    public void click_home_link() {
        doWith(homeLink).click();
    }

}

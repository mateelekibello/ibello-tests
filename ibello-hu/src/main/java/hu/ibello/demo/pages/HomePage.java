package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class HomePage extends PageObject {

    @Find(by = By.CSS_SELECTOR, using = "menu-component")
    private WebElement menuComponent;

    @Find(by = By.CSS_SELECTOR, using = "welcome-main-lane")
    private WebElement mainLane;

    @Find(by = By.TEXT, using = "${0}")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "welcome-main-lane")
    private WebElement text;

    @Find(by = By.CSS_SELECTOR, using = "a[au-target-id='135']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CLASS_NAME, using = "lane-welcome-main")
    private WebElement ourProductButton;

    public void expect_menu_component_is_displayed() {
        expectations().expect(menuComponent).toBe().displayed();
    }

    public void expect_main_lane_is_displayed() {
        expectations().expect(mainLane).toBe().displayed();
    }

    public void assume_$_text_is_displayed(String textToCheck) {
        expectations().assume(text.applyParameters(textToCheck)).toBe().displayed();
    }

    public void assume_$_text_is_not_displayed(String textToCheck) {
        expectations().assume(text.applyParameters(textToCheck)).toNotBe().displayed();
    }

    public void click_our_product_button() {
        doWith(ourProductButton).click();
    }
}

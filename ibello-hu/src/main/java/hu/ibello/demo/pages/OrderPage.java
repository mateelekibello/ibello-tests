package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class OrderPage extends PageObject {

    @Find(by = By.CSS_SELECTOR, using = "menu-component")
    private WebElement menuComponent;

    @Find(by = By.CSS_SELECTOR, using = "order-pack-lane")
    private WebElement orderLane;

    @Find(by = By.CSS_SELECTOR, using = "button[au-target-id='247']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "order-pack-lane")
    private WebElement sendingOrderButton;

    public void expect_menu_component_is_displayed() {
        expectations().expect(menuComponent).toBe().displayed();
    }

    public void expect_order_lane_is_displayed() {
        expectations().expect(orderLane).toBe().displayed();
    }

    public void click_sending_order_button() {
        doWith(sendingOrderButton).click();
    }

}

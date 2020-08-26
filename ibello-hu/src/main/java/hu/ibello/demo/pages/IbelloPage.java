package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class IbelloPage extends PageObject {

    @Find(by = By.CSS_SELECTOR, using = "menu-component")
    private WebElement menuComponent;

    @Find(by = By.CSS_SELECTOR, using = "welcome-ibello-lane")
    private WebElement ibelloLane;

    @Find(by = By.CSS_SELECTOR, using = "a[au-target-id='162']")
    private WebElement orderButton;

    public void expect_menu_component_is_displayed() {
        expectations().expect(menuComponent).toBe().displayed();
    }

    public void expect_ibello_lane_is_displayed() {
        expectations().expect(ibelloLane).toBe().displayed();
    }

    public void click_order_button() {
        doWith(orderButton).click();
    }


}

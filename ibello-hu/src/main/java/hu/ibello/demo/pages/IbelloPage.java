package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class IbelloPage extends AbstractPage {

    @Find(by = By.CSS_SELECTOR, using = "welcome-ibello-lane")
    private WebElement ibelloLane;

    @Find(by = By.CSS_SELECTOR, using = "a[href='#order']")
    private WebElement orderButton;

    public void expect_ibello_lane_is_displayed() {
        expectations().expect(ibelloLane).toBe().displayed();
    }

    public void click_order_button() {
        doWith(orderButton).click();
    }

}

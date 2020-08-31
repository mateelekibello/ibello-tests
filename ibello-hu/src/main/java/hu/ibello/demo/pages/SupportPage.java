package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class SupportPage extends AbstractPage {

    @Find(by = By.CSS_SELECTOR, using = "welcome-main-lane")
    private WebElement welcomeLane;

    @Find(by = By.CSS_SELECTOR, using = "login-lane")
    private WebElement loginLane;

    public void expect_welcome_lane_is_displayed() {
        expectations().expect(welcomeLane).toBe().displayed();
    }

    public void expect_login_lane_is_displayed() {
        expectations().expect(loginLane).toBe().displayed();
    }
}

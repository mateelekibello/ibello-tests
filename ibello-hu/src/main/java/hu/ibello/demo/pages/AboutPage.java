package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class AboutPage extends PageObject {

    @Find(by = By.CSS_SELECTOR, using = "welcome-about-lane")
    private WebElement aboutLane;

    public void expect_about_lane_is_displayed() {
        expectations().expect(aboutLane).toBe().displayed();
    }

    public void expect_url_is_$(String url) {
        expectations().assume(browser()).toHave().url(url);
    }

}

package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class ServicesPage extends PageObject {

    @Find(by = By.CSS_SELECTOR, using = "welcome-services-lane")
    private WebElement servicesLane;

    public void expect_services_lane_is_displayed() {
        expectations().expect(servicesLane).toBe().displayed();
    }

    public void expect_url_is_$(String url) {
        expectations().assume(browser()).toHave().url(url);
    }

}

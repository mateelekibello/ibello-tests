package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class ServicesPage extends AbstractPage {

    @Find(by = By.CSS_SELECTOR, using = "welcome-services-lane")
    private WebElement servicesLane;

    @Find(by = By.CSS_SELECTOR, using = "a[href='#quotation']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CLASS_NAME, using = "lane-convert")
    private WebElement requestButton;

    public void expect_services_lane_is_displayed() {
        expectations().expect(servicesLane).toBe().displayed();
    }

    public void click_request_button() {
        doWith(requestButton).click();
    }

}

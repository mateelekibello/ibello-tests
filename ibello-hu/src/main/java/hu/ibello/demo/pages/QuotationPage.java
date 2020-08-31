package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class QuotationPage extends AbstractPage {

    @Find(by = By.CSS_SELECTOR, using = "quote-services-lane")
    private WebElement quoteServicesLane;

    public void expect_quote_services_lane_is_displayed() {
        expectations().expect(quoteServicesLane).toBe().displayed();
    }

}

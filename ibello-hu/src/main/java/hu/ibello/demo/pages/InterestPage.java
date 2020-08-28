package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class InterestPage extends PageObject {

    @Find(by = By.CSS_SELECTOR, using = "workflow-lane")
    private WebElement workflowLane;

    public void expect_workflow_lane_is_displayed() {
        expectations().expect(workflowLane).toBe().displayed();
    }

    public void expect_url_is_$(String url) {
        expectations().assume(browser()).toHave().url(url);
    }

}

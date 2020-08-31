package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class ChangelogPage extends AbstractPage {

    @Find(by = By.CSS_SELECTOR, using = "doc-lane")
    private WebElement docLane;

    public void expect_doc_lane_is_displayed() {
        expectations().expect(docLane).toBe().displayed();
    }

}

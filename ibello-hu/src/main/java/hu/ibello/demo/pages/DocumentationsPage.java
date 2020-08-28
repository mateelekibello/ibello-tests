package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class DocumentationsPage extends AbstractPage {

    @Find(by = By.CSS_SELECTOR, using = "docs-lane")
    private WebElement docsLane;

    public void expect_docs_lane_is_displayed() {
        expectations().expect(docsLane).toBe().displayed();
    }

}

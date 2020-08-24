package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;

public class HomePage extends PageObject {

    @Find(by = By.ID, using = "language-selector")
    private WebElement languageSelectorLink;

    public void click_language_selector_link() {
        doWith(languageSelectorLink).click();
    }

}

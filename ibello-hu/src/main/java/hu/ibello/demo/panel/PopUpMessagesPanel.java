package hu.ibello.demo.panel;

import hu.ibello.demo.tools.Timeout;
import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class PopUpMessagesPanel extends PageObject {

    @Find(by = By.CLASS_NAME, using = "error")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "toast-component")
    private WebElement errorMessage;

    @Find(by = By.CLASS_NAME, using = "success")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "toast-component")
    private WebElement successMessage;

    public void assume_error_message_is_displayed() {
        expectations().assume(errorMessage).toBe().displayed();
    }

    public void assume_error_message_is_not_displayed() {
        expectations().withTimeout(Timeout.LONG).assume(errorMessage).toNotBe().displayed();
    }

    public void assume_success_message_is_displayed() {
        expectations().assume(successMessage).toBe().displayed();
    }

    public void assume_success_message_is_not_displayed() {
        expectations().withTimeout(Timeout.LONG).assume(successMessage).toNotBe().displayed();
    }

}

package hu.ibello.demo.pages;

import hu.ibello.elements.WebElement;
import hu.ibello.pages.PageObject;
import hu.ibello.search.By;
import hu.ibello.search.Find;
import hu.ibello.search.Relation;
import hu.ibello.search.RelationType;

public class HomePage extends PageObject {

    @Find(by = By.CSS_SELECTOR, using = "menu-component")
    private WebElement menuComponent;

    @Find(by = By.CSS_SELECTOR, using = "welcome-main-lane")
    private WebElement mainLane;

    @Find(by = By.TEXT, using = "${0}")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "welcome-main-lane")
    private WebElement text;

    @Find(by = By.ID, using = "contactName")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CLASS_NAME, using = "contact-info")
    private WebElement contactNameField;

    @Find(by = By.ID, using = "contactEmail")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CLASS_NAME, using = "contact-info")
    private WebElement contactEmailField;

    @Find(by = By.ID, using = "contactSubject")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CLASS_NAME, using = "contact-info")
    private WebElement contactSubjectField;

    @Find(by = By.ID, using = "contactText")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CLASS_NAME, using = "contact-info")
    private WebElement contactTextField;

    @Find(by = By.CSS_SELECTOR, using = "a[href='#ibello']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CLASS_NAME, using = "lane-welcome-main")
    private WebElement ourProductButton;

    @Find(by = By.CSS_SELECTOR, using = "a[href='#']")
    @Relation(type = RelationType.DESCENDANT_OF, by = By.CSS_SELECTOR, using = "contact-lane")
    private WebElement sendMessageButton;

    public void assume_$_text_is_displayed(String textToCheck) {
        expectations().assume(text.applyParameters(textToCheck)).toBe().displayed();
    }

    public void assume_$_text_is_not_displayed(String textToCheck) {
        expectations().assume(text.applyParameters(textToCheck)).toNotBe().displayed();
    }

    public void click_our_product_button() {
        doWith(ourProductButton).click();
    }

    public void set_contact_name_field_to_$(String value) {
        doWith(contactNameField).setValue(value);
    }

    public void set_contact_email_field_to_$(String value) {
        doWith(contactEmailField).setValue(value);
    }

    public void set_contact_subject_field_to_$(String value) {
        doWith(contactSubjectField).setValue(value);
    }

    public void set_contact_text_field_to_$(String value) {
        doWith(contactTextField).setValue(value);
    }

    public void click_send_message_button() {
        doWith(sendMessageButton).click();
    }

    public void i_open_the_page() {
        String url = getConfigurationValue("ibello.url.base").toString();
        browser().resize(2000, 1000);
        browser().maximize();
        browser().openURL(url);
    }

    public void i_see_the_homepage() {
        expect_menu_component_is_displayed();
        expect_main_lane_is_displayed();
    }

    private void expect_menu_component_is_displayed() {
        expectations().expect(menuComponent).toBe().displayed();
    }

    private void expect_main_lane_is_displayed() {
        expectations().expect(mainLane).toBe().displayed();
    }

}

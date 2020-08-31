package hu.ibello.demo.steps;

import hu.ibello.core.Name;
import hu.ibello.demo.model.LanguageSelection;
import hu.ibello.demo.pages.*;
import hu.ibello.demo.panel.NavigationBarPanel;
import hu.ibello.steps.StepLibrary;

@Name("Navigation steps")
public class NavigationSteps extends StepLibrary {

    private NavigationBarPanel navigationBar;
    private HomePage homePage;
    private IbelloPage ibelloPage;
    private OrderPage orderPage;
    private ServicesPage servicesPage;
    private AboutPage aboutPage;
    private ManagerPage managerPage;
    private PricingPage pricingPage;
    private DocumentationsPage documentationsPage;
    private InterestPage interestPage;
    private SupportPage supportPage;
    private ChangelogPage changelogPage;

    public void i_open_the_homepage() {
        homePage.i_open_homepage();
    }

    public void i_am_on_homepage() {
        homePage.i_expect_main_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void select_language_based_on_$_test_data(LanguageSelection data) {
        if (data != null && data.getLanguage() != null) {
            navigationBar.click_language_link();
            switch (data.getLanguage()) {
                case HUNGARIAN:
                    navigationBar.click_hungarian_link();
                    break;
                case ENGLISH:
                    navigationBar.click_english_link();
                    break;
                default:
                    break;
            }
        }
    }

    public void i_navigate_from_homepage_to_the_order_page() {
        homePage.click_our_product_button();
        navigationBar.expect_menu_component_is_displayed();
        ibelloPage.expect_ibello_lane_is_displayed();
        ibelloPage.click_order_button();
        orderPage.expect_order_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void i_navigate_from_homepage_to_product_page() {
        homePage.click_our_product_button();
    }

    public void i_navigate_from_homepage_to_services_page() {
        homePage.click_our_services_button();
    }

    public void i_navigate_from_homepage_to_about_page() {
        homePage.click_meet_us_button();
    }

    public void i_navigate_back_to_homepage() {
        navigationBar.click_home_link();
    }

    public void i_am_on_order_page() {
        orderPage.expect_order_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void i_am_on_product_page() {
        String url = "/#ibello";
        ibelloPage.expect_url_is_$(url);
        ibelloPage.expect_ibello_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void i_am_on_services_page() {
        String url = "/#services";
        servicesPage.expect_url_is_$(url);
        servicesPage.expect_services_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void i_am_on_about_page() {
        String url = "/#about";
        aboutPage.expect_url_is_$(url);
        aboutPage.expect_about_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void i_am_on_manager_page() {
        String url = "#flow?id=manager";
        managerPage.expect_url_is_$(url);
        managerPage.expect_flow_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void i_am_on_pricing_page() {
        String url = "/#pricing-details";
        pricingPage.expect_url_is_$(url);
        pricingPage.expect_details_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void i_am_on_documentations_page() {
        String url = "/public/#all-docs";
        documentationsPage.expect_url_is_$(url);
        documentationsPage.expect_docs_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void i_am_on_interest_page() {
        String url = "/public/#interest";
        interestPage.expect_url_is_$(url);
        interestPage.expect_workflow_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void i_am_on_support_page() {
        String url = "/public/#support";
        supportPage.expect_url_is_$(url);
        supportPage.expect_welcome_lane_is_displayed();
        supportPage.expect_login_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void i_am_on_changelog_page() {
        String url = "/public/#documentation-changelog";
        supportPage.expect_url_is_$(url);
        changelogPage.expect_doc_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

}

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

    public void i_open_the_homepage() {
        homePage.i_open_the_page_if_not_opened();
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
        ibelloPage.expect_menu_component_is_displayed();
        ibelloPage.expect_ibello_lane_is_displayed();
        ibelloPage.click_order_button();
        orderPage.expect_menu_component_is_displayed();
        orderPage.expect_order_lane_is_displayed();
    }

    public void i_am_on_order_page() {
        orderPage.expect_menu_component_is_displayed();
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

    public void i_navigate_from_homepage_to_support_page() {

    }

    public void i_navigate_back_to_homepage() {
        navigationBar.click_home_link();
    }

    public void i_am_on_product_page() {
        String url = "https://ibello.hu/ibello/public/#ibello";
        ibelloPage.expect_url_is_$(url);
        ibelloPage.expect_ibello_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void i_am_on_services_page() {
        String url = "https://ibello.hu/ibello/public/#services";
        servicesPage.expect_url_is_$(url);
        servicesPage.expect_services_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

    public void i_am_on_about_page() {
        String url = "https://ibello.hu/ibello/public/#about";
        aboutPage.expect_url_is_$(url);
        aboutPage.expect_about_lane_is_displayed();
        navigationBar.expect_menu_component_is_displayed();
    }

}

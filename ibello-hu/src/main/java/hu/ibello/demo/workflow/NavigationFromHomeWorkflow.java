package hu.ibello.demo.workflow;

import hu.ibello.core.Name;
import hu.ibello.demo.steps.NavigationSteps;
import hu.ibello.steps.StepLibrary;

@Name("navigation from home")
public class NavigationFromHomeWorkflow extends StepLibrary{

    private NavigationSteps navigationSteps;

    public void i_am_on_about_page() {
        navigationSteps.i_am_on_about_page();
    }

    public void i_am_on_documentations_page() {
        navigationSteps.i_am_on_documentations_page();
    }

    public void i_am_on_homepage() {
        navigationSteps.i_am_on_homepage();
    }

    public void i_am_on_interest_page() {
        // TODO auto-generated method
    }

    public void i_am_on_pricing_page() {
        navigationSteps.i_am_on_pricing_page();
    }

    public void i_am_on_product_page() {
        navigationSteps.i_am_on_product_page();
    }

    public void i_am_on_services_page() {
        navigationSteps.i_am_on_services_page();
    }

    public void i_am_on_support_page() {
        // TODO
    }

    public void i_navigate_back_to_homepage() {
        navigationSteps.i_navigate_to_homepage_directly_from_navbar();
    }

    public void i_navigate_to_about_page_using_details_button() {
        // TODO auto-generated method
    }

    public void i_navigate_to_documentations_page_using_documentations_button() {
        // TODO auto-generated method
    }

    public void i_navigate_to_interest_page_using_try_it_button() {
        // TODO auto-generated method
    }

    public void i_navigate_to_pricing_page_using_details_button() {
        // TODO auto-generated method
    }

    public void i_navigate_to_product_page_using_learn_more_button() {
        // TODO auto-generated method
    }

    public void i_navigate_to_product_page_using_product_button() {
        navigationSteps.i_navigate_from_homepage_header_to_product_page();
    }

    public void i_navigate_to_services_page_using_services_button() {
        // TODO auto-generated method
    }

    public void i_navigate_to_services_page_using_work_with_us_button() {
        // TODO auto-generated method
    }

    public void i_navigate_to_support_page_using_more_options_button() {
        // TODO auto-generated method
    }

    public void test_init() {
        navigationSteps.i_open_the_homepage();
    }
}

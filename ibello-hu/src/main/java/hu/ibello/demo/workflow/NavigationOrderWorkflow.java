package hu.ibello.demo.workflow;

import hu.ibello.core.Name;
import hu.ibello.demo.steps.NavigationSteps;
import hu.ibello.steps.StepLibrary;

@Name("navigation order")
public class NavigationOrderWorkflow extends StepLibrary{

    private NavigationSteps navigationSteps;

    public void test_init() {
        navigationSteps.i_open_the_homepage();
    }

    public void i_am_on_homepage() {
        navigationSteps.i_am_on_homepage();
    }

    public void from_homepage_header_i_navigate_to_product_page() {
        navigationSteps.i_navigate_from_homepage_header_to_product_page();
    }

    public void i_am_on_product_page() {
        navigationSteps.i_am_on_product_page();
    }

    public void from_product_page_i_order_an_outpost_product() {
        navigationSteps.i_order_an_outpost_product();
    }

    public void from_product_page_i_order_a_sentinel_product() {
        navigationSteps.i_order_a_sentinel_product();
    }

    public void from_product_page_i_order_a_hunter_product() {
        navigationSteps.i_order_a_hunter_product();
    }

    public void from_product_page_i_order_a_master_hunter_product() {
        navigationSteps.i_order_a_master_hunter_product();
    }

    public void i_navigate_directly_to_product_page_using_the_navbar() {
        navigationSteps.i_navigate_to_product_page_directly_from_navbar();
    }

    public void i_am_on_order_page_and_outpost_is_selected() {
        navigationSteps.i_am_on_order_page();
        navigationSteps.i_see_that_outpost_is_selected();
    }

    public void i_am_on_order_page_and_sentinel_is_selected() {
        navigationSteps.i_am_on_order_page();
        navigationSteps.i_see_that_sentinel_is_selected();
    }

    public void i_am_on_order_page_and_hunter_is_selected() {
        navigationSteps.i_am_on_order_page();
        navigationSteps.i_see_that_hunter_is_selected();
    }

    public void i_am_on_order_page_and_master_hunter_is_selected() {
        navigationSteps.i_am_on_order_page();
        navigationSteps.i_see_that_master_hunter_is_selected();
    }

}

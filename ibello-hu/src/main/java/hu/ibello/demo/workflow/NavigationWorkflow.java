package hu.ibello.demo.workflow;

import hu.ibello.core.Name;
import hu.ibello.demo.steps.NavigationSteps;
import hu.ibello.steps.StepLibrary;

@Name("navigation")
public class NavigationWorkflow extends StepLibrary{

    private NavigationSteps navigationSteps;

    public void test_init() {
        // TODO auto-generated method
    }

    public void from_homepage_header_i_navigate_to_product_page() {
        navigationSteps.i_navigate_from_homepage_header_to_product_page();
    }

    public void from_homepage_header_i_navigate_to_services_page() {
        navigationSteps.i_navigate_from_homepage_header_to_services_page();
    }

    public void from_homepage_i_navigate_to_about_page() {
        navigationSteps.i_use_navbar_to_navigate_to_about_page();
    }

    public void from_homepage_i_navigate_to_documentations_page() {
        navigationSteps.i_use_navbar_to_navigate_to_documentations_page();
    }

    public void from_homepage_i_navigate_to_interest_page() {
        navigationSteps.i_use_navbar_to_navigate_to_interest_page();
    }

    public void from_homepage_i_navigate_to_product_page() {
        navigationSteps.i_use_navbar_to_navigate_to_product_page();
    }

    public void from_homepage_i_navigate_to_services_page() {
        navigationSteps.i_use_navbar_to_navigate_to_services_page();
    }

    public void from_homepage_i_navigate_to_support_page() {
        navigationSteps.i_use_navbar_to_navigate_to_support_page();
    }

    public void from_documentations_page_i_navigate_to_change_log_page() {
        navigationSteps.i_navigate_from_documentations_page_to_changelog_page();
    }

    public void from_installation_documentation_page_i_navigate_to_documentations_page() {
        navigationSteps.i_navigate_from_installation_documentation_page_to_documentations_page();
    }

    public void from_interest_page_i_navigate_to_documentations_page() {
        navigationSteps.i_navigate_from_interest_page_to_documentations_page();
    }

    public void from_interest_page_i_navigate_to_installation_documentation_page() {
        navigationSteps.i_navigate_from_interest_page_to_installation_documentation_page();
    }

    public void from_product_page_header_i_navigate_to_product_page() {
        // TODO auto-generated method
    }

    public void from_product_page_i_navigate_to_order_page() {
        navigationSteps.i_navigate_from_product_page_to_order_page();
    }

    public void from_product_page_i_order_a_hunter_product() {
        navigationSteps.i_order_a_hunter_product();
    }

    public void from_product_page_i_order_a_master_hunter_product() {
        navigationSteps.i_order_a_master_hunter_product();
    }

    public void from_product_page_i_order_a_sentinel_product() {
        navigationSteps.i_order_a_sentinel_product();
    }

    public void from_product_page_i_order_an_outpost_product() {
        navigationSteps.i_order_an_outpost_product();
    }

    public void from_services_page_i_request_guotation() {
        navigationSteps.i_navigate_from_services_page_to_quotation_page();
    }

    public void from_support_page_header_i_navigate_to_product_page() {
        navigationSteps.i_navigate_from_support_page_header_to_product_page();
    }

    public void from_support_page_header_i_navigate_to_services_page() {
        navigationSteps.i_navigate_from_support_page_header_to_services_page();
    }

    public void from_support_page_i_navigate_to_change_log_page() {
        navigationSteps.i_navigate_from_support_page_to_changelog_page();
    }

    public void from_support_page_i_navigate_to_documentations_page() {
        navigationSteps.i_navigate_from_support_page_to_documentations_page();
    }

    public void from_support_page_i_navigate_to_installation_documentation_page() {
        navigationSteps.i_navigate_from_support_page_to_installation_documentation_page();
    }

    public void i_am_on_about_page() {
        navigationSteps.i_am_on_about_page();
    }

    public void i_am_on_homepage() {
        navigationSteps.i_am_on_homepage();
    }

    public void i_am_on_product_page() {
        navigationSteps.i_am_on_product_page();
    }

    public void i_am_on_services_page() {
        navigationSteps.i_am_on_services_page();
    }

    public void i_am_on_support_page() {
        navigationSteps.i_am_on_support_page();
    }

    public void i_am_on_changelog_page() {
        navigationSteps.i_am_on_changelog_page();
    }

    public void i_am_on_documentations_page() {
        navigationSteps.i_am_on_documentations_page();
    }

    public void i_am_on_installation_documentation_page() {
        navigationSteps.i_am_on_installation_documentation_page();
    }

    public void i_am_on_interest_page() {
        navigationSteps.i_am_on_interest_page();
    }

    public void i_am_on_order_page_and_hunter_is_selected() {
        navigationSteps.i_am_on_order_page();
        navigationSteps.i_see_that_hunter_is_selected();
    }

    public void i_am_on_order_page_and_master_hunter_is_selected() {
        navigationSteps.i_am_on_order_page();
        navigationSteps.i_see_that_master_hunter_is_selected();
    }

    public void i_am_on_order_page_and_no_product_is_selected() {
        navigationSteps.i_am_on_order_page();
        navigationSteps.i_see_that_no_product_is_selected();
    }

    public void i_am_on_order_page_and_outpost_is_selected() {
        navigationSteps.i_am_on_order_page();
        navigationSteps.i_see_that_outpost_is_selected();
    }

    public void i_am_on_order_page_and_sentinel_is_selected() {
        navigationSteps.i_am_on_order_page();
        navigationSteps.i_see_that_sentinel_is_selected();
    }

    public void i_am_on_pricing_page() {
        navigationSteps.i_am_on_pricing_page();
    }

    public void i_am_on_quotation_page_and_automated_tests_is_selected() {
        navigationSteps.i_am_on_quotation_page();
        // TODO check selection
    }

    public void i_am_on_quotation_page_and_consultancy_is_selected() {
        navigationSteps.i_am_on_quotation_page();
        // TODO check selection
    }

    public void i_am_on_quotation_page_and_dev_and_test_training_is_selected() {
        navigationSteps.i_am_on_quotation_page();
        // TODO check selection
    }

    public void i_am_on_quotation_page_and_online_automated_test_is_selected() {
        navigationSteps.i_am_on_quotation_page();
        navigationSteps.i_see_that_online_automated_testing_is_selected();
    }

    public void i_am_on_quotation_page_and_test_framework_is_selected() {
        navigationSteps.i_am_on_quotation_page();
        // TODO check selection
    }

    public void i_am_on_quotation_page_without_selected_service() {
        navigationSteps.i_am_on_quotation_page();
        // TODO check selection
    }

    public void i_navigate_directly_to_about_page_using_the_navbar() {
        navigationSteps.i_navigate_to_about_page_directly_from_navbar();
    }

    public void i_navigate_directly_to_homepage_using_the_navbar() {
        navigationSteps.i_navigate_to_homepage_directly_from_navbar();
    }

    public void i_navigate_directly_to_product_page_using_the_navbar() {
        navigationSteps.i_navigate_to_product_page_directly_from_navbar();
    }

    public void i_navigate_directly_to_services_page_using_the_navbar() {
        navigationSteps.i_navigate_to_services_page_directly_from_navbar();
    }

    public void i_navigate_directly_to_support_page_using_the_navbar() {
        navigationSteps.i_navigate_to_support_page_directly_from_navbar();
    }

    public void i_request_quotation_for_automated_tests() {
        navigationSteps.i_make_a_request_for_automated_testing_for_applications();
    }

    public void i_request_quotation_for_consultancy() {
        navigationSteps.i_make_a_request_for_consultancy();
    }

    public void i_request_quotation_for_dev_and_test_training() {
        navigationSteps.i_make_a_request_for_trainings();
    }

    public void i_request_quotation_for_online_automated_test() {
        navigationSteps.i_make_a_request_for_online_automated_testing();
    }

    public void i_request_quotation_for_test_framework() {
        navigationSteps.i_make_a_request_for_test_framework_building();
    }

}

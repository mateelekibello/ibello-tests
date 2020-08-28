package hu.ibello.demo.workflow;

import hu.ibello.core.Name;
import hu.ibello.demo.steps.NavigationSteps;
import hu.ibello.steps.StepLibrary;

@Name("navigation")
public class NavigationWorkflow extends StepLibrary{

    private NavigationSteps navigationSteps;

    public void i_am_on_about_page() {
        // TODO auto-generated method
    }

    public void i_am_on_homepage() {
        navigationSteps.i_open_the_homepage();
    }

    public void i_am_on_product_page() {
        navigationSteps.i_am_on_product_page();
    }

    public void i_am_on_services_page() {
        navigationSteps.i_am_on_services_page();
    }

    public void i_am_on_support_page() {
        // TODO auto-generated method
    }

    public void i_navigate_back_to_homepage() {
        navigationSteps.i_navigate_back_to_homepage();
    }

    public void i_navigate_to_about_page() {
        navigationSteps.i_navigate_from_homepage_to_about_page();
    }

    public void i_navigate_to_product_page() {
        navigationSteps.i_navigate_from_homepage_to_product_page();
    }

    public void i_navigate_to_services_page() {
        navigationSteps.i_navigate_from_homepage_to_services_page();
    }

    public void i_navigate_to_support_page() {
        navigationSteps.i_navigate_from_homepage_to_support_page();
    }

    public void test_init() {
        // TODO auto-generated method
    }
}

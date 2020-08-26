package hu.ibello.demo;

import hu.ibello.demo.steps.NavigationSteps;
import hu.ibello.demo.steps.OrderingWithExistingUserSteps;
import hu.ibello.steps.StepLibrary;

//@Name("Ordering with existing user")
public class OrderingWithExistingUserWorkflow extends StepLibrary{

    private NavigationSteps navigationSteps;
    private OrderingWithExistingUserSteps orderingSteps;

    public void i_navigate_to_the_order_page() {
        navigationSteps.i_navigate_from_homepage_to_the_order_page();
    }

    public void the_username_will_be_invalid() {
        // TODO testdata
        orderingSteps.i_fill_out_the_ordering_form_with_existing_user();
    }

    public void the_password_will_be_invalid() {
        // TODO auto-generated method
    }

    public void the_product_will_be_invalid() {
        // TODO auto-generated method
    }

    public void i_send_the_order() {
        // TODO auto-generated method
    }

    public void i_see_that_there_is_an_error_message() {
        // TODO auto-generated method
    }

    public void i_use_valid_username_and_password() {
        // TODO auto-generated method
    }

    public void i_see_that_the_order_is_successfull() {
        // TODO auto-generated method
    }

}

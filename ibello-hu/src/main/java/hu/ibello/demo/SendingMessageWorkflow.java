package hu.ibello.demo;

import hu.ibello.demo.steps.NavigationSteps;
import hu.ibello.demo.steps.SendingMessageSteps;
import hu.ibello.steps.StepLibrary;

//@Name("Sending message")
public class SendingMessageWorkflow extends StepLibrary{

    private SendingMessageSteps sendingMessageSteps;
    private NavigationSteps navigationSteps;

    public void i_want_to_send_a_new_message() {
        navigationSteps.expect_homepage_is_loaded();
    }

    public void the_name_will_be_invalid() {
        // TODO auto-generated method
        sendingMessageSteps.i_use_$_invalid_name();
    }

    public void the_email_will_be_invalid() {
        sendingMessageSteps.i_use_$_invalid_email();
    }

    public void the_subject_will_be_invalid() {
        // TODO auto-generated method
        sendingMessageSteps.i_use_$_invalid_subject();
    }

    public void the_message_will_be_invalid() {
        // TODO auto-generated method
        sendingMessageSteps.i_use_$_invalid_message();
    }

    public void i_send_the_message() {
        sendingMessageSteps.i_send_the_message();
    }

    public void i_see_that_the_there_is_an_error_message() {
        // TODO auto-generated method
    }

}

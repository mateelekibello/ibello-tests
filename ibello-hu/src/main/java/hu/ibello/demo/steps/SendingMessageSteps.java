package hu.ibello.demo.steps;

import hu.ibello.core.Name;
import hu.ibello.demo.pages.HomePage;
import hu.ibello.steps.StepLibrary;

@Name("Sending message steps")
public class SendingMessageSteps extends StepLibrary {

    private HomePage homePage;

    public void i_send_the_message() {
        homePage.click_send_message_button();
    }

    public void i_use_$_invalid_name() {
    }

    public void i_use_$_invalid_email() {
    }

    public void i_use_$_invalid_subject() {
    }

    public void i_use_$_invalid_message() {
    }
}

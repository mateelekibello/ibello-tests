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
        homePage.set_contact_name_field_to_$("");
    }

    public void i_use_$_invalid_email() {
        homePage.set_contact_email_field_to_$("asdsadasd");
    }

    public void i_use_$_invalid_subject() {
        homePage.set_contact_subject_field_to_$("");
    }

    public void i_use_$_invalid_message() {
        homePage.set_contact_text_field_to_$("");
    }

    public void i_see_the_error_message() {
        homePage.assume_error_message_is_displayed();
        homePage.assume_error_message_is_not_displayed();
    }
}

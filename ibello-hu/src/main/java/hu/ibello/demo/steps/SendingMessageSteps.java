package hu.ibello.demo.steps;

import hu.ibello.core.Name;
import hu.ibello.demo.model.ContactData;
import hu.ibello.demo.pages.HomePage;
import hu.ibello.steps.StepLibrary;

@Name("Sending message steps")
public class SendingMessageSteps extends StepLibrary {

    private HomePage homePage;

    public void i_send_the_message() {
        homePage.click_send_message_button();
    }

    public void i_use_$_test_data_to_fill_out_the_form(ContactData data) {
        if (data != null) {
            if (data.getName() != null) {
                homePage.set_contact_name_field_to_$(data.getName());
            }
            if (data.getEmail() != null) {
                homePage.set_contact_email_field_to_$(data.getEmail());
            }
            if (data.getSubject() != null) {
                homePage.set_contact_subject_field_to_$(data.getSubject());
            }
            if (data.getMessage() != null) {
                homePage.set_contact_text_field_to_$(data.getMessage());
            }
        }
    }

    public void i_see_the_error_message() {
        homePage.assume_error_message_is_displayed();
        homePage.assume_error_message_is_not_displayed();
    }

    public void i_see_the_success_message() {
        homePage.assume_success_message_is_displayed();
        homePage.assume_success_message_is_not_displayed();
    }
}

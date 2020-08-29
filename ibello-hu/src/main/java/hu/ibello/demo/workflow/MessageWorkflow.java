package hu.ibello.demo.workflow;

import hu.ibello.core.Name;
import hu.ibello.demo.model.ContactData;
import hu.ibello.demo.steps.NavigationSteps;
import hu.ibello.demo.steps.SendingMessageSteps;
import hu.ibello.steps.StepLibrary;

@Name("Message")
public class MessageWorkflow extends StepLibrary{

    private NavigationSteps navigationSteps;
    private SendingMessageSteps sendingMessageSteps;
    private boolean isOpened;
    private ContactData data;
    private ContactData invalidData;

    public void i_want_to_send_a_new_message() {
        data = testData().fromJson(ContactData.class).load();
        invalidData = testData().fromJson(ContactData.class).withId("invalid").load();
        if (!isOpened) {
            navigationSteps.i_open_the_homepage();
            isOpened = true;
        }
        navigationSteps.i_am_on_homepage();
    }

    public void the_name_will_be_invalid() {
        data.setName(invalidData.getName());
    }

    public void the_email_will_be_invalid() {
        data.setEmail(invalidData.getEmail());
    }

    public void the_subject_will_be_invalid() {
        data.setSubject(invalidData.getSubject());
    }

    public void the_message_will_be_invalid() {
        data.setMessage(invalidData.getMessage());
    }

    public void i_fill_out_the_form_and_send_the_message() {
        sendingMessageSteps.i_use_$_test_data_to_fill_out_the_form(data);
        sendingMessageSteps.i_send_the_message();
    }

    public void i_see_$_error_messages(int number) {
        sendingMessageSteps.i_see_$_error_messages(number);
    }

    public void i_see_that_sending_message_was_successfull() {
        sendingMessageSteps.i_see_the_success_message();
    }

}

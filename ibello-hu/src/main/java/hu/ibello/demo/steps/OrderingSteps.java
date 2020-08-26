package hu.ibello.demo.steps;

import hu.ibello.core.Name;
import hu.ibello.demo.PopUpMessagesPanel;
import hu.ibello.demo.pages.OrderPage;
import hu.ibello.steps.StepLibrary;

@Name("Ordering steps")
public class OrderingSteps extends StepLibrary {

    private OrderPage orderPage;
    private PopUpMessagesPanel popUpMessagesPanel;

    public void i_send_the_order() {
        orderPage.click_sending_order_button();
    }

    public void i_see_the_error_message() {
        popUpMessagesPanel.assume_error_message_is_displayed();
        popUpMessagesPanel.assume_error_message_is_not_displayed();
    }

    public void i_see_the_success_message() {
        popUpMessagesPanel.assume_success_message_is_displayed();
        popUpMessagesPanel.assume_success_message_is_not_displayed();
    }
}

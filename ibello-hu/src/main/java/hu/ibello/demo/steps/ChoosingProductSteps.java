package hu.ibello.demo.steps;

import hu.ibello.core.Name;
import hu.ibello.demo.model.ProductToOrder;
import hu.ibello.demo.pages.OrderPage;
import hu.ibello.steps.StepLibrary;

@Name("Choosing product to order")
public class ChoosingProductSteps extends StepLibrary {

    private OrderPage orderPage;

    public void i_choose_the_products_to_order(ProductToOrder data) {
        if (data != null) {
            change_number_of_product(data.getOutpost(), 0);
            change_number_of_product(data.getSentinel(), 1);
            change_number_of_product(data.getHunter(), 2);
            change_number_of_product(data.getMasterHunter(), 3);
        }
    }

    private void change_number_of_product(int expectedNum, int productIndex) {
        int currentNum = Integer.parseInt(orderPage.getNumberOfProduct(productIndex));
        while (expectedNum != currentNum) {
            if (expectedNum > currentNum) {
                orderPage.click_increase_button_with_$_index(productIndex);
            }
            if (expectedNum < currentNum) {
                orderPage.click_decrease_button_with_$_index(productIndex);
            }
            currentNum = Integer.parseInt(orderPage.getNumberOfProduct(productIndex));
        }
    }

}

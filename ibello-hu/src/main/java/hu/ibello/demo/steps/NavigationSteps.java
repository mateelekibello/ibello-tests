package hu.ibello.demo.steps;

import hu.ibello.core.Name;
import hu.ibello.demo.model.LanguageSelection;
import hu.ibello.demo.pages.HomePage;
import hu.ibello.demo.pages.NavigationBarPage;
import hu.ibello.steps.StepLibrary;

@Name("Navigation steps")
public class NavigationSteps extends StepLibrary {

    private NavigationBarPage navigationBar;
    private HomePage homePage;

    public void expect_homepage_is_loaded() {
        homePage.i_open_the_page();
        homePage.i_see_the_homepage();
    }

    public void select_language_based_on_$_test_data(LanguageSelection data) {
        if (data != null && data.getLanguage() != null) {
            navigationBar.click_language_link();
            switch (data.getLanguage()) {
                case HUNGARIAN:
                    navigationBar.click_hungarian_link();
                    break;
                case ENGLISH:
                    navigationBar.click_english_link();
                    break;
                default:
                    break;
            }
        }
    }

    public void i_navigate_to_the_order_page(){
        homePage.click_our_product_button();

    }

}

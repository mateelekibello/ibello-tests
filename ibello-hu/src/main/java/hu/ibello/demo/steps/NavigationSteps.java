package hu.ibello.demo.steps;

import hu.ibello.core.Name;
import hu.ibello.demo.Languages;
import hu.ibello.demo.pages.HomePage;
import hu.ibello.demo.pages.NavigationBarPage;
import hu.ibello.steps.StepLibrary;

@Name("Navigation steps")
public class NavigationSteps extends StepLibrary {

    private NavigationBarPage navigationBar;
    private HomePage homePage;

    public void expect_homepage_is_loaded() {
        homePage.expect_menu_component_is_displayed();
        homePage.expect_main_lane_is_displayed();
    }

    public void select_$_language(Languages language) {
        navigationBar.click_language_link();
        switch (language) {
            case ENGLISH:
                navigationBar.click_english_link();
                break;
            case HUNGARIAN:
                navigationBar.click_hungarian_link();
                break;
            default:
                break;
        }
    }

}

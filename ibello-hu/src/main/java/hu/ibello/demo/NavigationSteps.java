package hu.ibello.demo;

import hu.ibello.core.Name;
import hu.ibello.demo.pages.HomePage;
import hu.ibello.demo.pages.NavigationBarPage;
import hu.ibello.steps.StepLibrary;

@Name("Navigation steps")
public class NavigationSteps extends StepLibrary {

    private NavigationBarPage navigationBar;
    private HomePage homePage;

    public void homepage_is_loaded() {
        homePage.expect_homepage_is_displayed();
    }

    public void click_on_language_selector() {
        navigationBar.click_language_link();
    }
}

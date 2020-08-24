package hu.ibello.demo;

import hu.ibello.core.Name;
import hu.ibello.steps.StepLibrary;

@Name("Language steps")
public class LanguageSteps extends StepLibrary {

    private HomePage homePage;

    public void click_on_language_selector() {
        homePage.click_language_selector_link();
    }
}

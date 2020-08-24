package hu.ibello.demo;

import hu.ibello.core.Name;
import hu.ibello.demo.pages.NavigationBarPage;
import hu.ibello.steps.StepLibrary;

@Name("Language steps")
public class LanguageSteps extends StepLibrary {

    private NavigationBarPage navigationBarPage;

    public void click_on_language_selector() {
        navigationBarPage.click_language_link();
    }
}

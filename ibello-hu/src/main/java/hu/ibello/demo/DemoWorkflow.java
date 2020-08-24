package hu.ibello.demo;

import hu.ibello.core.Name;
import hu.ibello.steps.StepLibrary;

@Name("Demo")
public class DemoWorkflow extends StepLibrary{

    private LanguageSteps languageSteps;

    public void select_english_language() {
        languageSteps.click_on_language_selector();
    }

}

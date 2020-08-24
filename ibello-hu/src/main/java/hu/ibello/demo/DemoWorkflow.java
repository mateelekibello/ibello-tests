package hu.ibello.demo;

import hu.ibello.core.Name;
import hu.ibello.steps.StepLibrary;

@Name("Demo")
public class DemoWorkflow extends StepLibrary{

    private NavigationSteps navigationStepsSteps;

    public void select_english_language() {
        navigationStepsSteps.click_on_language_selector();
    }

}

package hu.ibello.demo;

import hu.ibello.core.Name;
import hu.ibello.steps.StepLibrary;

@Name("Demo")
public class DemoWorkflow extends StepLibrary{

    private NavigationSteps navigationStepsSteps;

    public void homepage_is_loaded() {
       navigationStepsSteps.expect_homepage_is_loaded();
    }

    public void select_language() {
        navigationStepsSteps.select_$_language(Languages.ENGLISH);
    }

    public void language_is_changed() {
        // TODO auto-generated method
    }



}

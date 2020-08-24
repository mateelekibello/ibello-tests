package hu.ibello.demo;

import hu.ibello.core.Name;
import hu.ibello.demo.steps.NavigationSteps;
import hu.ibello.steps.StepLibrary;

@Name("Demo")
public class DemoWorkflow extends StepLibrary{

    private NavigationSteps navigationStepsSteps;

    public void homepage_is_loaded() {
       navigationStepsSteps.expect_homepage_is_loaded();
    }

    public void select_language() {
        LanguageSelection data = testData().fromJson(LanguageSelection.class).withId("1").load();
        navigationStepsSteps.select_language_based_on_$_test_data(data);
    }

    public void language_is_changed() {
        // TODO auto-generated method
    }



}

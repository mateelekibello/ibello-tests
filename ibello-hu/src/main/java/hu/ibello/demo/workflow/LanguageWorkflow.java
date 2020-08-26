package hu.ibello.demo.workflow;

import hu.ibello.core.Name;
import hu.ibello.demo.model.LanguageSelection;
import hu.ibello.demo.steps.LanguageSteps;
import hu.ibello.demo.steps.NavigationSteps;
import hu.ibello.steps.StepLibrary;

@Name("Language")
public class LanguageWorkflow extends StepLibrary{

    private NavigationSteps navigationStepsSteps;
    private LanguageSteps languageSteps;

    public void i_open_the_homepage() {
        navigationStepsSteps.expect_homepage_is_loaded();
    }

    public void i_select_the_language() {
        LanguageSelection data = testData().fromJson(LanguageSelection.class).withId("1").load();
        navigationStepsSteps.select_language_based_on_$_test_data(data);
    }

    public void language_is_changed() {
        LanguageSelection data = testData().fromJson(LanguageSelection.class).withId("1").load();
        languageSteps.check_texts_based_on_$_test_data(data);
    }

}

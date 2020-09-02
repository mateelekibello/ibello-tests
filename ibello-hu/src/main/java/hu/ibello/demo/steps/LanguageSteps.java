package hu.ibello.demo.steps;

import hu.ibello.core.Name;
import hu.ibello.demo.model.LanguageSelection;
import hu.ibello.demo.pages.HomePage;
import hu.ibello.steps.StepLibrary;

import java.util.List;

@Name("Language steps")
public class LanguageSteps extends StepLibrary {

    private HomePage homePage;

    public void check_texts_based_on_$_test_data(LanguageSelection data) {
        if (data != null && data.getLanguage() != null && data.getHungarianTexts() != null
                && data.getEnglishTexts() != null) {
            switch (data.getLanguage()) {
                case HUNGARIAN:
                    list_is_displayed(data.getHungarianTexts());
                    list_is_not_displayed(data.getEnglishTexts());
                    break;
                case ENGLISH:
                    list_is_displayed(data.getEnglishTexts());
                    list_is_not_displayed(data.getHungarianTexts());
                    break;
            }
        } else {
            throw new AssertionError("One or more testdata are null!");
        }
    }

    private void list_is_displayed(List<String>displayedList) {
        for (String text : displayedList) {
            homePage.assume_$_text_is_displayed(text);
        }
    }

    private void list_is_not_displayed(List<String>notDisplayedList) {
        for (String text : notDisplayedList) {
            homePage.assume_$_text_is_not_displayed(text);
        }
    }

}

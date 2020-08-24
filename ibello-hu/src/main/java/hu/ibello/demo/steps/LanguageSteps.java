package hu.ibello.demo.steps;

import hu.ibello.core.Name;
import hu.ibello.demo.LanguageSelection;
import hu.ibello.demo.pages.HomePage;
import hu.ibello.steps.StepLibrary;

import java.util.List;

@Name("Language steps")
public class LanguageSteps extends StepLibrary {

    private HomePage homePage;

    public void check_texts_based_on_$_test_data(LanguageSelection data) {
        if (data != null && data.getLanguage() != null) {
            switch (data.getLanguage()) {
                case HUNGARIAN:
                    if (data.getHungarianTexts() != null && data.getEnglishTexts() != null) {
                        first_list_is_displayed_second_is_not(data.getHungarianTexts(), data.getEnglishTexts());
                    }
                    break;
                case ENGLISH:
                    if (data.getEnglishTexts() != null && data.getHungarianTexts() != null) {
                        first_list_is_displayed_second_is_not(data.getEnglishTexts(), data.getHungarianTexts());
                    }
                    break;
            }
        }
    }

    private void first_list_is_displayed_second_is_not(List<String>displayedList, List<String>notDisplayedList) {
        for (String text : displayedList) {
            homePage.assume_$_text_is_displayed(text);
        }
        for (String text : notDisplayedList) {
            homePage.assume_$_text_is_not_displayed(text);
        }

    }
}

package hu.ibello.demo;

import hu.ibello.core.Description;
import hu.ibello.data.Model;

import java.util.List;

@Model
public class LanguageSelection {

    @Description("Selected language will be selected during the test.")
    private Languages language;
    @Description("These texts will be checked to be displayed after changing the language.")
    @Description("If english is not the selected language then the test will check if these languages are not displayed.")
    private List<String> englishTexts;
    @Description("These texts will be checked to be displayed after changing the language.")
    @Description("If hungarian is not the selected language then the test will check if these languages are not displayed.")
    private List<String> hungarianTexts;

    public List<String> getEnglishTexts() {
        return englishTexts;
    }

    public List<String> getHungarianTexts() {
        return hungarianTexts;
    }

    public Languages getLanguage() {
        return language;
    }


}

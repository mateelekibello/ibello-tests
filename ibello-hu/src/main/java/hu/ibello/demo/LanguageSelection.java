package hu.ibello.demo;

import hu.ibello.data.Model;

@Model
public class LanguageSelection {

    private LanguageToSelect hungarian;
    private LanguageToSelect english;

    public LanguageToSelect getHungarian() {
        return hungarian;
    }

    public LanguageToSelect getEnglish() {
        return english;
    }
}

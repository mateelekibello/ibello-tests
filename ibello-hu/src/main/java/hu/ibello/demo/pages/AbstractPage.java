package hu.ibello.demo.pages;

import hu.ibello.pages.PageObject;

public abstract class AbstractPage extends PageObject {

    public void expect_url_is_$(String url) {
        expectations().assume(browser()).toHave().url(url);
    }

}

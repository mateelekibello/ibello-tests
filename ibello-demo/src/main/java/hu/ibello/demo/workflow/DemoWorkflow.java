package hu.ibello.demo.workflow;

import hu.ibello.demo.pages.DocumentationsPage;
import hu.ibello.demo.pages.HomePage;
import hu.ibello.demo.pages.LandingPage;
import hu.ibello.demo.pages.LicensesPage;
import hu.ibello.demo.pages.LoginPage;
import hu.ibello.demo.pages.MenuPanel;
import hu.ibello.steps.StepLibrary;

public class DemoWorkflow extends StepLibrary {

	private MenuPanel menu;
	
	private LandingPage landing;
	private LoginPage login;
	private HomePage home;
	private DocumentationsPage documentations;
	private LicensesPage licenses;
	
	private boolean loggedIn = false;
	
	public void I_am_logged_out() {
		loggedIn = false;
	}

	public void I_am_on_the_DOCUMENTATIONS_page() {
		documentations.expect_page_is_opened();
	}

	public void I_am_on_the_HOME_page() {
		home.expect_page_is_opened();
	}

	public void I_am_on_the_LANDING_page() {
		landing.open_page();
	}

	public void I_am_on_the_LICENSES_page() {
		licenses.expect_page_is_opened();
	}

	public void I_am_on_the_LOGIN_page() {
		login.expect_page_is_opened();
	}

	public void I_log_in_with_valid_credentials() {
		login.set_userid_field(getConfigurationValue("username").toString());
		login.set_password_field(getConfigurationValue("password").toString());
		login.click_submit_button();
		loggedIn = true;
	}

	public void I_log_out() {
		home.click_kilépés_button();
	}

	public void I_navigate_to_documentations() {
		if (loggedIn) {
			home.click_további_dokumentációk_link();
		} else {
			landing.click_további_dokumentációk_link();
		}
	}

	public void I_navigate_to_home() {
		menu.click_főoldal_link();
	}

	public void I_navigate_to_landing() {
		menu.click_navbar_brand_link();
	}

	public void I_navigate_to_licenses() {
		home.click_licencek_kezelése_button();
	}

	public void I_navigate_to_login() {
		menu.click_bejelentkezés_link();
	}
	
}

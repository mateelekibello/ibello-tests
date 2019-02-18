package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.tests.ibellohu.pages.LicensesPage;
import hu.ibello.tests.ibellohu.pages.LoginPage;
import hu.ibello.tests.ibellohu.pages.MainPage;
import hu.ibello.tests.ibellohu.pages.OpenPage;
import hu.ibello.tests.ibellohu.pages.MenuPage;
import hu.ibello.tests.ibellohu.pages.OrderPage;
import hu.ibello.tests.ibellohu.pages.PersonalPage;
import hu.ibello.tests.ibellohu.pages.BlogPage;
import hu.ibello.tests.ibellohu.pages.BlogPostPage;

@Name("Nyelvválasztó")
public class LanguageSteps extends AbstractSteps {
	
	private MainPage mainPage;
	private OpenPage openPage;
	private MenuPage menuPage;
	private LoginPage loginPage;
	private PersonalPage personalPage;
	private LicensesPage licensesPage;
	private OrderPage orderPage;
	private BlogPage blogPage;
	private BlogPostPage blogPostPage;
	
//	@Name("Magyar nyelv kiválasztása")
	public void magyar_nyelv_kiválasztása() {
		menuPage.beállítom_a_nyelvválasztót("Magyar");
	}

//	@Name("Angol nyelv kiválasztása")
	public void angol_nyelv_kiválasztása() {
		menuPage.beállítom_a_nyelvválasztót("English");
	}

	public void magyarra_állított_nyelvválasztó() {
		menuPage.a_nyelvválasztó_állásának_ellenőrzése("Magyar");
	}
	
	public void angolra_állított_nyelvválasztó() {
		menuPage.a_nyelvválasztó_állásának_ellenőrzése("English");
	}
}

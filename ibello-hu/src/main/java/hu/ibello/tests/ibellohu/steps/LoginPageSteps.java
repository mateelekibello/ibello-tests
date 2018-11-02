package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.inject.Inject;
import hu.ibello.tests.ibellohu.tools.TestData;

@Name("Bejelentkező oldal")
public class LoginPageSteps extends AbstractSteps {

	@Inject
	private TestData testData;
	
	@Name("Beírom a felhasználónevet")
	public void beírom_a_felhasználónevet() {
		String userName = testData.user.username;
		// TODO írd be a mezőbe a userName értéket
	}
	
	@Name("Beírom a jelszót")
	public void beírom_a_jelszót() {
		
	}
	
	@Name("Bejelentkezek")
	public void bejelentkezek() {
		
	}
	
	@Name("Felugrik a sikertelen bejelentkezés üzenetablak")
	public void felugrik_a_sikertelen_bejelentkezés_üzenetablak() {
		
	}
}

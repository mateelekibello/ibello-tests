package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.tests.ibellohu.pages.PersonalPage;

public class PersonalPageSteps {
	
	private PersonalPage personalPage;
	
	@Name("A bejelentkezett felhasználó adatai jelennek meg")
	public void a_bejelentkezett_felhasználó_adatai_jelennek_meg() {
		personalPage.felhasználóiAdatok();
	}

}

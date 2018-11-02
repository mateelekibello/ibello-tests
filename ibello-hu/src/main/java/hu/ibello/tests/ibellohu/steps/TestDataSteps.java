package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.inject.Inject;
import hu.ibello.tests.ibellohu.model.User;
import hu.ibello.tests.ibellohu.tools.TestData;

@Name("Tesztadat")
public class TestDataSteps extends AbstractSteps {
	
	@Inject
	private TestData testData;

	@Name("Az aktuális felhasználói adatok azonosítója legyen ${0}")
	public void az_aktuális_felhasználói_adatok_azonosítója_legyen(String userId) {
		testData.user = new User();
		testData.user.username = getConfigurationValue("user." + userId + ".name").toString();
		testData.user.password = getConfigurationValue("user." + userId + ".password").toString();
	}
}

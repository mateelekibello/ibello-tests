package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.inject.Inject;
import hu.ibello.tests.ibellohu.model.License;
import hu.ibello.tests.ibellohu.model.User;
import hu.ibello.tests.ibellohu.tools.TestData;

@Name("Tesztadat")
public class TestDataSteps extends AbstractSteps {
	
	@Inject
	private TestData testData;
	
	public void az_aktuális_felhasználó_azonosítója_legyen_$(String userId) {
		testData.user = testData().fromJson(User.class).withId(userId).load();
		testData.user.password = getConfigurationValue("user." + userId + ".password").toString();
	}
	
	public void a_licenc_adatainak_beolvasása() {
		testData.license = testData().fromJson(License.class).withId("user").load();
	}
}

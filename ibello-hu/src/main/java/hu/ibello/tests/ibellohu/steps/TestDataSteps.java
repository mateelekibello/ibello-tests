package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.inject.Inject;
import hu.ibello.tests.ibellohu.model.User;
import hu.ibello.tests.ibellohu.tools.TestData;

@Name("Tesztadat")
public class TestDataSteps extends AbstractSteps {
	
	@Inject
	private TestData testData;
	
	@Name("Az aktuális belépési adatok azonosítója legyen ${0}")
	public void az_aktuális_belépési_adatok_azonosítója_legyen(String userId) {
		testData.user = new User();
		testData.user.username = getConfigurationValue("user." + userId + ".name").toString();
		testData.user.password = getConfigurationValue("user." + userId + ".password").toString();
		testData.user.email = getConfigurationValue("user." + userId + ".email").toString();
	}
	
	@Name("Az aktuális személyes adatok azonosítója legyen ${0}")
	public void az_aktuális_személyes_adatok_azonosítója_legyen(String userId) {
		testData.user = new User();
		testData.user.username = getConfigurationValue("user." + userId + ".name").toString();
		testData.user.password = getConfigurationValue("user." + userId + ".password").toString();
		testData.user.email = getConfigurationValue("user." + userId + ".email").toString();
		testData.user.firstname = getConfigurationValue("user." + userId + ".firstname").toString();
		testData.user.lastname = getConfigurationValue("user." + userId + ".lastname").toString();
		testData.user.organisation = getConfigurationValue("user." + userId + ".organisation").toString();
	}

	@Name("Az aktuális felhasználói adatok azonosítója legyen ${0}")
	public void az_aktuális_felhasználói_adatok_azonosítója_legyen(String userId) {
		testData.user = new User();
		testData.user.username = getConfigurationValue("user." + userId + ".name").toString();
		testData.user.password = getConfigurationValue("user." + userId + ".password").toString();
		testData.user.email = getConfigurationValue("user." + userId + ".email").toString();
		testData.user.firstname = getConfigurationValue("user." + userId + ".firstname").toString();
		testData.user.lastname = getConfigurationValue("user." + userId + ".lastname").toString();
		testData.user.organisation = getConfigurationValue("user." + userId + ".organisation").toString();
/*		testData.user.billingAddress.organisation = getConfigurationValue("user." + userId + "billingAddress.organisation").toString();
		testData.user.billingAddress.firstname = getConfigurationValue("user." + userId + "billingAddress.firstname").toString();
		testData.user.billingAddress.lastname = getConfigurationValue("user." + userId + "billingAddress.lastname").toString();
		testData.user.billingAddress.taxNumber = getConfigurationValue("user." + userId + "billingAddress.taxNumber").toString();
		testData.user.billingAddress.country = getConfigurationValue("user." + userId + "billingAddress.country").toString();
		testData.user.billingAddress.city = getConfigurationValue("user." + userId + "billingAddress.city").toString();
		testData.user.billingAddress.state = getConfigurationValue("user." + userId + "billingAddress.state").toString();
		testData.user.billingAddress.zipCode = getConfigurationValue("user." + userId + "billingAddress.zipCode").toString();
		testData.user.billingAddress.address1 = getConfigurationValue("user." + userId + "billingAddress.address1").toString();
		testData.user.billingAddress.address2 = getConfigurationValue("user." + userId + "billingAddress.address2").toString();
	*/}
}

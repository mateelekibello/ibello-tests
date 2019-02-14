package hu.ibello.tests.ibellohu.steps;

import hu.ibello.core.Name;
import hu.ibello.inject.Inject;
import hu.ibello.tests.ibellohu.model.License;
import hu.ibello.tests.ibellohu.model.User;
import hu.ibello.tests.ibellohu.model.Order;
import hu.ibello.tests.ibellohu.model.Post;
import hu.ibello.tests.ibellohu.tools.TestData;

@Name("Tesztadat")
public class TestDataSteps extends AbstractSteps {
	
	@Inject
	private TestData testData;
	
	public void az_aktuális_felhasználó_azonosítója_legyen_$(String userId) {
		testData.user = testData().fromJson(User.class).withId(userId).load();
		testData.user.password = getConfigurationValue("user." + userId + ".password").toString();
	}
	
	public void az_aktuális_licenc_neve_legyen_$(String licenseId) {
		testData.license = testData().fromJson(License.class).withId(licenseId).load();
	}
	
	public void az_aktuális_rendelés_neve_legyen_$(String orderId) {
		int price;
		int sum = 0;
		testData.order = testData().fromJson(Order.class).withId(orderId).load();
		price = testData.order.bronzeNumber * testData.order.bronzePrice;
		sum += price;
		testData.order.bronzeItemPrice = String.valueOf(price) + " Forint";
		price = testData.order.silverNumber * testData.order.silverPrice;
		sum += price;
		testData.order.silverItemPrice = String.valueOf(price) + " Forint";
		price = testData.order.goldNumber * testData.order.goldPrice;
		sum += price;
		testData.order.goldItemPrice = String.valueOf(price) + " Forint";
		testData.order.sumPrice = String.valueOf(sum) + " Forint";
	}
	
	public void az_aktuális_poszt_címe_legyen_$(String postId) {
		testData.post = testData().fromJson(Post.class).withId(postId).load();
	}

}

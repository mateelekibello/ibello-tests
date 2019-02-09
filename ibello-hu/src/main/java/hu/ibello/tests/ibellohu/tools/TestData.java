package hu.ibello.tests.ibellohu.tools;

import hu.ibello.inject.Injectable;
import hu.ibello.tests.ibellohu.model.User;
import hu.ibello.tests.ibellohu.model.License;
import hu.ibello.tests.ibellohu.model.Order;
import hu.ibello.tests.ibellohu.model.Post;

@Injectable
public class TestData {

	public User user;
	public License license;
	public Order order;
	public Post post;
}

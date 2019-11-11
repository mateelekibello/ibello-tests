package hu.ibello.tests.ibellohu.model;

import hu.ibello.data.Model;

@Model
public class User {

	public String username;
	public String password;
	public String email;
	public String firstname;
	public String lastname;
	public String organisation;
	public BillingAddress billingAddress;
}

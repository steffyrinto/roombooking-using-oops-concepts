package register;

import customer.Customer;

//import customerpackage.Customer;

public class Registration {
	Customer customer=new Customer();

	public void Registration(String firstName, String middleName, String lastName, String email, String contact)
	{
	
	customer.setFirstName(firstName);
	customer.setMiddleName(middleName);
	customer.setLastName(lastName);
	customer.setEmail(email);
	customer.setContact(contact);
	//System.out.println("Thanks for registering");
	System.out.println("\nYour details are\n");
	this.display(customer);
	}
	
	private void display(Customer customer)
	{
		System.out.println("    Name    : "+customer.getFirstName()+" "+customer.getMiddleName()+" "+customer.getLastName()+"\n\n    Email   : "+customer.getEmail()+"\n\n    Contact : "+customer.getContact());
	}
	public void emailupdate(String email,int register)
	{
		System.out.println(email);
		customer.setEmail(email);
		this.display(customer);
	}
	}

package ecommerce


class CustomerAddress {

	 Integer customerAddressID;  
	 Customer customerID;
	 String status;  	
	 String firstName;  	
	 String lastName;  	
	 String organization;  	
	 String address1;  	
	 String address2;  	
	 String city;  	
	 String state;  	
	 String postalCode;  
	 String country;  
	 String phone1;  
	 String phone2;  
	 String email1; 
	 String email2;  
	 String extra1;  
	 String extra2;  	
	 String notes;  	
	 String extra3;  
	 String extra4;  	
	 String extra5;  	
	
	static mapping = {
		table 'CustomerAddress'
		version false
		id column: 'customerAddressID'
	}
	
	
    static constraints = {
		status(nullable: true)
		firstName(nullable: true)
		lastName(nullable: true)
		organization(nullable: true)
		address1(nullable: true)
		address2(nullable: true)
		city(nullable: true)
		state(nullable: true)
		postalCode(nullable: true)
		country(nullable: true)
		phone1(nullable: true)
		phone2(nullable: true)
		email1(nullable: true)
		email2(nullable: true)
		extra1(nullable: true)
		extra2(nullable: true)
		notes(nullable: true)
		extra3(nullable: true)
		extra4(nullable: true)
		extra5(nullable: true)
    }
}

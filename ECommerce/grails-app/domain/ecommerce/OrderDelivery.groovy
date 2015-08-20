package ecommerce


class OrderDelivery {

	 Integer orderDeliveryID;
	 Order orderID;
	 String trackingNumber;
	 Double total;
	 Double shipping;
	 Double tax;
	 Double taxableSubtotal;
	 Double subtotal;
	 Double weight;
	 Integer quantity;
	 Date lastModified;
	 Date delivered;
	 String status;
	 String statusDetails;
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
		table 'OrderDelivery'
		version false
		id column: 'orderDeliveryID'
	}
	
	
    static constraints = {
		
		trackingNumber(nullable: true)
		total(nullable: true)
		shipping(nullable: true)
		tax(nullable: true)
		taxableSubtotal(nullable: true)
		subtotal(nullable: true)
		weight(nullable: true)
		quantity(nullable: true)
		lastModified(nullable: true)
		delivered(nullable: true)
		status(nullable: true)
		statusDetails(nullable: true)
		firstName(nullable: true)
		lastName (nullable: true)
		organization(nullable: true)
		address1 (nullable: true)
		address2 (nullable: true)
		city (nullable: true)
		state (nullable: true)
		postalCode(nullable: true)
		country (nullable: true)
		phone1  (nullable: true)
		phone2  (nullable: true)
		email1 (nullable: true)
		email2 (nullable: true)
		extra1  (nullable: true)
		extra2  (nullable: true)
		notes  	(nullable: true)
		extra3  (nullable: true)
		extra4  (nullable: true)
		extra5 (nullable: true)
    }
}

package ecommerce


class BasicTaxRate {

	 Integer basicTaxRateID;
	 Country countryID;
	 State stateID;
	 String city;
	 String postalCode;  
	 Double rate;
	 int isActive;
	
	static mapping = {
		table 'BasicTaxRate'
		version false
		id column: 'basicTaxRateID'
	}
	
	
    static constraints = {
		countryID(nullable: true)
		stateID(nullable: true)
		city(nullable: true)
		postalCode(nullable: true)
    }
}

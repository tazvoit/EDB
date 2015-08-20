package ecommerce


class Country {

	 //Integer countryID;
	 String name; 
	 String code;
	 Integer countryOrder;
	 int allowOtherStates;
	 int isActive;
	
	static mapping = {
		table 'Country'
		version false
		id column: 'countryID' , generator:'sequence', params:[sequence:'countryID_SEQ']
	}
	
	
    static constraints = {
		code(nullable: true)
    }
}

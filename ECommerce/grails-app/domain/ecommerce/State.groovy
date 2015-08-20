package ecommerce


class State {

	 Integer stateID;
	 Country countryID;
	 String name;
	 String code;
	 Integer stateOrder;
	 int isActive;
	
	static mapping = {
		table 'State'
		version false
		id column: 'stateID'
	}
	
    static constraints = {
		code(nullable: true)
    }
}

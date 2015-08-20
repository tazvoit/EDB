package ecommerce


class Administrator {

	 //Integer administratorID;
	 String userName;
	 String password;
	 Date lastLogin;
	 int isActive;
	
	static mapping = {
		table 'Administrator'
		version false
		id column: 'administratorID', generator:'sequence', params:[sequence:'administratorID_SEQ']
	}
	
    static constraints = {
		lastLogin(nullable: true)
		
    }
}

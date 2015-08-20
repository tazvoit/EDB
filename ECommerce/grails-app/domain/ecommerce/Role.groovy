package ecommerce


class Role {
	
	 Integer roleID;
	 String code;
	 String name;
	 String description;
	
	static mapping = {
		table 'Role'
		version false
		id column: 'roleID'
	}
	
    static constraints = {
		name(nullable: true)
		description (nullable: true)
    }
}

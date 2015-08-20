package ecommerce


class Import {

	 Integer importID;
	 Administrator administratorID;
	 String userName;
	 Date created;
	 Date lastModified;
	 int isActive;
	
	static mapping = {
		table 'Import'
		version false
		id column: 'importID'
	}
	
    static constraints = {
		administratorID(nullable: true)
		userName(nullable: true)
		created(nullable: true)
		lastModified(nullable: true)
    }
}

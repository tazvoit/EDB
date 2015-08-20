package ecommerce


class Setting {

	 Integer settingID;
	 String code;
	 String name;
	 String description;
	 String type;
	 String valueType;
	 Integer integerValue;
	 String smallValue;
	 String mediumValue;
	 String textValue;
	
	static mapping = {
		table 'Setting'
		version false
		id column: 'settingID'
	}
	
	
    static constraints = {
		name (nullable: true)
		description (nullable: true)
		type (nullable: true)
		integerValue(nullable: true)
		smallValue (nullable: true)
		mediumValue (nullable: true)
		textValue(nullable: true)
		
    }
}

package ecommerce


class ProductSetting {

	 Integer productSettingID;
	 Product productID;
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
		table 'ProductSetting'
		version false
		id column: 'productSettingID'
	}
	
	
    static constraints = {
		name(nullable: true)
		description(nullable: true)
		type(nullable: true)
		integerValue(nullable: true)
		smallValue(nullable: true)
		mediumValue (nullable: true)
		textValue (nullable: true)
    }
}

package ecommerce


class SKU {
	 Integer skuID;
	 Product productID;
	 Attribute attributeID1;
	 Option optionID1;
	 Attribute attributeID2;
	 Option optionID2;
	 Attribute attributeID3;
	 Option optionID3;
	 Attribute attributeID4;
	 Option optionID4;
	 Attribute attributeID5;
	 Option optionID5;
	 String skuNumber;
	 int trackInventory;
	 Integer inventoryLevel;
	 String notes;
	 String skuName;
	 String skuMessage;
	 String extra1;
	 String extra2;
	 String extra3;
	
	
	static mapping = {
		table 'SKU'
		version false
		id column: 'skuID'
	}
	
	
    static constraints = {
		productID (nullable: true)
		attributeID1 (nullable: true)
		optionID1 (nullable: true)
		attributeID2  (nullable: true)
		optionID2  (nullable: true)
		attributeID3 (nullable: true)
		optionID3 (nullable: true)
		attributeID4 (nullable: true)
		optionID4 (nullable: true)
		attributeID5 (nullable: true)
		optionID5 (nullable: true)
		skuNumber (nullable: true)
		notes   (nullable: true)
		skuName  (nullable: true)
		skuMessage  (nullable: true)
		extra1 (nullable: true)
		extra2 (nullable: true)
		extra3  (nullable: true)
		
    }
}

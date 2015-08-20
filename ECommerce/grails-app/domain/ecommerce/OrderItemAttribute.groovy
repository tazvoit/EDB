package ecommerce


class OrderItemAttribute {

	 Integer orderItemAttributeID;
	 OrderItem orderItemID;
	 Double total;
	 Double weight;
	 String attributeValue;
	 Attribute attributeID;
	 String attributeCode;
	 String attributeName;
	 Double attributeUnitCost;
	 Double attributeUnitPrice;
	 Double attributeAltPrice;
	 Double attributeWeight;
	 String attributeImage;
	 Option optionID;
	 String optionCode;
	 String optionName;
	 Double optionUnitCost;
	 Double optionUnitPrice;
	 Double optionAltPrice;
	 Double optionWeight;
	 String optionImage;
	
	static mapping = {
		table 'OrderItemAttributes'
		version false
		id column: 'orderItemAttributeID'
	}
	
	
    static constraints = {
		total(nullable: true)
		weight(nullable: true)
		attributeName(nullable: true)
		attributeUnitCost(nullable: true)
		attributeUnitPrice(nullable: true)
		attributeAltPrice(nullable: true)
		attributeWeight(nullable: true)
		attributeImage (nullable: true)
		optionID (nullable: true)
		optionCode(nullable: true)
		optionName (nullable: true)
		optionUnitCost(nullable: true)
		optionUnitPrice(nullable: true)
		optionAltPrice(nullable: true)
		optionWeight(nullable: true)
		optionImage(nullable: true)
		
    }
}

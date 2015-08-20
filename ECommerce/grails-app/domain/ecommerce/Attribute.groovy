package ecommerce


class Attribute {
	
	 Integer attributeID;
	 String attributeCode; 
	 String attributeName;
	 String attributeDescription;
	 int attributeIsActive;
	 String attributeType;
	 Double attributeUnitCost;
	 Double attributeUnitPrice;
	 Double attributeAltPrice;
	 Double attributeWeight;
	 String attributeSmallImage;
	 String attributeLargeImage;
	 Integer defaultOptionID;
	 int attributeIsRequired;
	 Integer attributeOrder;
	
	static mapping = {
		table 'Attribute'
		version false
		id column: 'attributeID'
	}
	
    static constraints = {
		attributeName(nullable: true)
		attributeDescription(nullable: true)
		attributeUnitCost(nullable: true)  	
		attributeUnitPrice(nullable: true)  
		attributeAltPrice(nullable: true)  	
		attributeWeight(nullable: true)  	
		attributeSmallImage(nullable: true) 
		attributeLargeImage(nullable: true) 
		defaultOptionID(nullable: true) 
    }
}

package ecommerce


class Option {
	
	 Integer optionID;  	
	 Attribute attributeID;  	
	 String optionCode;  	
	 String optionName;  
	 String optionDescription;  
	 int optionIsActive;  
	 Double optionUnitCost;  	
	 Double optionUnitPrice;  	
	 Double optionAltPrice;  	
	 Double optionWeight;  	
	 String optionSmallImage;  
	 String optionLargeImage;  	
	 Integer optionOrder;  	
	

	static mapping = {
		table 'Opcion'
		version false
		id column: 'optionID'
	}
	
    static constraints = {
		optionName(nullable: true)
		optionDescription(nullable: true)
		optionUnitCost(nullable: true)
		optionUnitPrice(nullable: true)
		optionAltPrice(nullable: true)
		optionWeight(nullable: true)
		optionSmallImage(nullable: true)
		optionLargeImage(nullable: true)
    }
}

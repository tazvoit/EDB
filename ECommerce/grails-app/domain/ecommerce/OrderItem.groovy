package ecommerce


class OrderItem {

	 Integer orderItemID;  	
	 Order orderID;  
	 OrderDelivery orderDeliveryID;  
	 Double total;  
	 Double weight;  	
	 Integer quantity;  	
	 Product productID;  
	 String code;  	
	 String name;  	
	 int isActive;  	
	 Double unitCost;  	
	 Double unitPrice;  	
	 Double altPrice;  	
	 Double productWeight;  
	 int isTaxed;  
	 String image;  
	 String shortDescription;  	
	 String extra1;  	
	 String extra2;  
	 String extra3;  
	 String extra4;  	
	 String extra5;  
	 String decrementedSKUs;  
	
	static mapping = {
		table 'OrderItem'
		version false
		id column: 'orderItemID'
	}
	
	
    static constraints = {
		total (nullable: true)
		weight(nullable: true)
		name(nullable: true)
		unitCost (nullable: true)
		unitPrice (nullable: true)
		altPrice  (nullable: true)
		productWeight (nullable: true)
		image  (nullable: true)
		shortDescription (nullable: true)
		extra1 (nullable: true)
		extra2 (nullable: true)
		extra3 (nullable: true)
		extra4 (nullable: true)
		extra5 (nullable: true)
		decrementedSKUs (nullable: true)
    }
}

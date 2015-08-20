package ecommerce


class Product {

	 Integer productID;
	 String code;
	 String name;
	 String keywords;
	 String shortDescription;
	 String description;
	 int isActive;
	 Double unitCost;
	 Double unitPrice;
	 Double altPrice;
	 Double weight;
	 String header;
	 String footer;
	 int isTaxed;
	 String smallImage;
	 String mediumImage;
	 String largeImage;
	 String extra1;
	 String extra2;
	 String extra3;
	 String extra4;
	 String extra5;
	 Integer primaryCategoryID;
	 Integer productOrder;
	
	static mapping = {
		table 'Product'
		version false
		id column: 'productID'
	}
	
	
	
	
    static constraints = {
		name  	(nullable: true)
		keywords (nullable: true)
		shortDescription (nullable: true)
		description (nullable: true)
		unitCost (nullable: true)
		unitPrice (nullable: true)
		altPrice (nullable: true)
		weight(nullable: true)
		header(nullable: true)
		footer(nullable: true)
		smallImage (nullable: true)
		mediumImage(nullable: true)
		largeImage(nullable: true)
		extra1(nullable: true)
		extra2 (nullable: true)
		extra3 (nullable: true)
		extra4 (nullable: true)
		extra5 (nullable: true)
		primaryCategoryID(nullable: true)
    }
}

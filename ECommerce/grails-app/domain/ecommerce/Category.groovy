package ecommerce


class Category {

	 Integer categoryID; 
	 String code;
	 String name;
	 String keywords;  
	 String description;
	 int isActive; 	
	 Integer categoryTreeID;
	 String header;
	 String footer;
	 String smallImage;
	 String mediumImage;
	 String largeImage;
	 String extra1;
	 String extra2;
	 String extra3;
	 Integer parentCategory;
	 Integer categoryOrder;
	
	
	static mapping = {
		table 'Category'
		version false
		id column: 'categoryID'
	}
	
    static constraints = {
		name(nullable: true)
		keywords (nullable: true)
		description(nullable: true)
		header(nullable: true)
		footer(nullable: true)
		smallImage(nullable: true)
		mediumImage (nullable: true)
		largeImage  (nullable: true)
		extra1(nullable: true)
		extra2 (nullable: true)
		extra3 (nullable: true)
		parentCategory (nullable: true)
    }
}

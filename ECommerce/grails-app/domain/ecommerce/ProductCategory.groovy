package ecommerce


class ProductCategory {
	
	 Integer productCategoryID;
	 Category categoryID;
	 Product productID;
	 Integer productCategoryOrder;
	
	static mapping = {
		table 'ProductCategory'
		version false
		id column: 'productCategoryID'
	}
	
    static constraints = {
    }
}

package ecommerce


class RelatedProduct {

	 Integer relatedProductID;
	 Product parentProductID;
	 Product productID;
	 String relatedType;
	 Integer relatedProductOrder;
	
	static mapping = {
		table 'RelatedProduct'
		version false
		id column: 'relatedProductID'
	}
	
	
    static constraints = {
		relatedType(nullable: true)
		relatedProductOrder(nullable: true)
    }
}

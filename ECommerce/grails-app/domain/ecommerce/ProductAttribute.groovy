package ecommerce


class ProductAttribute {

	 Integer productAttributeID;
	 Product productID;
	 Attribute attributeID;
	 Integer productAttributeOrder;
	
	static mapping = {
		table 'ProductAttribute'
		version false
		id column: 'productAttributeID'
	}
	
    static constraints = {
		productAttributeOrder(nullable: true)
    }
}

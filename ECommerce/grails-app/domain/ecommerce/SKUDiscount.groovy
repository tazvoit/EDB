package ecommerce


class SKUDiscount {

	 Integer skuDiscountID  	
	 SKU skuID  
	 Discount discountID  	
	
	static mapping = {
		table 'SKUDiscount'
		version false
		id column: 'skuDiscountID'
	}
	
    static constraints = {
    }
}

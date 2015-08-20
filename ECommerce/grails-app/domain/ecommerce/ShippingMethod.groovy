package ecommerce


class ShippingMethod {

	 Integer shippingMethodID;
	 String code;
	 String name;
	 Double minimum;
	 Double base;
	 String methodType;
	 int isActive;
	
	static mapping = {
		table 'ShippingMethod'
		version false
		id column: 'shippingMethodID'
	}
	
	
	
    static constraints = {
		name(nullable: true)
    }
}

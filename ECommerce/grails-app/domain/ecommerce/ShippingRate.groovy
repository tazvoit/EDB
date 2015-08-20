package ecommerce


class ShippingRate {

	 Integer shippingRateID;
	 ShippingMethod shippingMethodID;
	 Double floor;
	 Double ceiling;
	 Double amount;
	 int isActive;
	
	static mapping = {
		table 'ShippingRate'
		version false
		id column: 'shippingRateID'
	}
	
    static constraints = {
    }
}

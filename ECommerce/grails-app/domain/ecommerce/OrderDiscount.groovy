package ecommerce


class OrderDiscount {

	 Integer orderDiscountID;
	 Order orderID;
	 OrderItem orderItemID;
	 Double total;
	 Discount discountID;
	 String code;
	 String  name;
	 String  usersAppliesType;
	 String  usersAppliesValue;
	 String  itemsAppliesType;
	 String  itemsAppliesValue;
	 String  rewardType;
	 Double  reward;
	 String couponCode;
	 Double floor;
	 Double  ceiling;
	 String  extra1;
	 String  extra2;
	 String  extra3;
	
	static mapping = {
		table 'OrderDiscount'
		version false
		id column: 'orderDiscountID'
	}
	
	
    static constraints = {
		orderItemID(nullable: true)
		total(nullable: true)
		name (nullable: true)
		usersAppliesType(nullable: true)
		usersAppliesValue (nullable: true)
		itemsAppliesType (nullable: true)
		itemsAppliesValue (nullable: true)
		rewardType  (nullable: true)
		reward (nullable: true)
		couponCode (nullable: true)
		floor(nullable: true)
		ceiling (nullable: true)
		extra1 (nullable: true)
		extra2 (nullable: true)
		extra3 (nullable: true)
    }
}

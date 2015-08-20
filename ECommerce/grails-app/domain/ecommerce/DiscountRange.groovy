package ecommerce


class DiscountRange {

	 Integer discountRangeID;
	 Discount discountID;
	 Double floor;
	 Double ceiling;
	 String rewardType;
	 Double reward;
	 int isActive;
	
	static mapping = {
		table 'DiscountRange'
		version false
		id column: 'discountRangeID'
	}
	
	
    static constraints = {
		rewardType(nullable: true)
    }
}

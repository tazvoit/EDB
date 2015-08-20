package ecommerce


class Discount {

	 Integer discountID;
	 String  code;
	 String  name;
	 String  description;
	 int isActive;
	 String  usersAppliesType;
	 String  usersAppliesValue;
	 String  itemsAppliesType;
	 String  itemsAppliesValue;
	 String  rewardType;
	 Double  reward;
	 String  couponCode;
	 Date  startDate;
	 Date  expirationDate;
	 Integer  timesUsed;
	 Integer  maxTimesUsed;
	 int  isTimesPerCustomer;
	 Integer  discountOrder;
	 String  extra1;
	 String  extra2;
	 String  extra3;
	
	static mapping = {
		table 'Discount'
		version false
		id column: 'discountID'
	}
	
	
    static constraints = {
		name(nullable: true)
		description(nullable: true)
		usersAppliesType(nullable: true)
		usersAppliesValue(nullable: true)
		itemsAppliesType(nullable: true)
		itemsAppliesValue(nullable: true)
		rewardType(nullable: true)
		reward(nullable: true)
		couponCode(nullable: true)
		startDate(nullable: true)
		expirationDate(nullable: true)
		timesUsed(nullable: true)
		maxTimesUsed(nullable: true)
		extra1(nullable: true)
		extra2(nullable: true)
		extra3(nullable: true)
    }
}

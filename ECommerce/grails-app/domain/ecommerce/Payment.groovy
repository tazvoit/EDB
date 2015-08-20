package ecommerce


class Payment {

	 Integer paymentID;
	 String status;
	 Order orderID;
	 String processorClassName;
	 String valueFieldLabels;
	 String creditCardName;
	 String creditCardType;
	 String creditCardDate;
	 String creditCardNumber;
	 String creditCardNumberDisplay;
	 String value1;
	 String value2;
	 String value3;
	 String value4;
	 String value5;
	 String value6;
	 String value7;
	 String value8;
	 String value9;
	
	static mapping = {
		table 'Payment'
		version false
		id column: 'paymentID'
	}
	
	
    static constraints = {
		status (nullable: true)
		processorClassName (nullable: true)
		valueFieldLabels (nullable: true)
		creditCardName(nullable: true)
		creditCardType (nullable: true)
		creditCardDate (nullable: true)
		creditCardNumber (nullable: true)
		creditCardNumberDisplay (nullable: true)
		value1 (nullable: true)
		value2 (nullable: true)
		value3 (nullable: true)
		value4 (nullable: true)
		value5 (nullable: true)
		value6 (nullable: true)
		value7 (nullable: true)
		value8 (nullable: true)
		value9 (nullable: true)
    }
}

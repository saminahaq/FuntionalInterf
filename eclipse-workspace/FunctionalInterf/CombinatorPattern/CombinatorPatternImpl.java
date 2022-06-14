import java.time.LocalDate;





public class CombinatorPatternImpl {
	
	public static void main(String[] args) {
		
	
	Customers custsValid = new Customers(
									"Alex", 
									"alex@google.com", 
									"0721345897",
									LocalDate.of(1999, 1, 1));
	
	Customers custsInValid = new Customers(
										"Alex", 
										"alex google.com", 
										"0721345897",
										LocalDate.of(2015, 1, 1));
	
	// System.out.println(new CustomerValidetorService().isValid(custsValid));
	// System.out.println(new CustomerValidetorService().isValid(custsInValid));
	
	 //if valid we can store customer in db

	/*
	 * Using combinator Pattern
	 */
	
	 CustomerRegisterationValidator.ValidationResult result =
			 	  CustomerRegisterationValidator.isEmailValid()
			 .and(CustomerRegisterationValidator.isPhoneNumberValid())
			 .and(CustomerRegisterationValidator.isAdult())
			 .apply(custsValid);
	// .apply(custsInValid); //Checking for wrong customer
	 
	 
	 System.out.println(result);
	 
	 if(result != CustomerRegisterationValidator.ValidationResult.SUCCESS)
	 {
		 throw new IllegalStateException(result.name());
	 }
	 
	}
}

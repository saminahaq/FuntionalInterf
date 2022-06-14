import java.time.LocalDate;
import java.time.Period;

public class CustomerValidetorService {

	
	
	private boolean isemailValid(String email) {
		// TODO Auto-generated method stub
		return email.contains("@");
	}
	
	private boolean isPhonenumberValid(String phoneNumber) {
		// TODO Auto-generated method stub
		return phoneNumber.startsWith("07");
	}
	
	private boolean isAdult(LocalDate dob) {
		// TODO Auto-generated method stub
		return Period.between(dob, LocalDate.now()).getYears() > 16;
	}
	
	public boolean isValid(Customers cust) {
						return isemailValid(cust.getEmail()) && 
							   isAdult(cust.getDob()) && 
							   isPhonenumberValid(cust.getPhoneNumber());

	}
	
	/*for each validity, like validity of name, validity of phone Number and email etc
	 * if you do separate function for every validation than its lots of work so here, create Interface  "CustomerRegisterationValidator" 
	 */
	
	
}

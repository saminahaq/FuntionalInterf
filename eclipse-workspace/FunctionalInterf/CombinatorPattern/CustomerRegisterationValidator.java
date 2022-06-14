import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public interface CustomerRegisterationValidator extends 
								Function<Customers ,CustomerRegisterationValidator.ValidationResult>{
	

	//Magic method
	static CustomerRegisterationValidator isEmailValid() {
		return t -> { 
			System.out.println("Email validation running"); 
			return  t.getEmail().contains("@") ? ValidationResult.SUCCESS: ValidationResult.EMAIL_NOT_VALID; 
			};
	} 
	
	static CustomerRegisterationValidator isPhoneNumberValid() {
		return t -> { 
			System.out.println("Phone Number validation running"); 
		    return t.getPhoneNumber().startsWith("07") ? ValidationResult.SUCCESS : ValidationResult.PHONE_NUMBER_NOT_VALID;};
	}
	
	static CustomerRegisterationValidator isAdult() {
		return t -> { 
			System.out.println("Age validation running"); 
		    return Period.between(t.getDob(), LocalDate.now()).getYears() > 16 ? ValidationResult.SUCCESS : ValidationResult.IS_NOT_ADULT;};
	}
 
	//Magic happened here
	
	default CustomerRegisterationValidator and (CustomerRegisterationValidator other) {
		return t -> {
			ValidationResult result = this.apply(t);
			return result.equals(ValidationResult.class) ? other.apply(t): result;
		};
	}
	public enum ValidationResult {
	
			SUCCESS,
			PHONE_NUMBER_NOT_VALID,
			EMAIL_NOT_VALID,
			IS_NOT_ADULT
		}

	
}

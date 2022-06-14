import java.util.function.Predicate;

public class _Predicate {
	
	public static void main(String[] args) {
		System.out.println("Predicate lessen start here !!!!");
		//Traditional Way
		System.out.println(isPhonenumberValid("0700000"));
		
		//Simple Predicate
		System.out.println(validPhoneNumPredicate.test("0700000"));
		
		//Multiple Predicates test here with .and
		System.out.println(validPhoneNumPredicate.and(containNumber).test("0730000"));
		
		//Multiple Predicates test here with .or
		System.out.println(validPhoneNumPredicate.or(containNumber).test("0700000"));
		
	}

	
	//Traditional ways
	static boolean isPhonenumberValid(String phoneNum) {
		
		return phoneNum.startsWith("07") && phoneNum.length() == 7;
	}
	
	//Predicate 
	static Predicate<String> validPhoneNumPredicate = t ->
														(t.startsWith("07") &&
														t.length() == 7);
	static Predicate<String> containNumber = t ->
												t.contains("3");
	
	
	
}

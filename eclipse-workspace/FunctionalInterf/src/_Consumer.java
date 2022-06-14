import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
	
	//Consumer: functional type consumer interface 
	/*
	 * functional type consumer interface intended to accept input, but not return a
	 * value
	 */
	


	public static void main(String[] args) {
		System.out.println("Consumer Start here !!!");
		
		Customer cust =new Customer("Samina", "999-999-99999");
		//greetCustomerConsumer.accept(cust);
		phoneNumberProvided.accept(cust,true);
		phoneNumberProvided.accept(cust,false);
	
	}
	
	 
	//Consumer Function
	
	static Consumer<Customer> greetCustomerConsumer = t -> 
														System.out.println("welcome "+ t.customerName +" thank you "
														+ "for providing Phone number : "+ t.customerPhoneNumber);

														
	//BiConsumer Function
	static BiConsumer<Customer, Boolean> phoneNumberProvided = (t, u) -> System.out.println(
																t.customerName + "  number provided :" +
																(u ? t.customerPhoneNumber : "***************")); 




}


public class Customer {

	
	public String customerName;
	public String customerPhoneNumber;
	
	
	public Customer(String customerName, String customerPhoneNumber) {
		
		this.customerName = customerName;
		this.customerPhoneNumber = customerPhoneNumber;
	}


	@Override
	public String toString() {
		return "Welcome _Consumer [customerName=" + customerName + 
				 ", customerPhoneNumber=" + customerPhoneNumber + "]";
	}
	
	
	
	
	
}

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		
		System.out.println("Supplier learning start here !!!");
		//traditional way
		System.out.println(getDBConnectionURL());
		
		//supplier used .get()
		System.out.println(getDBConnectionURLSupplier.get());
		
		System.out.println(getListofTables.get() );
		
		
		
	}
	//traditional way
	static String getDBConnectionURL() {
		return "jdbc://localHost:7643/Users";
	}
	
	//Supplier
	static Supplier<String> getDBConnectionURLSupplier =() -> "jdbc://localHost:7643/Users" ; 
	
	//Supplier nested list method 

	static Supplier<List<String>> getListofTables = () -> List.of("jdbc://localHost:7643/Users",
																  "jdbc://localHost:7643/Csutomer",
																  "jdbc://localHost:7643/Products"); 
	
	
}

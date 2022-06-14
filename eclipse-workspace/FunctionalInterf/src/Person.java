import java.util.List;

public class Person {
	
	

	public final String name;
	public   final Gender gender ;
	
	public enum Gender {
		FEMALE, MALE
	}
	
	 public Person(String name, Person.Gender gender) {
		
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	 
	
	
}

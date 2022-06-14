import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;



public class FunctionalInetImpl {
 	
	private static Person.Gender FEMALE;
	private static Person.Gender MALE;

	public static void main(String[] args) {
		
		List<Person> people = List.of(
				new Person("samina",Person.Gender.FEMALE),
				new Person("sam",Person.Gender.FEMALE),
				new Person("sami",Person.Gender.FEMALE),
				new Person("Biden",Person.Gender.MALE));

		//imperative Approach
	/*	 List<Person> females = new ArrayList<>();
		 
		 for (Person person : people) {
		 if(Person.Gender.FEMALE.equals(person.gender))
				 females.add(person);
		}
		 
		 for (Person per : females) {
			System.out.println(per);
		} */
	
		//Declarative Approach [Stream]
		 
		 people.stream()
		 		.filter(t -> Person.Gender.FEMALE.equals(t.gender ))
		 		.collect(Collectors.toList())
		 		.forEach(System.out::println);
		 
		 
		 //with map used Set
		 people.stream()
		 		.map(t -> t.gender)
		 		.collect(Collectors.toSet())
		 		.forEach(System.out::println);
		 
		 people.stream()
		 		.map(t -> t.name)
		 		.collect(Collectors.toSet())
		 		.forEach(System.out::println);
		 
		 people.stream()
	 		.map(t -> t.name)
	 		.mapToInt(String::length)
	 		.forEach(System.out::println);
		 
		 
		 //Extract filter into the local variable, through  Refactor --> Extract variable option on right click
		 
		 Function<Person, String> namefilter = t -> t.name;
		 ToIntFunction<String> computeLength =String::length;
		 IntConsumer display = System.out::println;
		 people.stream() 
	 		.map(namefilter)
	 		.mapToInt(computeLength)
	 		.forEach(display);
		 
	}
}

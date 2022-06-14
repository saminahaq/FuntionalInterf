import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
	
	//Functional programming most popular usage is Stream and optional
	
	public static void main(String[] args) {
		
		//Traditional Programming
		//System.out.println("Functional Programming Start !!!  "+numIncTraditional(2));
		
		//Simple Functional Function calling
		System.out.println("Functional Programming Start !!!  "+ numIncFunctional.apply(5));
		
		//Combining two functions 
		
		/*, assigning also in Functional type not int 
		 * e.g not line that [int num =numIncFunctional.andThen(multiplyFucntion);] 
		 */
		
		//one Parameters: same integer inc and than multiply
		Function<Integer, Integer>  multiandinc = numIncFunctional.andThen(multiplyFucntion);
		System.out.println(multiandinc.apply(10));
		 
		//BiFunction
		
		System.out.println(incandmultiply.apply(5, 10));
		
	}
	
	
	//Traditional Programming
		static int numIncTraditional(int num) {
			
			return num +1;
		}
	
	//Functional Programming
	/*
	 * Function<inPut, outPut>
	 * T:inPut
	 * R:OutPut
	 * and for callining used "apply()"
	 * numIncFunctional.apply(2)
	 * shoud be static if outside of main fun
	 */
	//simple Function
		static  Function<Integer,Integer> numIncFunctional = t -> (t+1) ; 
	
		static Function<Integer, Integer> multiplyFucntion = t -> t*10 ; 
		
	//BiFunction :Two parameters : one int inc and multiply by second int
		
		static	BiFunction<Integer, Integer, Integer> incandmultiply =(t, u) -> (t+1) * u; 
	
}

























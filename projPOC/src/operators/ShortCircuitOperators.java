package operators;

public class ShortCircuitOperators {

	public static void main(String[] args) {

		boolean x = true, y = false;

		// to improve performance rather than &, | we can use &&, || for boolean types only
		
		if (x && y) {
			System.out.println("Inside if");
		} 
		
		if (x || y) {
			System.out.println("Inside 2nd if");
		}

	}

}

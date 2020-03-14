package wrapperClasses;

public class PrimitiveAndObjects {
	
	public static void main(String[] args) {

		// Primitive to Object - Boxing
		int i = 100;
		Integer y = Integer.valueOf(i);
		System.out.println(y);
		
		// Object to Primitive - unboxing
		
		Integer j = 200;
		int z = j.intValue();
//		int z = i.intValue();
		System.out.println(z);
	}

}

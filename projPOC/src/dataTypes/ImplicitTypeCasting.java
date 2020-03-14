package dataTypes;

public class ImplicitTypeCasting {

	public static void main(String[] args) {

		byte b = 100;
		int i = b;
		System.out.println(i);

		/*
		 * Not possible - type mismatch
		 * 
		 * long a = 100; int b =a;
		 */

		char a = 'A';
		int j = a;
		System.out.println(j);

	}

}

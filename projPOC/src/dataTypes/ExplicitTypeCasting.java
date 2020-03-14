package dataTypes;

public class ExplicitTypeCasting {

	public static void main(String[] args) {

		int i =127;
		byte b = (byte) i;
		System.out.println(b);
		
		char ch = (char) i;
		System.out.println(ch);
		
		
		int c = 500;
		byte j = (byte) c;
		char ch1 = (char) j;
		System.out.println(j);
		System.out.println(ch1);
	}

}

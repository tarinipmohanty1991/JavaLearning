package operators;

public class StringConcatenation {

	public static void main(String[] args) {

		String s1= "abc";
		String s2= "xyz";
		
		System.out.println(s1+s2);
		
		int a=10,b=20,c=30;
		System.out.println(a+b+c);
		
		System.out.println(s1+a+b+c);
		System.out.println(a+b+s1+c);
	}

}

package accessModifiers2;

import accessModifiers.A;

public class C extends A {

	public static void main(String[] args) {

		A obj = new A();
		System.out.println(obj.d);
		
		C obj1 = new C();
		System.out.println(obj1.c);
		
	}

}

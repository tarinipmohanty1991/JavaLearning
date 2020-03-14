package wrapperClasses;

public class WrapUpWarapperAllInOne {

	public static void main(String[] args) {

		
		int x =100;
		String y = Integer.toString(x);
		Integer z = new Integer(y);
		int a = z.intValue();
		System.out.println(a);

		Integer c = new Integer(z);
		String d = c.toString();
		
		int e = Integer.parseInt(d);
		System.out.println(e);
	}

}

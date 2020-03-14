package staticNonstatic;

public class ThisKeywordDemo {

	int x;
	int y;
	
	ThisKeywordDemo() {
		System.out.println(this);
		System.out.println(this.x);
		System.out.println(this.y);
		this.methodOne();
	}
	
	public static void main (String[] args) {
		
		new ThisKeywordDemo();
//		new ThisKeywordDemo();
	}
	
	void methodOne() {
		System.out.println("Non static method");
	}
}

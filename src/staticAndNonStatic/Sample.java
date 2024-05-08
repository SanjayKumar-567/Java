package staticAndNonStatic;

public class Sample {
	
	
	static char ch = 'p';
	static double d = 1.0;
	static int val = 10;
	static void disp() {
		System.out.println("executing code disp");
	}
	
	static void test() {
		System.out.println("executing  test code");
	}
	public static void main(String[] args) {
		
		
		System.out.println(Sample.ch);
		System.out.println(Sample.d);
		System.out.println(Sample.val);
		Sample.disp();
		Sample.test();
	}

}

package staticAndNonStatic;

public class Demo {
static int val = 10;
static void test() {
	System.out.println("executing code");
}
 
	public static void main(String[] args) {
		System.out.println(Demo.val);
Demo.test();
	}

}

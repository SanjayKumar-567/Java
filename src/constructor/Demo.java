package constructor;

public class Demo {//defult construtors

	int a ;
	int b;
	char ch ;
	double d;
	boolean flag ;
	void test() {
		System.out.println("executing........");
	}
	
	
	
	public static void main(String[] args) {
		Demo ref = new Demo();
		System.out.println(ref.a);
		System.out.println(ref.b);
		System.out.println(ref.ch);
		System.out.println(ref.d);
		System.out.println(ref.flag);
		ref.test();
	}

}

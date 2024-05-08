package staticAndNonStatic;

public class Alpha {//any method or variable that is directly created in a class body is called member.

	char ch = 's';
	 double d = 7.0;
	 int val = 11;
	 void disp() {//disp is a method 
		System.out.println("executing disp code ");
	}
	
	 void test() {
		System.out.println("executing  test code");
	}
	
		
		


	public static void main(String[] args) {
		Alpha al = new Alpha();//creting a object to axcess non static members
		System.out.println(al.ch);
		System.out.println(al.d);
		System.out.println(al.val);
		al.disp();
		al.test();
	}
	

}

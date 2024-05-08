package lorgicalPrograms;

public class Program1 {//intertance is the concept of one class acuring the members of another class

	public static void main(String[] args) {
		sample ref = new sample();
		ref.test();
		ref.demo();	
	}
}
	
	class demo{//child can ac
	
	void test() {
		System.out.println("executing test");
	}
	}  
	
	class sample extends demo
	{
	void demo() {
		System.out.println("executing demo");
	}
	
	}
	

package oops;

public class Demo {
	void test(int a,String str) {
		System.out.println("functional testing");
		
	}
       void test(String str,int a) {
    	   System.out.println("non-functional testing");
   		
         	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.test(7, "dhoni");
		d.test("sanjay", 11);

	}

}

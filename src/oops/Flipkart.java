package oops;

public class Flipkart {
		
	void payment(){
		System.out.println("cod");
	}

	void payment(long card){
		System.out.println("card transation");
	}

	void payment(String upi){
		System.out.println("upi");
	}

	void payment(String bank,long mobile){
		System.out.println("net banking");//type of arg overloading
	}

	 public static void main (String []args)
		{
		Flipkart fk=new Flipkart();
		fk.payment();
		fk.payment(1234567890);
		fk.payment("gpay");
		fk.payment("cub", 97909485);
		}


}

package constructor;

public class Product {//parameterized constructor
	int pid;
	double price;
	Product(int arg1,double arg2)
	{
		pid =arg1;
	price = arg2;
		
	}

	public static void main(String[] args) {
	
Product p1 = new Product(99,999.99);
System.out.println(p1.pid);
System.out.println(p1.price);

Product p2 = new Product(98,888.88);
System.out.println(p2.pid);
System.out.println(p2.price);
	}

}

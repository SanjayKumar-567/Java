package constructor;

public class Square {//parameterized constructor
	int side;
	void draw() {
		
	}
	 Square(int arg){
		 
		 side = arg;
		 
	 }

	public static void main(String[] args) {
		 Square s1 = new  Square(10);
		 System.out.println(s1.side);
		 
		 Square s2 = new  Square(20);
		 System.out.println(s2.side);
		 
		 Square s3 = new  Square(30);
		 System.out.println(s3.side);
		 
		 Square s4 = new  Square(40);
		 System.out.println(s4.side);
		 
		 
		
	}

}

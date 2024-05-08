package oops;

public class child extends parent
{
	
	void wife(){
		System.out.println("married a girl");
		
	}void wifeproperty() {
		System.out.println("house,caar,land");
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p = new parent();
		p.car();
		p.house();
		System.out.println("child can axcess parent property but parent cannot axcess child propers");
		child c = new child();
		c.car();
		c.house();
		c.wife();
		c.wifeproperty();
		
		

	}


}

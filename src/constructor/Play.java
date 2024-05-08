package constructor;

public class Play {//zero argument constructor
	int a ;
	int b;
	String str;
	double d ;
	
	void disp() {
		System.out.println("executing disp........");
	}
	 Play(){
		System.out.println("Play() is a constructor");
		b=11;
		str="chennai";
		d=19.97;
		
	}
	public static void main(String[] args) {
		Play p= new Play(); 
		System.out.println(p.a);
		System.out.println(p.b);
		System.out.println(p.str);
		System.out.println(p.d);
		p.disp();

	}

}

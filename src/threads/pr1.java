package threads;



class Demothread extends Thread
{
	@Override
	public void run()
	{
		for(int i =0;i<5;i++)
			System.out.println("Demothread");
	}
}
public class pr1 {//using extend thread class 

	public static void main(String[] args) {
		System.out.println("start program");
		Demothread dt = new Demothread();
		dt.start();
		for(int i =0;i<5;i++)
			System.out.println("main thread....");
		System.out.println("program end");
		
	
	}

}

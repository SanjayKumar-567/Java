
package threads;
class  Samplethread implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<5;i++)
			System.out.println("sample thread");
	}
	
} 

public class pr2 {//create using implement runnable interface

	public static void main(String[] args) {
		System.out.println("start program");
		Samplethread  st= new Samplethread ();
		Thread th = new Thread(st);
		th.start();
		for(int i =0;i<5;i++)
			System.out.println("main thread");
		System.out.println("end program");
	}

}

package lorgicalPrograms;

public class Bic {

	public static void main(String[] args) {
		int dec = 4;//
		String bin ="";
		while(dec>0)
		{
			int rem = dec%2;
			bin=rem+bin;
			dec= dec/2;
		}
		
System.out.println(bin);
	}

}

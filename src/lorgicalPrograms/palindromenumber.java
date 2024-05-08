package lorgicalPrograms;

public class palindromenumber {
	public static void main (String[] args) {
		int num =12321;
		int rev = 0;
		int copy= num;
	//	boolean flag =true;
		while(num>0)
		{
			//int t =num%10;
			rev = (rev*10)+ num%10;
			num=num/10;
		}
		if(copy==rev)
			
		{
			System.out.println("palindrom");
		}
		else {
			
			System.out.println("not a palindrom");
		}
	}

}

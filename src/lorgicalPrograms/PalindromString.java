package lorgicalPrograms;

public class PalindromString {

	public static void main(String[] args) {
		String str="madam";
		String rev ="";
		char c1 [] =str.toCharArray();
		for(int i=c1.length-1;i>=0;i--)
		{
			rev = rev+ c1[i];
		}
		System.out.println(rev );

		if(str.equals(rev))
		{
		System.out.println("palindrone");
		}
		else {
			
			System.out.println("not a palindrone");

		}
	}

}

package String;

public class smetods {
	

	public static void main(String[] args) {
		String str = "computer";
System.out.println("charAt() method");
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(7));
		System.out.println("length() method");

		String str1 = "sanjay";
		System.out.println(str.length());
		System.out.println(str1.length());
		System.out.println("tocharArray() method");

		char[] ch = str.toCharArray();
		for(int i =0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
		System.out.println("indexof() method");
		System.out.println(str.indexOf('p'));
		System.out.println(str1.indexOf('a'));


	}
}

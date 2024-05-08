package lorgicalPrograms;

public class ReverseString {

	public static void main(String[] args) {
String str =" madam";
String rev ="";
char c1[]= str.toCharArray(); //to char array create an equialent charater array for the current string
for(int i=c1.length-1;i>0;i--) {
	rev= rev+c1[i];
}
System.out.println(rev);
			
		
		}
	}

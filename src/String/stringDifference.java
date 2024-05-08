package String;

public class stringDifference {
	
	public static void main(String[] args) {
		
		//String
		System.out.println("string is immutable");
		String s1 = new String("sk");
		String s2 ="dhoni";
		System.out.println(s1);
		System.out.println(s2);
		String name = "sanjay";
		System.out.println("Appending a name to orginal"+name.concat("kumar"));
		
		System.out.println("orignial name :"+name);
		System.out.println("*********************************************************");
		
		
		//stringbuffer
		System.out.println("stringbuffer is mutable");
		//StringBuffer str ="dummy"; we cannot create without newkey
		StringBuffer name1 = new StringBuffer("sanjay");
		System.out.println("orignial name :"+name1);
		System.out.println("Appending a name to orginal"+name1.append(" kumar "));
		
		System.out.println("orignial name :"+name1);
		System.out.println(	name1.append('p'));
		System.out.println("Appending a name to orignial name :"+name1);
		System.out.println("orignial name :"+name1);
		
		System.out.println("*********************************************************");

		//inbuild methods in StringBuffer
		//Reverse
		System.out.println("Reversed name :"+name1.reverse());
		//replace
		StringBuffer replacethis = new StringBuffer("sukuram");//it is considering the last index
		System.out.println(replacethis.replace(0, 3, "bala"));
		//delete
		StringBuffer delete = new StringBuffer("balasukuram");
		System.out.println(delete.delete(0, 3));
		//insert
		StringBuffer insert = new StringBuffer("moni");
		System.out.println(insert.insert(4, "sha"));
		//capacity
		System.out.println(insert.capacity());
		System.out.println("*********************************************************");

		
		//inbuild methods are same for stringbuffer and stringbuilder
		
		

		
		

		

		

		


		

		

	}
	
	

}

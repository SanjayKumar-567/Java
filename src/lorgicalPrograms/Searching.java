package lorgicalPrograms;

public class Searching {

	public static void main(String[] args) {
		int[]arr= {13,36,21,25,31};
		int key=25;
		int i = 0;
		//for( i=0;i<arr.length;i++)
		while(i<arr.length)
		{
			if(key ==arr[i])
			{
				System.out.println(key+" "  +"key is found");
			break;
			}
			i++;
		}
			
		if(i ==arr.length)
				System.out.println("key not found");

	

}
}

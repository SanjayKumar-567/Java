package pattenPrograms;

public class Pyramid {

	public static void main(String[] args) {
		int n=5;
		int space =n-1;
		int star=1;
		 
		for(int i=0;i<n;i++)//outerloop row
		{
			for(int j=0;j<space;j++) //space loop
			
			{
				
			System.out.print(" "+" ");
				
			}
			for(int k = 0;k<star;k++)//to print star loop
			{
				System.out.print("*"+" ");

			}
			
			System.out.println();
			space--;
			star=star+2;
			
		}

	

	}

}

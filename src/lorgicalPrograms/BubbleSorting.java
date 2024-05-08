package lorgicalPrograms;

public class BubbleSorting {

//	private static int temp;
//
	public static void main(String[] args) 
	{               //0  1  2   3   4   5
		int[] arr = { 13,17,14, 16, 15, 12 };                                        
		System.out.println("before sorting");      
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
				for (int i = 0; i < arr.length; i++)
				{
			for (int j =i+1; j < arr.length; j++) {
				

				if (arr[i] <arr[j]) {
					{    
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					}  

				}

			}

		}

		System.out.println("after sorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
			}

}

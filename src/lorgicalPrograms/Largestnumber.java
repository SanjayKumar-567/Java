package lorgicalPrograms;

public class Largestnumber {

	public static void main(String[] args) {
	int[]arr= {13,12,15,14,16,11};
	int large = arr[0];
	for(int i=1;i <arr.length;i++)//
	{
		if(arr[i]>large)
			large=arr[i];
	}
System.out.println("largest element in the arry is "+large);
	}

}

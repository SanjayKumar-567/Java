package lorgicalPrograms;

public class Even {

	public static void main(String[] args) {
		int start = 1;
		int end = 10;
		while (start <= end) {
			if (start % 2 == 0)// if start is divide by its a even num
			{
				System.out.println(start);
			

			}
			start++;//start++ shod be inside while loop
		}
	}

}

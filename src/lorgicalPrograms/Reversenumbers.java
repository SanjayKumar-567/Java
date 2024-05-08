package lorgicalPrograms;

public class Reversenumbers {

	public static void main(String[] args) {
		int num = 1234;
		int rem = 0;
		// int i=0;
		// for(i=0;num>i;i++)
		while (num > 0) {
			rem = (rem * 10) + num % 10;
			num = num / 10;
		}
		System.out.println(rem);

	}
}

package lorgicalPrograms;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 18;
		int a = 2;
		while (a <= num / 2) {
			if (num % 2 == 0) {
				break;

			}
			a++;

		}
		if (a >= num / 2)
			System.out.println("prime number");
		else
			System.out.println("not a prime");

	}
}	
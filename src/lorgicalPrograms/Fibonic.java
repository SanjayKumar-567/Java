package lorgicalPrograms;

public class Fibonic {

	public static void main(String[] args)

	{
		int num = 5;
		int fifi1 = 0;// 1,1
		int fifi2 = 1;// 1,
		int fifi3 = fifi1 + fifi2;// 1,
		while (num > 0) {
			System.out.println(fifi1);
			fifi1 = fifi2;
			fifi2 = fifi3;
			fifi3 = fifi1 + fifi2;
			num--;

		}
	}

}

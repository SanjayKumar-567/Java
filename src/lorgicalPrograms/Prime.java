package lorgicalPrograms;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		while (start < end) {
			int count = 0;
			int num = start;
			for (int i = 1; i < end; i++) {
				if (num%i==0)
				{
					count++;
				}
				
				
			}
			if(count%2==0)
			{
				System.out.println(num);
			}
			start++;
		}
	}//wrong program
	
}
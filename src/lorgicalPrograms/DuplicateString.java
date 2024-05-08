package lorgicalPrograms;

public class DuplicateString {

	public static void main(String[] args) {
		String[] str = { "sanjay","kumar","javaa"};
		
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if(str[i]==str[j])
					System.out.println("duplicate characters are:"+str[j] );	
				
			}
			
		}
		
	}

}

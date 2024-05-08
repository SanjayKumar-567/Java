package exceptionHandling;

class InvalidnumberException extends Exception{
	
}

public class pr1 {

	 static void verifiynumber(String mobile) throws InvalidnumberException {
		
if(mobile.length()!=10)
	throw new  InvalidnumberException ();
	else 
		System.out.println("valid number");
	}


public static void main(String[] args) {
	
	try {
		verifiynumber("97909485");
		//verifiynumber("97909485");
	}
	catch(InvalidnumberException e)
	{
	System.err.print("invalid number");
}
}
}
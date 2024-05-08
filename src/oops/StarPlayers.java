package oops;

import encapsulation.Allstars;

public class StarPlayers extends Allstars {

	public static void main(String[] args) {
		System.out.println(Allstars.d);//public can be axcessed anywhere live different packages and classes without inhertance 
		System.out.println(Allstars.c);//protected  can be axcessed anywhere live different packages and classes with the help of  inhertance 
		//System.out.println(Allstars.b); defult  cannot axcess private and can be axcessed only with in the class
	//	System.out.println(Allstars.a); private cannot axcess defult/packages and can be axcessed only with in the packages 
	}

}

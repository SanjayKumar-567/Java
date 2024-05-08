package collections;

public class LinkedList {

	public static void main(String[] args) {//linkedlist is suit for insertion and delertion not surit for retieving the data
		// TODO Auto-generated method stub
		
		java.util.List l1 = new java.util.LinkedList();//getfirst,getlast,pool
	      l1.add("sanjay");//Adding object in arraylist not working   
	      l1.add("kumar");    
	      l1.add("11");    
	      l1.add("1997");  
	      l1.add("sanjay");// 
	      System.out.println("LinkedList"+l1);

	      l1.add('p');
	      System.out.println(l1);
	      System.out.println(l1.get(1));
		    System.out.println(l1.indexOf("sanjay"));
		    System.out.println(l1.lastIndexOf("sanjay"));
		    System.out.println(l1.indexOf("sanjaykumar"));
		   System.out.println("remove index"+l1.remove(5));
		   
		  // l1.pool/\
		   //dowanload eclipse photon
		   
		   
		   

	}

}

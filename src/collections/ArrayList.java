package collections;

import java.util.*;  



public class ArrayList {
	

	public static void main(String[] args)
	{
		java.util.List list = new java.util.ArrayList();	//Creating arraylist 
		//LinkedList list = new LinkedList();
	      list.add("sanjay");//Adding object in arraylist    
	      list.add("kumar");    
	      list.add("11");    
	      list.add("1997");  
	      list.add("sanjay")// arraylist accept duplicates
;	      
	      System.out.println(list);//Printing the arraylist object    
	    System.out.println("2nd index present in the array is "+list.get(2));//return the value present in the 2nd index
	    System.out.println(list.indexOf("sanjay"));
	    System.out.println(list.lastIndexOf("sanjay"));
	    System.out.println(list.indexOf("sanjaykumar"));

		System.out.println(list.remove("removed"+"sanjay"));
	    System.out.println(list.size());// display the number of elements in the array
          System.out.println(list.isEmpty());//this will check in the array and return true or false
          System.out.println("--------------------------------------------------------------");
          
	    java.util.List list2 = new java.util.ArrayList();	// again Creating arraylist
			list2.add("dhoni");
			list2.add(07);
		    System.out.println(list2);
		    
		    
		    list.addAll(list2);
		    System.out.println(list);
		    System.out.println(list2);
		  //  list2.clear();//this will clear all the elements in the array 
		   // System.out.println(list2);
		    
		    for(int i=0;i<list.size();i++)
		    {
		    Object obj = list.get(i);
		    if(obj instanceof Integer);		
		    {
		    	Integer i1 = (Integer) obj;
		    	if(i1%2==0)
		    	{
		    	System.out.println( "obj present string are "+ i1);
		    	}
	    }
		   		

	}
System.out.println(list);
	}

	}
	

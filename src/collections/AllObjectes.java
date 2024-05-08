package collections;
import java.util.*;  

public class AllObjectes {
	public static void main(String[] args) {
		//ArrayList a1 = new ArrayList();
		java.util.List a1 = new java.util.ArrayList();
		a1.add(122);
		a1.add(7.7);
		a1.add("singam");
		a1.add(5);
		a1.add(5.5);
		a1.add("sanjay");
		a1.add("kumar");
		a1.add('p');
		System.out.println(" In A1 present object are ="+a1);
		System.out.println("character obj in the collection are");
		System.out.println("---------------------------------------");
		for(int i=0;i<a1.size();i++) {
			Object obj = a1.get(i);
			if(obj instanceof Character )
				System.out.println(obj);
		}
		System.out.println("character obj in the collection are");
		System.out.println("---------------------------------------");
		for(int i=0;i<a1.size();i++) {
			Object obj = a1.get(i);
			if(obj instanceof Integer ) {
				Integer i1 =(Integer)obj;
				System.out.println(i1);
		}
		}
		System.out.println("character obj in the collection are");
		System.out.println("---------------------------------------");
		for(int i=0;i<a1.size();i++) {
			Object obj = a1.get(i);
			if(obj instanceof String ) {
				String s =(String)obj;
				if(s.startsWith("k"))
				System.out.println(s);
	}
	
		}}}

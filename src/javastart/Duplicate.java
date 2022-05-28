package javastart;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
	 
		String s= "abinash";
		System.out.println(s);
		String s1="";
		int l= s.length();
		for (int i = 0; i <l; i++) {
			char ch = s.charAt(i);
			if(!s1.contains(Character.toString(ch))) {
				s1=s1+ch;
				
			}
			
		}
		
		 
		System.out.println(s1);
		

	}

}

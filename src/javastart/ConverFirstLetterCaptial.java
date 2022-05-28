package javastart;

public class ConverFirstLetterCaptial {

	public static void main(String[] args) {
		String s= "welcome to java class";
		String s1="";
		String[] s2 = s.split(" ");
		for(String s3:s2) {
			char ch = s3.charAt(0);
			char a = Character.toUpperCase(ch);
			String b = s3.substring(1);
			s1=s1+a+b;
			
		}
		
		 System.out.println(s1);

	}

}

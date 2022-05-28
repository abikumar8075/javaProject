package javastart;

public class Reverse {

	public static void main(String[] args) {
		String s = "Welcome to java class";
		String rev= "";
		for (int i = s.length()-1; i>=0; i--) {
			//char ch = s.charAt(i);
			rev=rev+s.charAt(i);
			
			
		}
		System.out.println(rev);

	}

}

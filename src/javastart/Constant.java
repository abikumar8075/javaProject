package javastart;

public class Constant {

	public static void main(String[] args) {
		String s= "welcome to java class today";
		char[] ch = s.toCharArray();
		int count=0;
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if ((c>='a' &&c <='z')||(c>='A'&& c<='Z')) {
				
			
			if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')) {
				count++;
			}
	 
			}
			
		}
		System.out.println(count);
		 

	}

}

package javastart;

public class CountAllCapsSmallSpaceial {

	public static void main(String[] args) {
	 String str= "Yadavabi8075@gmail.com";
	 int s=0,c=0,n=0,ch=0;
	 String small="",captal="",digit="",spacl="";
	 for (int i = 0; i <str.length(); i++) {
		 char a = str.charAt(i);
		 if( a>=97&& a<=122) {
			 s++;
			 small=small+a;
		 } 
		 else if (a>=65&&a<=90) {
			 c++;
			 captal=captal+a;
			 
			
		}
		 else if (a>=48&&a<=57) {
			n++;
			digit= digit+ a;
			
		}
		 else {
			 ch++;
			 spacl=spacl+a;
		 }
			 
		 }
	 System.out.println("small==>"+s+"==>"+small);
	 System.out.println("small==>"+c+"==>"+captal);
	 System.out.println("small==>"+n+"==>"+digit);
	 System.out.println("small==>"+ch+"==>"+spacl);
	 
			 
		 }
			 
		 
		
	}

	



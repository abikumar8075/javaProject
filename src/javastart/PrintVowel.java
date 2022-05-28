package javastart;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PrintVowel {

	public static void main(String[] args) {
		String s= "welcome to java class today";
		char[] ch = s.toCharArray();
		Map<Character,Integer>mp= new TreeMap<Character,Integer>();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				if (mp.containsKey(c)) {
					 Integer inte = mp.get(ch[i]);
                    mp.put(c, inte+1);
                    
				}
				else {
					mp.put(c, 1);
					
				}
			}	
		}
	
	 Set<Entry<Character, Integer>> entrySet = mp.entrySet();
	 for(Entry<Character, Integer> ent: entrySet) {
		 System.out.println(ent);
	 }

	}

}

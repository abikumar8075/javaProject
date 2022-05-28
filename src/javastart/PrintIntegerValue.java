package javastart;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PrintIntegerValue {

	public static void main(String[] args) {
		int [] in = {1,2,3,4,5,6,1,2,3,4,5,6,7,2,3,4};
		Map<Integer,Integer> li= new TreeMap<Integer,Integer>();
		for (int i = 0; i < in.length; i++) {
			int j = in[i];
			if (li.containsKey(j)) {
		     Integer inte = li.get(in[i]);
		     li.put(j, inte+1);
					
				}
			else {
				li.put(j, 1);
				
				
			}
			
		}
		
		Set<Entry<Integer, Integer>> entry = li.entrySet();
		for(Entry<Integer, Integer> x: entry) {
			System.out.println(x);
		}
		
		
		 

	}

}

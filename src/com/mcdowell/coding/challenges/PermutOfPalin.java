package com.mcdowell.coding.challenges;

import java.util.HashMap;
import java.util.PrimitiveIterator.OfDouble;

public class PermutOfPalin {
	boolean isPermutofPalin(String str) {
		int count = 0;
	HashMap<Character, Integer> hm = new HashMap <Character, Integer>();
	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) == ' ')
			continue;
		else if (!hm.containsKey(str.charAt(i)))
			hm.put(str.toLowerCase().charAt(i), 1);
		else { count = hm.get(str.charAt(i));
			hm.put(str.toLowerCase().charAt(i), count + 1);
			}
	}
	System.out.println(hm);
		int numberOfOdds = 0;
		
		System.out.println(hm.values());
		
			for (int value: hm.values()) {
				System.out.println("value mod 2: " + value%2);
				if (value%2 != 0) {
			
					numberOfOdds++;
					if (numberOfOdds > 1)
						return false;
					System.out.println("number of odds:" + numberOfOdds);
					
				}
			}
					
		
		
			return true;
	
	}
}

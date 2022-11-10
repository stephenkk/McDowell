package com.mcdowell.coding.challenges;
import java.util.Enumeration;
import java.util.Hashtable;

public class PermutationString {
//	Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
//	Hashtable<Character, Integer> ht1 = new Hashtable<Character, Integer>();
boolean isPermut(String str, String str1) {
//		if (str.length() != str1.length())
//		return false;
//		int count = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (!ht.containsKey(str.charAt(i)))
//				ht.put(str.charAt(i), 1);
//			else {
//				count = ht.get(str.charAt(i));
//				ht.put(str.charAt(i), ++count);
//			}
//		}
//			
//			int count1 = 0;
//			for (int i = 0; i < str1.length(); i++) {
//				if (!ht1.containsKey(str1.charAt(i)))
//					ht1.put(str1.charAt(i), 1);
//				else {
//					count1 = ht1.get(str1.charAt(i));
//					ht1.put(str1.charAt(i), ++count1);
//				}
//			
//		}
//			
//	
//	System.out.println(ht);
//	System.out.println(ht1);
//	if(ht.equals(ht1))
//		return true;
//	else
//		return false;
		

	int [] s = new int [128];
	for (int i = 0; i < str.length(); i++) {
		s[str.charAt(i)]++;
		
	}
	for (int j = 0; j < str1.length(); j++) {
		s[str1.charAt(j)]--;
		if (s[str1.charAt(j)] < 0)
			return false;
	}
	
	return true;
	
}
}


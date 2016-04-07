package main.java;

import java.util.HashMap;
import java.util.Map;


public class Problem23 {

	public static void main(String[] args) {
		Map<Integer, Boolean> abundantNumbersMap = new HashMap<Integer, Boolean>();
		int result = 0;
		
		for(int i = 1; i < 28123; i++) {
			if(i < Problem21.sumOfProperDivisors(i)) {
				abundantNumbersMap.put(i, true);
			} else {
				abundantNumbersMap.put(i, false);
			}
		}
		
		for(int i = 28123; i >= 1; i--) {
			boolean found = false;
			for(Map.Entry<Integer, Boolean> entry : abundantNumbersMap.entrySet()) {
				if(entry.getValue()) {
					if(i - entry.getKey() > 1 && abundantNumbersMap.get(i - entry.getKey())) {
						found = true;
						break;
					}
				}
			}
			if(!found) {
				result += i;
			}
		}
		
		System.out.println(result);
	}

	
}

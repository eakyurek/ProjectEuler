package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TODO recursive çözümü de yap
public class Problem24 {
	
	private static int n = 1000000;
	
	public static void main(String[] args) {
		List<Integer> set = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
		Collections.sort(set);
		int remaining = n;
		StringBuilder result = new StringBuilder();
		
		while(remaining > 0 && set.size() > 1) {
			int permSize = factorial(set.size() - 1);
			int division = remaining/permSize;
			division = remaining/permSize == (float)remaining/permSize ? division - 1 : division;
			remaining = remaining - (division * permSize);
			
			Integer current = set.get(division);
			set.remove(division);
			result.append(current);
		}
		
		while(set.size() > 0) {
			result.append(set.get(0));
			set.remove(0);
		}
		
		System.out.println(result.toString());
	}
	
	public static int factorial(int n) {
		return n == 1 ? 1 : factorial(n-1)*n;
	}
	
}

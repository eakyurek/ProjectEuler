package main.java;
import java.util.HashMap;


public class Problem21 {
	
	private static int n = 10000;
	
	public static void main(String[] args) {
		HashMap<Integer, Integer> sumOfProperDivisorsMap = new HashMap<Integer, Integer>();
		int result = 0;
		
		for(int i = 1; i < n; i++) {
			sumOfProperDivisorsMap.put(i, sumOfProperDivisors(i));
		}
		
		for(int i = 1; i < n; i++) {
			if(sumOfProperDivisorsMap.get(i) < n && i == sumOfProperDivisorsMap.get(sumOfProperDivisorsMap.get(i)) && i != sumOfProperDivisorsMap.get(i)) {
				result += i;
			}
		}
		
		System.out.println(result);
	}
	
	public static Integer sumOfProperDivisors(Integer number) {
		int sum = 1;
		for(int i = 2; i < number; i++) {
			if((float)number/i == (int)number/i) {
				sum += i;
			}
		}
		return sum;
	}
}

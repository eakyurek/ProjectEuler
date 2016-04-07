package main.java;

public class Problem26 {
	
	private static double n = 1000;
	
	public static void main(String[] args) {
		
		for(double i = 2; i < n; i++) {
			System.out.println(recurringCycle(1/i));
		}
		
	}
	
	public static String recurringCycle(double n) {
		String nString = String.valueOf(n).substring(2);
		String result = "";
		
		if(nString.length() < 10) {
			return "";
		}
		
		for(int i = 0; i < nString.length(); i++) {
			result += nString.substring(i, i + 1);
			if(result.equals(nString.subSequence(i + 1, i + 1 + result.length()))) {
				break;
			}
		}
		
		return result;
	}
	
}

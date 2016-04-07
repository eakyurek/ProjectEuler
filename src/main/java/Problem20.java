package main.java;
import java.math.BigInteger;


public class Problem20 {

	public static void main(String[] args) {
		String factorialResult = factorial(100).toString();
		int result = 0;
		for(int i = 0; i < factorialResult.length(); i++) {
			result += Character.getNumericValue(factorialResult.charAt(i));
		}
		System.out.println(result);
	}
	
	public static BigInteger factorial(int n) {
		return n == 1 ? BigInteger.ONE : factorial(n-1).multiply(BigInteger.valueOf(n));
	}
}

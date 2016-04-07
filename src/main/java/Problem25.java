package main.java;

import java.math.BigInteger;

public class Problem25 {

	public static void main(String[] args) {
		BigInteger result = BigInteger.ONE, number1 = BigInteger.ONE, number2 = BigInteger.ONE;
		int i = 2;
		
		do {
			i++;
			number1 = number2;
			number2 = result;
			result = number1.add(number2);
		} while(getDigitCount(result) < 1000);
		
		System.out.println(i + " : " + result);
	}
	
	public static BigInteger fibonacci(int n) {
		return n == 1 || n == 2 ? BigInteger.ONE : fibonacci(n - 1).add(fibonacci(n - 2));
	}
	
	public static int getDigitCount(BigInteger number) {
		double factor = Math.log(2) / Math.log(10);
		int digitCount = (int) (factor * number.bitLength() + 1);
		if (BigInteger.TEN.pow(digitCount - 1).compareTo(number) > 0) {
			return digitCount - 1;
		}
		return digitCount;
	}

}

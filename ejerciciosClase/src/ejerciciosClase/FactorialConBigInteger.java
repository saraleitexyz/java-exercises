package ejerciciosClase;

import java.math.BigInteger;

public class FactorialConBigInteger {
	public static long factorial (BigInteger n) {
		long facto=1;
		if (n==0) 
			return 1;
		for (long i=1;i<=n;i++)
			facto*=i;
		return facto;
	}
	
	public static void main(String[] args) {
		for (int i = 1; i < 20; i++) {
			System.out.printf("Factorial de %d!= %d%n", i, factorial(i));
		}
	}
}

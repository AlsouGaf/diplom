package main;

import java.math.BigInteger;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		int k=7;
		/* Ќеправильно работает с (163, 151) - бесконечно вычисл€ет
		 * 						  (125, 25) = 15625
		 */
		String sU = "263"; //263
		String sV = "151"; //151
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		BigInteger g = K_ary_alg.gcd(u, v, k);
		
		System.out.println("gcd(" + sU + ", " + sV + ") = " + g);
		
		/*
		System.out.print("G = ");
		for (int i = 0; i < k; i++){
			System.out.print(Ph1_Precomputation.G[i] + " ");
		}
		
		System.out.println();
		System.out.print("I = ");
		for (int i = 0; i < k; i++){
			System.out.print(Ph1_Precomputation.I[i] + " ");
		}
		
		Eratosthenes.fillSieve(k);
		System.out.println();
		System.out.print("Er = ");
		for (int i = 0; i < k; i++){
			System.out.print(i + " " + Eratosthenes.primes[i] + " ");
		}
		
		System.out.println();
		System.out.print("P = ");
		for (int i = 0; i < k; i++){
			System.out.print(Ph1_Precomputation.P[i] + " ");
		}
		*/
		
	}

}

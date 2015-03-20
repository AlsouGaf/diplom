package main;

import java.math.BigInteger;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		int k=97;

		int k1 = (int)Math.ceil(Math.sqrt(k))+1;
		
		String sU = "263"; //263
		String sV = "151"; //151
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		BigInteger g = K_ary_alg.gcd(u, v, k);
		
		System.out.println("gcd(" + sU + ", " + sV + ") = " + g);
		
		
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
		
		
		System.out.println();
		System.out.print("A = ");
		for (int i = 0; i < k1; i++){
			System.out.print(Ph1_Precomputation.A[i] + " ");
		}
		
		System.out.println();
		System.out.print("B = ");
		for (int i = 0; i < k; i++){
			System.out.print(Ph1_Precomputation.B[i] + " ");
		}
		System.out.println();
		
		System.out.println("k1 = " + k1);
	}

}

package main;

import java.math.BigInteger;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		int k=7;
		BigInteger k_big = new BigInteger(""+k);
		
		Ph1_Precomputation.do_tables(k);
		
		/* Неправильно работает с (163, 151) - бесконечно вычисляет
		 * 					      (25, 5) - выдает 125
		 * 						  (125, 25) = 15625
		 */
		String sU = "263"; //263
		String sV = "151"; //151
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		
		
		//Главный цикл
		BigInteger[] u_and_v= Ph3.main_loop(u, v, k_big);
		
		//4-ая фаза:
		
		BigInteger g = Ph4.NOD(u_and_v[0], u_and_v[1], k);
		
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

//Фаза 1. "Первое предварительное деление"
package main;

import java.math.BigInteger;

public class Ph1_Precomputation {

	public static BigInteger[] A;
	public static int[] G;
	public static int[] I;
	public static BigInteger[] P;
	
	public static void do_tables(int k){
		G = new int[k];
		I = new int[k];
		P = new BigInteger[k];
		
		/************************/
		//Пока заглушка:
		A = new BigInteger[k];
		A[0] = null;
		A[1] = BigInteger.ONE;
		A[2] = BigInteger.ONE;
		A[3] = new BigInteger("2");
		A[4] = new BigInteger("2");
		A[5] = BigInteger.ONE;
		A[6] = BigInteger.ONE;
		
		/*
		for (int a = 1; a < Math.sqrt(k)+1; a++){
			for(int b = ; b < ; b++){
				
			}
		}
		*/
		/************************/
		
		int k1 = (int)Math.sqrt(k)+1;
		Eratosthenes.fillSieve(k+1);
		
		for(int x = 0; x < k; x++){
			G[x] = EuclidOperation.Euclid_int(x, k);
			I[x] = EuclidOperation.obr_el(x, k);
		}
		
		int i = 0;
		int j = 0;
		while (i <= k && j < k){
			if (i <= k1 && Eratosthenes.primes[i]){
				P[j] = new BigInteger("" + i);
				j++;
			}
			else if (i>k1 && Eratosthenes.primes[i] && k%i == 0){
				P[j] = new BigInteger("" + i);;
				j++;
			}
			i++;
		}
	}
	
	
}

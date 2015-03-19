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
		A[1] = new BigInteger("1");
		A[2] = new BigInteger("1");
		A[3] = new BigInteger("2");
		A[4] = new BigInteger("2");
		A[5] = new BigInteger("1");
		A[6] = new BigInteger("1");
		
		/*
		
		A = new BigInteger[k];
		A[0] = null;
		A[1] = new BigInteger("3");
		A[2] = new BigInteger("2");
		A[3] = new BigInteger("4");
		A[4] = new BigInteger("3");
		A[5] = new BigInteger("2");
		A[6] = new BigInteger("3");
		
		A = new BigInteger[k];
		A[0] = null;
		A[1] = new BigInteger("3");
		A[2] = new BigInteger("2");
		A[3] = new BigInteger("2");
		A[4] = new BigInteger("1");
		A[5] = new BigInteger("1");
		A[6] = new BigInteger("1");
		
		A = new BigInteger[k];
		A[0] = null;
		A[1] = new BigInteger("1");
		A[2] = new BigInteger("1");
		A[3] = new BigInteger("1");
		A[4] = new BigInteger("1");
		A[5] = new BigInteger("1");
		A[6] = new BigInteger("1");
		
		A = new BigInteger[k];
		A[0] = null;
		A[1] = new BigInteger("-1");
		A[2] = new BigInteger("-1");
		A[3] = new BigInteger("-2");
		A[4] = new BigInteger("-2");
		A[5] = new BigInteger("-1");
		A[6] = new BigInteger("-1");
		*/
		
		int k1 = (int)Math.sqrt(k)+1;
		
		BigInteger[][] X = new BigInteger[2*k1][k1];
		
		BigInteger a, b, a_1, b_a_1;
		BigInteger k_big = new BigInteger(""+k);
		
		for (int j = 0; j < 2*k1; j++){
			for(int i = 0; i < k1; i++){
				a = new BigInteger(""+(i+1));
				if (j < k1){
					b = new BigInteger(""+(int)(j-k1)); //-3
				}
				else{
					b = new BigInteger(""+(int)(j-(k1-1))); //-2
				}
				a_1 = a.modInverse(k_big);
				b_a_1 = b.multiply(a_1);
				//b_a_1_neg = b_a_1.negate();
				X[j][i] = b_a_1.mod(k_big);
			}
		}
		
		
		
		/*System.out.println("X = ");
		
		for(int j = 0; j < 2*k1; j++){
			for(int i = 0; i < k1; i++){
				System.out.print(X[j][i] + " ");
			}
			System.out.println(" ");
		}
		*/
		/************************/
		
		
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

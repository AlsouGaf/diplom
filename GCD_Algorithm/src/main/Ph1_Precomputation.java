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
		/*
		BigInteger[][] X = new BigInteger[2*k1][2*k1];
		
		BigInteger a_from = new BigInteger(""+ (int)-(Math.sqrt(k)+1));
		BigInteger a_to = new BigInteger(""+ (int) Math.sqrt(k)+1);
		
		BigInteger b_from = new BigInteger(""+ (int)-(Math.sqrt(k)+1));
		BigInteger b_to = new BigInteger(""+ (int) Math.sqrt(k)+1);
		
		System.out.println("X = ");
		
		for(BigInteger a = a_from; a.compareTo(a_to) == -1; a.add(BigInteger.ONE)){
			for(BigInteger b = b_from; b.compareTo(b_to) == -1; b.add(BigInteger.ONE)){
				X[a.intValue()][b.intValue()] = ((b.multiply(a.modInverse(new BigInteger(""+k)))).mod(new BigInteger(""+k))).negate();
				System.out.print(X[a.intValue()][b.intValue()]);
			}
			System.out.println();
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

//Фаза 1. "Первое предварительное деление"
package main;

import java.math.BigInteger;

public class Ph1_Precomputation {

	public static BigInteger[] A;
	public static BigInteger[] B;
	public static int[] G;
	public static int[] I;
	public static BigInteger[] P;
	
	public static void do_tables(int k){
		G = new int[k];
		I = new int[k];
		P = new BigInteger[k];
		
		/************************/
		//Пока заглушка:
		/*A[0] = null;
		A[1] = new BigInteger("1");
		A[2] = new BigInteger("1");
		A[3] = new BigInteger("2");
		A[4] = new BigInteger("2");
		A[5] = new BigInteger("1");
		A[6] = new BigInteger("1");
		*/
		
		int k1 = (int)Math.ceil(Math.sqrt(k))+1;
		
		A = new BigInteger[k];//2*k1
		B = new BigInteger[k];//2*k1
		
		BigInteger[][] X = new BigInteger[k][k1]; //2*k1
		
		BigInteger a, b;
		BigInteger k_big = new BigInteger(""+k);
		
		for (int j = 0; j < k; j++){ //2*k1
			for(int i = 0; i < k1; i++){
				a = get_a(i);
				b = get_b(j, k1);
				X[j][i] = ((b.multiply(a.modInverse(k_big))).negate()).mod(k_big);
				A[X[j][0].intValue()] = get_a(0);
				B[X[j][0].intValue()] = b;
			}
		}
		
		/******Попытка составить массив А****/
		for(int j = 0; j < k; j++){ //2*k1
			for(int i = 0; i < k1; i++){
				if(A[j] != null && B[j] != null){
					// Текущие a и b 
					BigInteger b1 = get_b(j, k1).abs();
					BigInteger a1 = get_a(i);
					
					//a и b из таблицы А
					
					BigInteger b2 = B[X[j][i].intValue()];
					BigInteger a2 = A[X[j][i].intValue()];
					
					BigInteger sum1 = a1.add(b1); 
					if (a2 != null && b2 != null){
						BigInteger sum2 = a2.add(b2.abs());
					
					
						if (sum1.compareTo(sum2) == -1){
							A[X[j][i].intValue()] = a1;
							B[X[j][i].intValue()] = b1;
						}
					}	
				}
			}
		}
		
		/**********************************/
		/*
		System.out.println("X = ");
		
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
	
	public static BigInteger get_a(int i){
		BigInteger a = new BigInteger(""+(i+1));
		return a;
	}
	
	public static BigInteger get_b(int j, int k1){
		BigInteger b;
		if (j < k1){
			b = new BigInteger(""+(int)(j-k1));
		}
		else{
			b = new BigInteger(""+(int)(j-(k1-1)));
		}
		
		return b;
	}
}

package main;

import java.math.BigInteger;

public class Ph4 {

	public static BigInteger NOD(BigInteger u, BigInteger v, int k, BigInteger g){
		
		BigInteger zero_big = BigInteger.ZERO;
		BigInteger t;
		BigInteger g_temp = null;
		if (v.equals(zero_big)){
			t = u;
		}
		else{
			t = v;
		}
		
		BigInteger[] Div_and_Rem_t;
		
		for(int i=0; i < k && Ph1_Precomputation.P[i] != null; i++){
			/*Div_and_Rem_t = t.divideAndRemainder(Ph1_Precomputation.P[i]);
			while(Div_and_Rem_t[1].equals(zero_big)){
				t = Div_and_Rem_t[0];
			}
			*/
			while(t.mod(Ph1_Precomputation.P[i]).equals(zero_big)){
				t = t.divide(Ph1_Precomputation.P[i]);
			}
			g_temp = t.multiply(g);
		}
		
		return g_temp;
	}
}

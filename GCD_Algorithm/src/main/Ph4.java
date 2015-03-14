package main;

import java.math.BigInteger;

public class Ph4 {

	public static BigInteger NOD(BigInteger u, BigInteger v, int k){
		
		BigInteger zero_big = BigInteger.ZERO;
		BigInteger t;
		BigInteger g = Ph2_Trial_Division.remove_com_div(u, v, Ph1_Precomputation.P, k);
		
		if (v.equals(zero_big)){
			t = u;
		}
		else{
			t = v;
		}
		
		BigInteger[] Div_and_Rem_t;
		
		for(int i=0; i < k && Ph1_Precomputation.P[i] != null; i++){
			Div_and_Rem_t = t.divideAndRemainder(Ph1_Precomputation.P[i]);
			while(Div_and_Rem_t[1].equals(zero_big)){
				t = Div_and_Rem_t[0];
			}
			g = t.multiply(g);
		}
		
		return g;
	}
}

package main;

import java.math.BigInteger;

public class Ph2_Trial_Division {


	public static BigInteger remove_com_div(BigInteger u, BigInteger v, BigInteger[] P, int k){
		BigInteger g = BigInteger.ONE;
		P = new BigInteger[k];
		BigInteger[] Div_and_Rem_u;
		BigInteger[] Div_and_Rem_v;
		
		for (int i=0; i < k && P[i] != null; i++){
			Div_and_Rem_u = u.divideAndRemainder(P[i]);
			Div_and_Rem_v = v.divideAndRemainder(P[i]);
			while(Div_and_Rem_u[1].equals(BigInteger.ZERO) &&
					Div_and_Rem_v[1].equals(BigInteger.ZERO)){
				
				u = Div_and_Rem_u[0];
				v = Div_and_Rem_v[0];
				g = g.multiply(P[i]);
			}
		}
		return g;
	}
}

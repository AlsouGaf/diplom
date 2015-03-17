package main;

import java.math.BigInteger;

public class Ph2_Trial_Division {


	public static Result_Ph2 remove_com_div(BigInteger u, BigInteger v, int k){
		BigInteger g = BigInteger.ONE;
		
		Result_Ph2 result = new Result_Ph2();
		
		for (int i=0; i < k && Ph1_Precomputation.P[i] != null; i++){
			
			while(u.mod(Ph1_Precomputation.P[i]).equals(BigInteger.ZERO) && v.mod(Ph1_Precomputation.P[i]).equals(BigInteger.ZERO)){
				u = u.divide(Ph1_Precomputation.P[i]);
				v = v.divide(Ph1_Precomputation.P[i]);
				g = g.multiply(Ph1_Precomputation.P[i]);
			}
		}
		result.u = u;
		result.v = v;
		result.g = g;
		
		//return g;
		return result;
	}
}

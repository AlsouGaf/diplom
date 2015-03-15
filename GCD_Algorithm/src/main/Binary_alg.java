package main;

import java.math.BigInteger;

public class Binary_alg {

	public static BigInteger gcd(BigInteger u, BigInteger v){
		
		BigInteger two = new BigInteger("2");
		BigInteger t;
		
		int iter = 0;
		while (!u.equals(BigInteger.ZERO) && !v.equals(BigInteger.ZERO)){
			
			iter++;
			
			if (u.mod(two).equals(BigInteger.ZERO)){
				u = u.divide(two);
			}
			else if (v.mod(two).equals(BigInteger.ZERO)){
				v = v.divide(two);
			}
			else {
				t = ((u.add(v.negate())).abs()).divide(two);
				if (u.compareTo(v) == 1){
					u = t;
				}
				else{
					v = t;
				}
			}
		}
		
		if (u.equals(BigInteger.ZERO)) {
			t = v;
		}
		else{
			t = u;
		}
		
		System.out.println("count of iter = " + iter);
		
		return t;
	}
}

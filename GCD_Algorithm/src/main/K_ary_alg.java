package main;

import java.math.BigInteger;

public class K_ary_alg {

	public static BigInteger gcd(BigInteger u, BigInteger v, int k){
		
		BigInteger k_big = new BigInteger(""+k);
		
		Ph1_Precomputation.do_tables(k);
		
		//Главный цикл
		BigInteger[] u_and_v= Ph3.main_loop(u, v, k_big);
		
		//4-ая фаза:
		BigInteger g = Ph4.NOD(u_and_v[0], u_and_v[1], k);
		
		return g;
	}
}

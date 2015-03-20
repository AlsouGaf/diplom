package main;

import java.math.BigInteger;

public class K_ary_alg {

	public static BigInteger gcd(BigInteger u, BigInteger v, int k){
		
		long beginTime = System.currentTimeMillis();
		
		BigInteger k_big = new BigInteger(""+k);
		
		Ph1_Precomputation.do_tables(k);
		
		Result_Ph2 result_2 = Ph2_Trial_Division.remove_com_div(u, v, k);
		
		//System.out.println("Заходим в главный цикл");
		
		//Главный цикл
		BigInteger[] u_and_v= Ph3.main_loop(result_2.u, result_2.v, k_big);
		
		//System.out.println("Вышли из главного цикла");
		
		//4-ая фаза:
		BigInteger gcd = Ph4.NOD(u_and_v[0], u_and_v[1], k, result_2.g);
		
		long endTime = System.currentTimeMillis();
		
		double d = (endTime - beginTime) / 1000d;
		
		System.out.println("Время = " + d +" секунд");
		System.out.println();
		
		return gcd;
	}
}

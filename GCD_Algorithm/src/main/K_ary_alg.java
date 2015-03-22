package main;

import java.math.BigInteger;

public class K_ary_alg {

	public static BigInteger gcd(BigInteger u, BigInteger v, int k){
		
		long beginTime = System.currentTimeMillis();
		
		BigInteger k_big = new BigInteger(""+k);
		
		Ph1_Precomputation.do_tables(k);
		
		Result_Ph2 result_2 = Ph2_Trial_Division.remove_com_div(u, v, k);
		
		//Главный цикл
		BigInteger[] u_and_v= Ph3.main_loop(result_2.u, result_2.v, k_big);
		
		//4-ая фаза:
		BigInteger gcd = Ph4.NOD(u_and_v[0], u_and_v[1], k, result_2.g);
		
		long endTime = System.currentTimeMillis();
		
		double d = (endTime - beginTime) / 1000d;
		
		System.out.println("Время = " + d +" секунд");
		System.out.println();
		
		return gcd;
	}
	
public static Result_k_ary_alg gcd_count_time(BigInteger u, BigInteger v, int k){
		
		long beginTime = System.currentTimeMillis();
		
		BigInteger k_big = new BigInteger(""+k);
		
		Ph1_Precomputation.do_tables(k);
		
		Result_Ph2 result_2 = Ph2_Trial_Division.remove_com_div(u, v, k);
		/*
		//Главный цикл
		BigInteger[] u_and_v= Ph3.main_loop(result_2.u, result_2.v, k_big);
		
		//4-ая фаза:
		BigInteger gcd = Ph4.NOD(u_and_v[0], u_and_v[1], k, result_2.g);
		*/
		
		//Главный цикл
		Result_main_loop res_main = Ph3.main_loop_new(result_2.u, result_2.v, k_big);
		
		//4-ая фаза:
		BigInteger gcd = Ph4.NOD(res_main.u, res_main.v, k, result_2.g);
		
		long endTime = System.currentTimeMillis();
		
		double d = (endTime - beginTime) / 1000d;
		
		Result_k_ary_alg result = new Result_k_ary_alg();
		Result_k_ary_alg.gcd = gcd;
		Result_k_ary_alg.count_iter = res_main.count;
		Result_k_ary_alg.time = d;
		
		return result;
	}
}

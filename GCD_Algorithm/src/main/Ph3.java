package main;

import java.math.BigInteger;

public class Ph3 {

	public static BigInteger[] main_loop(BigInteger u, BigInteger v, BigInteger k_big){
		
		BigInteger one_big = BigInteger.ONE;
		BigInteger zero_big = BigInteger.ZERO;
		
		BigInteger k_div_2 = (k_big.divide(new BigInteger("2"))).negate();
		
		
		BigInteger uu, vv, x, a, b, t, t1, t2, val_of_G_uu_big, val_of_G_vv_big, val_of_I_vv_big;
		int iter = 0;
		
		while (!u.equals(zero_big) && !v.equals(zero_big)){
			iter++;
			
			uu = u.mod(k_big);
			vv = v.mod(k_big);
			
		    val_of_G_uu_big = new BigInteger("" + Ph1_Precomputation.G[uu.intValue()]); //G[uu]
			val_of_G_vv_big = new BigInteger("" + Ph1_Precomputation.G[vv.intValue()]);
			val_of_I_vv_big = new BigInteger("" + Ph1_Precomputation.I[vv.intValue()]);
			
			if (val_of_G_uu_big.compareTo(one_big) == 1){
				u = u.divide(val_of_G_uu_big);
			}
			else if (val_of_G_vv_big.compareTo(one_big) == 1){
				v = v.divide(val_of_G_vv_big);
			}
			else{
				x = (uu.multiply(val_of_I_vv_big)).mod(k_big);
				a = Ph1_Precomputation.A[x.intValue()];
				b = ((a.multiply(x)).mod(k_big)).negate();
				
				while (b.compareTo(k_div_2) == -1){
					b = b.add(k_big);
				}
				
				//System.out.println("a = "+ a + ", b = " + b);
				
				t1 = a.multiply(u);
				t2 = b.multiply(v);
				t = t1.add(t2);
				t = t.abs();
				t = t.divide(k_big);
				
				if (u.compareTo(v) == 1){
					u = t;
				}
				else{
					v = t;
				}
			}
		}
		
		System.out.println("count of iter = " + iter);
		
		BigInteger[] u_and_v = new BigInteger[2];
		u_and_v[0] = u;
		u_and_v[1] = v;
		
		return u_and_v;
	}
}

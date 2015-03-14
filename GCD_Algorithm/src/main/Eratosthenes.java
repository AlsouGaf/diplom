package main;
import java.util.Arrays;
public class Eratosthenes {
	
	public static boolean[] primes;
	public static void fillSieve(int n) {
		primes=new boolean[n];
	    Arrays.fill(primes,true);
	    primes[0]=primes[1]=false;
	    for (int i=2;i<primes.length;i++) {
	        if(primes[i]) {
	            for (int j=2;i*j<primes.length;j++) {
	                primes[i*j]=false;
	            }
	        }
	    }
	}
}

package main;


import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException{

		/*
		int k=17;

		int k1 = (int)Math.ceil(Math.sqrt(k))+1;
		
		String sU = "263"; //263
		String sV = "151"; //151
		*/
		
		String[] inputs = new String[3];
		String sU = new String();
		String sV = new String();
		String sk = new String();
		int k = 0;
		BigInteger u = null;
		BigInteger v = null;
				
		List<String> lines = Files.readAllLines(Paths.get("input.txt"), Charset.forName("UTF-8"));
		List<String> out_lines = new ArrayList<>();
		
		for(int i = 0; i < lines.size(); i++){
			inputs = lines.get(i).split(" ");
			
			sU = inputs[0];
			sV = inputs[1];
			sk = inputs[2];
			k = Integer.parseInt(sk);
			
			u = new BigInteger(sU);
			v = new BigInteger(sV);
			
			Result_k_ary_alg res = K_ary_alg.gcd_count_time(u, v, k);
			
			System.out.println("gcd(" + sU + ", " + sV + ") = " + res.gcd + "; k = " + k + "; count = " + res.count_iter + "; time = " + res.time);
			
			String elem = "gcd(" + sU + ", " + sV + ") = " + res.gcd + "; k = " + k + "; count = " + res.count_iter + "; time = " + res.time;
			
			out_lines.add(i, elem); 
			//Files.write(Paths.get("output.txt"), elem.getBytes());
		}
		
			Files.write(Paths.get("output.txt"), out_lines, Charset.forName("UTF-8"));
		
		
		/*
		System.out.print("G = ");
		for (int i = 0; i < k; i++){
			System.out.print(Ph1_Precomputation.G[i] + " ");
		}
		
		System.out.println();
		System.out.print("I = ");
		for (int i = 0; i < k; i++){
			System.out.print(Ph1_Precomputation.I[i] + " ");
		}
		
		Eratosthenes.fillSieve(k);
		System.out.println();
		System.out.print("Er = ");
		for (int i = 0; i < k; i++){
			System.out.print(i + " " + Eratosthenes.primes[i] + " ");
		}
		
		System.out.println();
		System.out.print("P = ");
		for (int i = 0; i < k; i++){
			System.out.print(Ph1_Precomputation.P[i] + " ");
		}
		
		
		System.out.println();
		System.out.print("A = ");
		for (int i = 0; i < k1; i++){
			System.out.print(Ph1_Precomputation.A[i] + " ");
		}
		
		System.out.println();
		System.out.print("B = ");
		for (int i = 0; i < k; i++){
			System.out.print(Ph1_Precomputation.B[i] + " ");
		}
		System.out.println();
		
		System.out.println("k1 = " + k1);
		*
		*/
	}

}

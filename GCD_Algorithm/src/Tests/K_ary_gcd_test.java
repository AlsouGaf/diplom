package Tests;

import static org.junit.Assert.*;

import java.math.BigInteger;

import main.K_ary_alg;

import org.junit.Test;

public class K_ary_gcd_test {

	@Test
	public void test00() {
		String sA = "263";
		String sB = "151";
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		
		int k = 7;		
		
		BigInteger r = K_ary_alg.gcd(a, b, k);
		
		//assertTrue(r.equals(a.gcd(b)));
		assertEquals("1", r.toString()); 
	}
	
	@Test
	public void test10() {
		String sA = "25";
		String sB = "5";
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		
		int k = 7;		
		
		BigInteger r = K_ary_alg.gcd(a, b, k);
		
		//assertTrue(r.equals(a.gcd(b)));
		assertEquals("5", r.toString()); 
	}
	
	@Test
	public void test11() {
		String sA = "125";
		String sB = "25";
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		
		int k = 7;		
		
		BigInteger r = K_ary_alg.gcd(a, b, k);
		
		//assertTrue(r.equals(a.gcd(b)));
		assertEquals("25", r.toString()); 
	}
	
	@Test
	public void test12() {
		String sA = "105";
		String sB = "70";
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		
		int k = 7;		
		
		BigInteger r = K_ary_alg.gcd(a, b, k);
		
		//assertTrue(r.equals(a.gcd(b)));
		assertEquals("35", r.toString()); 
	}
	
	/*
	@Test
	public void test01() {
		String sA = "59862147";
		String sB = "58962";
		
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		
		int k = 7;	
		
		BigInteger r = K_ary_alg.gcd(a, b, k);
		
		assertTrue(r.equals(a.gcd(b)));

	}
	*/
	@Test
	public void test02() {
		String sA = "59860002147";
		String sB = "165258962";
		
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		
		int k = 7;	

		BigInteger r = K_ary_alg.gcd(a, b, k);
		
		assertTrue(r.equals(a.gcd(b)));

	}
	/*
	@Test
	public void test03() {
		String sA = "59860596002147";
		String sB = "216532258962";
		
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		
		int k = 7;	

		BigInteger r = K_ary_alg.gcd(a, b, k);
		
		assertTrue(r.equals(a.gcd(b)));

	}
	
	@Test
	public void test04() {
		String sA = "598605960021405987";
		String sB = "216532258962025";
		
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		
		int k = 7;	

		BigInteger r = K_ary_alg.gcd(a, b, k);
		
		assertTrue(r.equals(a.gcd(b)));

	}
*/
}

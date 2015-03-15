package Tests;

import static org.junit.Assert.*;

import java.math.BigInteger;

import main.Binary_alg;
import main.EuclidOperation;

import org.junit.Test;

public class NODTest {
	@Test
	public void test00() {
		String sA = "263";
		String sB = "151";
		
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		
		BigInteger r = EuclidOperation.NOD(a, b);
		
		//assertEquals("1", r.toString()); 
		assertTrue(r.equals(a.gcd(b)));
		

	}
	
	@Test
	public void test01() {
		String sA = "59862147";
		String sB = "58962";
		
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		

		BigInteger r = EuclidOperation.NOD(a, b);
		
		//assertEquals("93", r.toString()); 
		assertTrue(r.equals(a.gcd(b)));

	}
	
	@Test
	public void test02() {
		String sA = "59860002147";
		String sB = "165258962";
		
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		

		BigInteger r = EuclidOperation.NOD(a, b);
		
		//assertEquals("11", r.toString()); 
		assertTrue(r.equals(a.gcd(b)));

	}
	
	@Test
	public void test03() {
		String sA = "59860596002147";
		String sB = "216532258962";
		
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		

		BigInteger r = EuclidOperation.NOD(a, b);
		
		//assertEquals("1", r.toString()); 
		assertTrue(r.equals(a.gcd(b)));

	}
	
	@Test
	public void test04() {
		String sA = "598605960021405987";
		String sB = "216532258962025";
		
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);
		

		BigInteger r = EuclidOperation.NOD(a, b);
		
		//assertEquals("1", r.toString()); 
		assertTrue(r.equals(a.gcd(b)));

	}
	
	//Для маленьких чисел
	@Test
	public void test05() {
		
		int a = 7;
		int b = 5;
		int r = EuclidOperation.Euclid_int(a, b);
		
		assertEquals("1", ""+r);

	}
	
	@Test
	public void test06() {
		
		int a = 72;
		int b = 25;
		int r = EuclidOperation.Euclid_int(a, b);
		
		assertEquals("1", ""+r);

	}
	
	@Test
	public void test07() {
		String sA = "105";
		String sB = "70";
		
		BigInteger a = new BigInteger(sA);
		BigInteger b = new BigInteger(sB);		
		
		BigInteger r = EuclidOperation.NOD(a, b);
		
		//assertTrue(r.equals(a.gcd(b)));
		assertEquals("35", r.toString()); 
	}

}

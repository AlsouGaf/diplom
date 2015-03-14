package Tests;

import static org.junit.Assert.*;

import java.math.BigInteger;

import main.EuclidOperation;
import org.junit.Test;

public class ObrElemTest {

	@Test
	public void test00() {
		String sA = "2";
		String sN = "7";
		
		
		BigInteger a = new BigInteger(sA);
		BigInteger n = new BigInteger(sN);
		
		BigInteger r = EuclidOperation.obrElement(a, n);
		
		//assertEquals("4", r.toString()); 
		assertTrue(r.equals(a.modInverse(n)));

	}
	
	@Test
	public void test01() {
		String sA = "4";
		String sN = "7";
		
		
		BigInteger a = new BigInteger(sA);
		BigInteger n = new BigInteger(sN);
		
		BigInteger r = EuclidOperation.obrElement(a, n);
		
		
		//assertEquals("2", r.toString()); 
		assertTrue(r.equals(a.modInverse(n)));

	}
	
	@Test
	public void test02() {
		
		int a = 2;
		int b = 7;
		int r = EuclidOperation.obr_el(a, b);
		
		assertEquals("-3", ""+r);

	}
	
	@Test
	public void test03() {
		
		int a = 3;
		int b = 7;
		int r = EuclidOperation.obr_el(a, b);
		
		assertEquals("-2", ""+r);

	}
	
	@Test
	public void test04() {
		
		int a = 4;
		int b = 7;
		int r = EuclidOperation.obr_el(a, b);
		
		assertEquals("2", ""+r);

	}
	/*
	@Test
	public void test05() {
		
		int a = 0;
		int b = 7;
		int r = EuclidOperation.obr_el(a, b);
		
		assertEquals("", ""+r);

	}*/
	

}

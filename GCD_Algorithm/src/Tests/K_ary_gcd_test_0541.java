package Tests;

import static org.junit.Assert.*;

import java.math.BigInteger;

import main.K_ary_alg;

import org.junit.Test;

public class K_ary_gcd_test_0541 {

	@Test
	public void test00() {
		String sU = "263";
		String sV = "151";
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;		
		
		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		//assertTrue(r.equals(a.gcd(b)));
		assertEquals("1", r.toString()); 
	}
	
	@Test
	public void test10() {
		String sU = "25";
		String sV = "5";
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;		
		
		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		//assertTrue(r.equals(a.gcd(b)));
		assertEquals("5", r.toString()); 
	}
	
	@Test
	public void test11() {
		String sU = "125";
		String sV = "25";
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;		
		
		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		//assertTrue(r.equals(a.gcd(b)));
		assertEquals("25", r.toString()); 
	}
	
	@Test
	public void test12() {
		String sU = "106";
		String sV = "71";
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;		
		
		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		//assertTrue(r.equals(a.gcd(b)));
		assertEquals("1", r.toString()); 
	}
	
	
	@Test
	public void test01() {
		String sU = "59862147";
		String sV = "58962";
		
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;	
		
		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		assertTrue(r.equals(u.gcd(v)));

	}
	
	@Test
	public void test02() {
		String sU = "59860002147";
		String sV = "165258962";
		
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;	

		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		assertTrue(r.equals(u.gcd(v)));

	}
	
	@Test
	public void test03() {
		String sU = "59860596002147";
		String sV = "216532258962";
		
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;	

		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		assertTrue(r.equals(u.gcd(v)));

	}
	
	@Test
	public void test04() {
		String sU = "598605960021405987";
		String sV = "216532258962025";
		
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;	

		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		assertTrue(r.equals(u.gcd(v)));

	}

	@Test
	public void test05() {
		String sU = "152";
		String sV = "74";
		
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;	

		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		assertTrue(r.equals(u.gcd(v)));

	}
	
	@Test
	public void test06() {
		String sU = "235730056490598605960021405987";
		String sV = "12165326104258962034525";
		
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;	

		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		assertTrue(r.equals(u.gcd(v)));

	}
	
	@Test
	public void test07() {
		String sU = "452349823709487095679454243235730056490598605960021405987";
		String sV = "121049387520526795793472049365326104258962034525";
		
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;	

		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		assertTrue(r.equals(u.gcd(v)));

	}
	
	@Test
	public void test08() {
		String sU = "7864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987";
		String sV = "121435345240985693879047496703948049387520526795793472049365326104258962034525";
		
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;	

		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		assertTrue(r.equals(u.gcd(v)));
	}
	
	@Test
	public void test09() {
		String sU = "934968770234570394867049768049568497864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987";
		String sV = "1214353452463094760298476048700985693879047496703948049387520526795793472049365326104258962034525";
		
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;	

		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		assertTrue(r.equals(u.gcd(v)));
	}
	
	@Test
	public void test13() {
		System.out.println("test13");
		
		String sU = "197864121344523498238974594587603984576036039845760398623986230485346345600023985703457034870948709567945424323573005649059860596002140598778641213445234982334634560002398570345703487094870978641213445234982334634560002398570345703487094870956794542432357300564905986059600214059875679454243235730056490598605960021405987932932786412134452349823346345600078641213445234982334634560002398570345703487094870956794542432357300564905986059600214059872398578641213478641213445234982334634560002398570345703487094870956794542432357300564905986059600214059877864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987452349823346345600023985703457034870948709567945424323573005649059860596002140598770345703487094870956794542432357300564905986059600214059879734589273458972309458270345782039578209345782094968903750398579283745928734952342039845720934857029348578770234570394867049768049568497864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987932973458927345897230945827034578203957820934578209496890375039857928374592873495234203984572093485702934857877023457039486704976804956849786412134452349823346345600023985703457034870948709567945424323573005649059860596002140598793297345892734589723094582703457820395782093457820949689037503985792837459287349523420398457209348570293485787702345703948670497680495684978641213445234982334634560002398570345703487094870956794542432357300564905986059600214059879734589273458972309458270345782039578209345782094968903750398579283745928734952342039845720934857029348578770234570394867049768049568497864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987932973458927345897230945827034578203957820934578209496890375039857928374592873495234203984572093485702934857877023457039486704976804956849786412134452349823346345600023985703457034870948709567945424323573005649059860596002140598793297345892734589723094582703457820395782093457820949689037503985792837459287349523420398457209348570293485787702345703948670493297345892734589723094582703457820395782093457820949689037503985792837459287349523420398457209348570293485787702345703948670497680495684978641213445234982334634560002398570345703487094870956794542432357300564905986059600214059879329734589273458972309458270345782039578209345782094968903750398579283745928734952342039845720934857029348578770234570394867049768049568497864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987976804956932973458927345897230945827034578203957820934578209496890375039857928374592873495234203984572093485702934857877023457039486704976804956849786412134452349823346345600023985703457034870948709567945424323573005649059860596002140598793297345892734589723094582703457820395782093457820949689037503985792837459287349523420398457209348570293485787702345703948670497680495684978641213445234982334634560002398570345703487094870956794542432357300564905986059600214059879329734589273458972309458270345782039578209345782094968903750398579283745928734952342039845720934857029348578770234570394867049768049568497864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987849786412134452349823346345600023985703457034870948709567945424323573005649059860596002140598732932973458927345897230945827034578203957820934578209496890375039857928374592873495234203984572093485702934857877023457039486704976804956849786412134452349823346345600023985703457034870948709567945424323573005649059860596002140598793297345892734589723094582703457820395782093457820949689037503985792837459287349523420398457209348570293485787702345703948670497680495684978641213445234982334634560002398570345703487094870956794542432357300564905986059600214059879734589273458972309458270345782039578209345782094968903750398579283745928734952342039845720934857029348578770234570394867049768049568497864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987932973458927345897230945827034578203957820934578209496890375039857928374592873495234203984572093485702934857877023457039486704976804956849786412134452349823346345600023985703457034870948709567945424323573005649059860596002140598793297345892734589723094582703457820395782093457820949689037503985792837459287349523420398457209348570293485787702345703948670497680495684978641213445234982334634560002398570345703487094870956794542432357300564905986059600214059879329734589273458972309458270345782039578209345782094968903750398579283745928734952342039845720934857029348578770234570394867049768049568497864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987";
		String sV = "786412134452349823346345600023985760398457603986230345603984576039862370346548951265186946512687985123169879851220206409880506584598120870948709567945424323573005649059860596002140598712786412134452349823346345600023978641213445234982334634560002398570345707864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987786412134452349823346345600023985703457034870948709567945424323573005649059860596002140598734870948709567945424323573005649059860596002140598785703457034870947864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987877864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987095679454243235730056490598605960021405987143537864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987459932973458927345897230945827034578203957820934578209496890375039857928374592873495234203984572093485702934857877023457039486704976804956849786412134452349823346345600023985703457034870948709567945424323573005649059860596002140598793297345892734589723094582703457820395782093457820949689037503985792837459287349523420398457209348570293485787702345703948670497680495684978641213445234982334634560002398570345703487094870956794542432357300564905986059600214059879329734589273458972309458270345782039578209345782094968903750398579283745928734952342039845720934857029348578770234570394867049768049568497864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987329739329734589273458972309458270345782039578209345782094968903750398579283745928734952342039845720934857029348578770234570394867049768049568497864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987932973458927345897230945827034578203957820934578209496890375039857928374592873495234203984572093485702934857877023457039486704976804956849786412134452349823346345600023985703457034870948709567945424323573005649059860596002140598793297345892734589723094582703457820395782093457820949689037503985792837459287349523420398457209348570293485787702345703948670497680495684978641213445234982334634560002398570345703487094870956794542432357300564905986059600214059874589273458972309458270345782039578209345782094968903750398579283745928734952342039845720934857029348578770234570394867049768049568497864121344523498233463456000239857034570348709487095679454243235730056490598605960021405932973458927345897230945827034578203957820934578209496890375039857928374592873495234203984572093485702934857877023457039486704976804956849786412134452349823346345600023985703457034870948709567945424323573005649059860596002140598798793297345892734589723094582703457820395782093457820949689037503985792837459287349523420398457209348570293485787702345703948670497680495684978641213445234982334634560002398570345703487094870956794542432357300564905986059600214059872428273645872635928374592932973458927345897230945827034578203957820934578209496890375039857928374592873495234203984572093485702934857877023457039486704976804956849786412134452349823346345600023985703457034870948709567945424323573005649059860596002140598793293297345892734589723094582703457820395782093457820949689037503985792837459287349523420398457209348570293485787702345703948670497680495684978641213445234982334634560002398570345703487094870956794542432357300564905986059600214059879329734589273458972309458270345782039578209345782094968903750398579283745928734952342039845720934857029348578770234570394867049768049568497864121344523498233463456000239857034570348709487095679454243235730056490598605960021405987932973458927345897230945827034578203957820934578209496890375039857928374592873495234203984572093485702934857877023457039486704976804956849786412134452349823346345600023985703457034870948709567945424323573005649059860596002140598797345892734589723094582703457820395782093457820949689037503985792837459287349523420398457209348570293485787702345703948670497680495684978641213445234982334634560002398570345703487094870956794542432357300564905986059600214059878734569283745689237456298347562938476297435290875289374528374592834570294302897345927509283463094760298476048700985693879047496703948049387520526795793472049365326104258962034525";
		
		
		BigInteger u = new BigInteger(sU);
		BigInteger v = new BigInteger(sV);
		
		int k = 541;	

		BigInteger r = K_ary_alg.gcd(u, v, k);
		
		assertTrue(r.equals(u.gcd(v)));
	}

}

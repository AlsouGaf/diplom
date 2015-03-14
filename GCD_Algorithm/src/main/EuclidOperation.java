//Алгоритм Евклида для больших чисел и для маленьких чисел.
package main;
import java.math.BigInteger;
import java.util.ArrayList;



public class EuclidOperation {
	
public static ResultEuclid generationRK (BigInteger _a, BigInteger _b){
		
	ResultEuclid result = new ResultEuclid();
	BigInteger [] resDel; //ResultDelenie resDel;
	result.k = new ArrayList<BigInteger>();
	result.r = new ArrayList<BigInteger>();
	
	BigInteger a = new BigInteger(_a.toString());
	a.abs();
	
	BigInteger b = new BigInteger(_b.toString());
	b.abs();
	
	do{
		resDel = a.divideAndRemainder(b);
		result.k.add(resDel[0]);
		result.r.add(resDel[1]);
		
		a = b;
		b = resDel[1];
		
	}
	while(!b.equals(BigInteger.ZERO));
	
	return result;
}


public static BigInteger NOD (BigInteger a, BigInteger b){
	
	if(b.compareTo(a.add(BigInteger.ONE)) == 1 || b.compareTo(a.add(BigInteger.ONE)) == 0) //больше или равен 
		NOD(b,a);
	
	ResultEuclid result = new ResultEuclid();
	
	result = generationRK(a, b);
	if (result.r.size()>1){
		return result.r.get(result.r.size()-2);
	}
	else{ 
		return b;
	}
}


public static BigInteger obrElement(BigInteger a, BigInteger n){
	ResultEuclid result = new ResultEuclid();
	
	result = generationRK(a, n);		
	
	BigInteger si2 = BigInteger.ONE;
	
	BigInteger si1 = new BigInteger(result.k.get(1).negate().toString());
	
	BigInteger si = null;
	
	if(result.k.size() <= 2)
		si = new BigInteger(si2.toString());
	else
		si = new BigInteger(si1.toString());
	
	for (int i = 2; i < result.k.size()-1; i++){
		si = result.k.get(i).multiply(si1);
		si = si2.subtract(si);
		
		si2 = si1;
		si1 = si;
	}
	
	while (si.compareTo(BigInteger.ZERO) == -1){ //пока знак отрицательный
			si = si.add(n);
		}
		
		BigInteger res = si.mod(n);
		return res;
	}


	public static int Euclid_int(int a, int b){
		int c;
		while (a % b != 0){
			c = a % b;
			a = b;
			b = c;
		}
		return b;
	}
	
	public static int obr_el(int a, int b){
		int d, x, y, x2, x1, q, r;
		//Как написать чтобы при a=0 ничего не возвращало???
		//if (a == 0){
		//	return null;
		//}
		if (b == 0){
			d=a;
			x=1;
			y=0;
			return x;
		}
		x2=1; 
		x1=0;
		
		while (b>0){
			q=a/b;
			r=a-q*b;
			x=x2-q*x1;
			
			a=b; 
			b=r;
			x2=x1; 
			x1=x;
		}
		
		d=a;
		x=x2;
		
		//return d; //выводит НОД
		return x;//выводит обратный элемент
	}
	/*
	НА ВХОДЕ: два неотрицательных числа a и b: a>=b
			НА ВЫХОДЕ: d=НОД(a,b) и целые x,y: ax + by = d.

			1. Если b=0 положить d:=a, x:=1, y:=0 и возвратить (d,x,y)
			2. Положить x2:=1, x1:=0, y2:=0, y1:=1
			3. Пока b>0
			    3.1 q:=[a/b], r:=a-qb, x:=x2-qx1, y:=y2-qy1
			    3.2 a:=b, b:=r, x2:=x1, x1:=x, y2:=y1, y1:=y
			4. Положить d:=a, x:=x2, y:=y2 и возвратить (d,x,y)
*/
}

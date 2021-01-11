

import java.math.BigInteger;
import java.lang.Math; 

public class Fraction extends Number{
	
	private static final long serialVersionUID = 1L;
	private final boolean False = false;
	private final boolean True = false;
	private BigInteger numer;
	private BigInteger denom;
	private Fraction answer; 
	

	public BigInteger getNumerator(){
		return numer;
	}
	public BigInteger getDenominator(){
		return denom;
	}
	
	public Fraction(BigInteger n, BigInteger d){
		@SuppressWarnings("unused")
		boolean answer = true; 
		
		if (d.equals(0) ){
			answer = false;
		}
		else{
		BigInteger num = n;
		BigInteger den = d;
		@SuppressWarnings("unused")
		BigInteger s = gcd( num , den );
		}
	}			
	public Fraction(BigInteger n){
		return;
	}
	public Fraction(int n, int d) {
		// TODO Auto-generated constructor stub
		@SuppressWarnings("unused")
		boolean answer = true; 
		
		if (d == 0){ answer = false;}
		else {
		@SuppressWarnings("unused")
		int ans = gcd( n, d);
		}  
	}
	
	private int gcd(int n, int d) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static BigInteger gcd(BigInteger numer, BigInteger denom){
		if (denom.equals(BigInteger.ZERO)) {return numer;}
		else {return gcd(denom,numer.remainder(denom));
		}
	
	}
	public Fraction add(Fraction f){
		if (denom == f.denom){ answer = new Fraction(numer.add(f.numer), denom);}
		else {
			BigInteger den = denom.multiply(f.getDenominator());
			BigInteger num = numer.add(f.getNumerator());
			answer = new Fraction(num, den);}
		return answer;
	}
	
	public Fraction subtract(Fraction f){
		if (denom == f.denom){ answer = new Fraction(numer.subtract(f.numer), denom); }
		else{
			BigInteger den = denom.multiply(f.getDenominator());
			BigInteger num = numer.subtract(f.getNumerator());
			answer = new Fraction(num, den);
		}
		return answer;
	}
	
	public Fraction multiply(Fraction f){
		BigInteger den = denom.multiply(f.getDenominator());
		BigInteger num = numer.multiply(f.getNumerator());
		answer = new Fraction(num, den);
		return answer;
	}
	
	public Fraction divide(Fraction f){
		BigInteger num = numer.multiply(f.getDenominator());
		BigInteger den = denom.multiply(f.getNumerator());
		answer = new Fraction(num, den); 
		return answer; 
	}
	
	public boolean equals(Object x){
		if (!Fraction.class.isAssignableFrom(x.getClass())) {
			return False;
		}
		else {
			return True;} 
	}
	public String toString(){ 
		BigInteger num = getNumerator();
		BigInteger den = getDenominator();
		BigInteger p = (num.divide(den));
		String s = p.toString();
		return s;
		
	}
	public static Fraction valueOf(int n, int d){
		int num = n;
		int den = d;
		@SuppressWarnings("unused")
		int f = (num / den);
		Fraction s = Fraction((int) num, (int) den);
		return s;
	}
	private static Fraction Fraction(int num, int den) {
		return null;
	}
	
	public double doubleValue(){
		BigInteger num = getNumerator();
		BigInteger den = getDenominator();
		BigInteger s = ( num.divide(den));
		double d = s.doubleValue();
		return d;
		
	}
	public float floatValue(){
		BigInteger num = getNumerator();
		BigInteger den = getDenominator();
		BigInteger s = (num.divide(den));
		float f = s.floatValue();
		return f;
	}
	public long longValue(){
		BigInteger num = getNumerator();
		BigInteger den = getDenominator();
		BigInteger s = (num.divide(den));
		long l = s.longValue();
		return l;
	}
	public int intValue(){
		BigInteger num = getNumerator();
		BigInteger den = getDenominator();
		BigInteger s = (num.divide(den));
		int i = s.intValue();
		return i;
		
	}
}
	
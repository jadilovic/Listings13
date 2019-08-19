package Primjeri;

public class Rational extends Number implements Comparable<Rational>{

	private long numerator = 0;
	private long denominator = 1;
	
	public Rational(){
		this(0, 1);
	}
	
	public Rational(long numerator, long denominator){
		long gcd = gcd(numerator, denominator);
		this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
	}
	
	private static long gcd(long numerator2, long denominator2) {
		long num = Math.abs(numerator2);
		long den = Math.abs(denominator2);
		int gcd = 1;
		
		for(int k = 1; k <= num && k <= den; k++){
			if(num % k == 0 && den % k == 0)
				gcd = k;
		}
		return gcd;
	}

	public long getNumerator(){
		return numerator;
	}
	
	public long getDenominator(){
		return denominator;
	}
	
	public Rational add(Rational secondRational){
		Rational addR = new Rational();
		long addN = numerator * secondRational.denominator + denominator * secondRational.getNumerator();
		long addD = denominator * secondRational.getDenominator();
		addR = new Rational(addN, addD);
		return addR;
		
	}
	
	public Rational subtract(Rational secondRational){
		long addN = numerator * secondRational.denominator - denominator * secondRational.getNumerator();
		long addD = denominator * secondRational.denominator;
		return new Rational(addN, addD);
	}
	
	public Rational multiply(Rational secondRational){
		long addN = numerator * secondRational.getNumerator();
		long addD = denominator * secondRational.getDenominator();
		return new Rational(addN, addD);
	}
	
	public Rational divide(Rational secondRational){
		long addN = numerator * secondRational.getDenominator();
		long addD = denominator * secondRational.getNumerator();
		return new Rational(addN, addD);
	}
	
	public String toString(){
		if(denominator == 1)
			return "" + numerator;
		return "" + numerator + "/" + denominator;
	}
	
	public boolean equals(Object other){
		//if((this.subtract((Rational)(other))).getNumerator() == 0)
		//	return true;
		//else
		//	return false;
		return other.equals(this.doubleValue());
	}
	
	@Override
	public int compareTo(Rational o) {
		if(this.subtract(o).getNumerator() > 0)
			return 1;
		if(this.subtract(o).getNumerator() < 0)
			return -1;
		else
		return 0;
	}

	@Override
	public double doubleValue() {
		return numerator * 1.0 / denominator;
	}

	@Override
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long) doubleValue();
	}

	
}

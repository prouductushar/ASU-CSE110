import java.lang.Math;

public class Fraction{

	public int numerator;
	public int denominator;

	public Fraction(int num,int denom){
		numerator = num;
		denominator = denom;
	}

	public String toString(){
		
		if(numerator==0){
			return "0";
		}
		
		else if(denominator==1){
			return ""+numerator;
		}
		
		else{
			String fraction=""+numerator+"/"+denominator;
			return fraction;
		}
	}

	private int greatestCommonDivisor(int num1,int num2){
		
		if(num1==num2){
			return num1;
		}
		
		else{
			int diff;
			int large=Math.max(Math.abs(num1),Math.abs(num2));
		    	int small=Math.min(Math.abs(num1),Math.abs(num2));
			while(large!=0 && small!=0){
				diff=large-small;
				large=Math.max(diff,small);
		        	small=Math.min(diff,small);
			}
			return large;
		}
	}

	private void simplify(){
		
		if(denominator<0){
			numerator*=-1;
			denominator*=-1;
		}
		
		int GCD=greatestCommonDivisor(numerator,denominator);
		numerator=numerator/GCD;
		denominator=denominator/GCD;
	}

	public static Fraction multiply(Fraction a,Fraction b){
		Fraction fraction1= new Fraction((a.numerator*b.numerator),(a.denominator*b.denominator));
		fraction1.simplify();
		return fraction1;
	}

	public static Fraction divide(Fraction a,Fraction b){
		Fraction fraction2= new Fraction((a.numerator*b.denominator),(a.denominator*b.numerator));
	    fraction2.simplify();
		return fraction2;
	}

	public static Fraction add(Fraction a,Fraction b){
		Fraction fraction3= new Fraction(((a.numerator*b.denominator)+(a.denominator*b.numerator)),(a.denominator*b.denominator));
		fraction3.simplify();
		return fraction3;
	}

	public static Fraction subtract(Fraction a, Fraction b){
		Fraction fraction4= new Fraction(((a.numerator*b.denominator)-(a.denominator*b.numerator)),(a.denominator*b.denominator));
		fraction4.simplify();
		return fraction4;
	}
}


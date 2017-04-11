import java.util.*;

public class Rational {
		
	int num; //numerator
	int den; //denominator

	public Rational() {
		num = 0;
		den = 1;
	}

	public Rational(int a, int b) {
		num = a;
		den = b;
	}

    public Rational add(Rational x) {	
	
		Rational result;
        result = new Rational(num,den);
		
        result.num = (num * x.den) + (x.num * den);
        result.den = den * (x.den);
	
		int gCD = gcd(result.num, result.den);
	
		result.num = result.num/gCD;
		result.den = result.den/gCD;
		
        return result;
		
	}

	
    public Rational mult(Rational x) {
		
		Rational result;
        result = new Rational(num,den);
		
		result.num = (num)*(x.num);
		result.den = (den)*(x.den);
		
		int gCD = gcd(result.num, result.den);
	
		result.num = result.num/gCD;
		result.den = result.den/gCD;
		
		return result;
	
	}

	
    public int show() {
		
		System.out.print(num+"/"+den);
		return 0;
	}

	private static int gcd(int a, int b) {
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }

}





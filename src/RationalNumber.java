/*
  Week 1 Programming Assignment:
  1. Complete the rational number project (page 589) and add all the extra features that
     reduce a rational number, add, subtract, multiply, and divide two rational numbers.
 */
public class RationalNumber {
    private int numerator, denominator;
    public RationalNumber(){
        numerator=0;
        denominator=1;
    }
    public RationalNumber(int numerator, int denominator) {
        if (denominator==0) throw new IllegalArgumentException("Den can't be zero!");
        this.numerator=numerator;
        this.denominator=denominator;
    }
    // Returns this rational number’s denominator value
    public int getDenominator(){
        return denominator;
    }
    // Returns this rational number’s numerator value
    public int getNumerator(){
        return numerator;
    }
    // Returns a String representation of this rational number
    public String toString(){
        return numerator + "/" + denominator;
    }
    // Reduces this rational number to a simple form
    public void reduce(){
        if (this.denominator < 0)
        {
            this.numerator *= -1;
            this.denominator *=-1;
        }
        int g = gcd(numerator, denominator);
        numerator /= g;
        denominator /= g;
    }
    // See textbook pages 784 - 787 for the following recursive GCD code
    public static int gcd(int x, int y) {
        if (x < 0 || y < 0) {
            // recursive case with negative value(s)
            return gcd(Math.abs(x), Math.abs(y));
        } else if (y == 0) {
            // base case with y == 0
            return x;
        } else {
            // recursive case with y > 0
            return gcd(y, x % y);
        }
    }
    // Returns the sum of two rational numbers
    public static RationalNumber add(RationalNumber r1, RationalNumber r2)
    {
        int n = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int d = r1.denominator * r2.denominator;
        RationalNumber r = new RationalNumber(n, d);
        r.reduce();
        return r;
    }
    // Multiplies two rational numbers
    public static RationalNumber multiply(RationalNumber r1, RationalNumber r2)
    {
        int n = r1.numerator * r2.numerator;
        int d = r1.denominator * r2.denominator;
        RationalNumber r = new RationalNumber(n, d);
        r.reduce();
        return r;
    }
    // Divides rational number r1 by r2
    public static RationalNumber divide(RationalNumber r1, RationalNumber r2)
    {
        int n = r1.numerator * r2.denominator;
        int d = r1.denominator * r2.numerator;
        RationalNumber r = new RationalNumber(n, d);
        r.reduce();
        return r;
    }
}

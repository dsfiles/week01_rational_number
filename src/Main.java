/*
  Week 1 Programming Assignment:
  1. Complete the rational number project (page 589) and add all the extra features that
     reduce a rational number, add, subtract, multiply, and divide two rational numbers.
 */
public class Main {
    public static void main(String args[]) {
        // Constructs a new rational number to represent the ratio (0/1)
        RationalNumber r = new RationalNumber();
        System.out.println(r.getNumerator());
        System.out.println(r.getDenominator());
        System.out.println(r);

        RationalNumber r2 = new RationalNumber(3,6);
        r2.reduce();
        System.out.println(r2);

        RationalNumber r3 = new RationalNumber(1,-12);
        RationalNumber r4 = new RationalNumber(2,3);
        System.out.println("r3=" + r3 + ", r4=" + r4);
        System.out.println("Sum of 1/-12 and 2/3: " + RationalNumber.add(r3,r4));
        System.out.println("r3=" + r3 + ", r4=" + r4);

        System.out.println("Product of 1/-12 and 2/3: " + RationalNumber.multiply(r3, r4));
        System.out.println("Divide 1/-12 by 2/3: " + RationalNumber.divide(r3, r4));
    }
}

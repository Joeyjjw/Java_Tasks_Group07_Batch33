package joey_wang.week1;

public class Divide {
    public static void main(String[] args) {

// Divide without/operator

    int dividend = 80;
    int divisor = 5;
       // defines the values for dividend and divisor.
    int quotient = 0;

    // for(initialization; condition; iteration)
        //uses a loop to perform repeated subtraction of divisor from
        // dividend until dividend becomes less than divisor.
        for (int i = 0; dividend >= divisor ; i++) {
        dividend -= divisor;
        //it decrements dividend by divisor and increments quotient
        quotient++;
    }
    int remainder = dividend;
        //it calculates the remainder by assigning the value of dividend to remainder.

        System.out.println(quotient + " with a remainder of " + remainder);



}
    }


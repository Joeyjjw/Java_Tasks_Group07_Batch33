package aliaksandra_wasilewic.week1;

import java.util.Scanner;

public class FINRA {
    /** 3. Create a class called FINRA. Write a function that prints out the number.
     For a number that is a multiple of 3, print "FIN" instead of the number.
     For a number that is a multiple of 5, print "RA" instead of the number.
     For a number that is a multiple of both 3 and 5, print "FINRA" instead of the number.
     Example:
     number = 15
     Output:
     FINRA
     **/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, write your number");
        int num = input.nextInt();
        if(num%3==0) {
            System.out.println("FIN");
        }else if(num%5==0){
            System.out.println("RA");
        }else if (num%3==0 && num%5==0){
            System.out.println("FINRA");
        }else {
            System.out.println("Result of dividing by 3 or 5 not an integer. Number isn't FIN-RA");
        }
    }
}

package aliaksandra_wasilewic.week1;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter whole number");
        int num = input.nextInt();
        if (num%2==0){
            System.out.println("Your number is even");
        }else if(num%2!=0){
            System.out.println("Your number is odd");
        }else {
            System.out.println("Your number is incorrect");
        }
    }
}

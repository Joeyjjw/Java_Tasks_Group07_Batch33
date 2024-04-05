package joey_wang.week1;

public class EvenAndOdd {
    /*
Numbers -- odd & even
Write a method to identify whether a given number is even or odd.
EX:
identify(5) --> "Odd"
identify(6) --> "Even"
 */

    public static void main(String[] args) {

        System.out.println(evenOrOdd(5));
        System.out.println(evenOrOdd(6));

    }
    public static String evenOrOdd(int n){
        //takes an integer n as input, and check if 'n' is even or odd
        if(n % 2 == 0){
            return "Even";
            //If n is divisible by 2 with no remainder, it returns "Even".
            //otherwise returns odd.
        }else{
            return "Odd";
        }

    }
}

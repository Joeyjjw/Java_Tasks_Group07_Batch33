package joey_wang.week1;

public class FINRA {

    public static void main(String[] args) {
        //print out numbers from 1 to 30
        int number = 30;
        String result = "";


        //number multiple of both 3 & 5 prints "FINRA"
        if (number % 3 == 0 && number % 5 == 0) {
            // this step has to be 1st, or else creates a bug
            result = "FINRA";
        } else if (number % 5 == 0) {
            //number multiple of 5 prints "RA" instead of number
            result = "RA";
        } else if (number % 3 == 0) {
            //number multiple of 3 prints "FIN" instead of number
            result = "FIN";
        } else { // otherwise: if the number is not evenly divisible by 3 & 5
            result = "INVALID";
        }

        System.out.println("Output = " + result);

    }
    }

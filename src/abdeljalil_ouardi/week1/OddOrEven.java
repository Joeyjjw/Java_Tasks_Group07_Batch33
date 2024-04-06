package abdeljalil_ouardi.week1;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("identify(8) = " + identify(8));
        System.out.println("identify(7) = " + identify(7));
    }
        public static String identify(int number) {
            if (number % 2 == 0) {
                return "even";
            } else {
                return "odd";
            }
        }}



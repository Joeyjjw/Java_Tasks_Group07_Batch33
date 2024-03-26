package winniffer_diluyo.Week1;

public class FINRA {

    public static void main(String[] args) {

        int number = 30;
        String results = "";

        if(number %3 ==0){
            System.out.println("FIN");
        } else if (number%5==0) {
            System.out.println("RA");

        } else if (number %3==0 || number %5 ==0) {
            System.out.println("FINRA");

        }else {
            results = "" + number;


        }

        System.out.println(results);


    }
}

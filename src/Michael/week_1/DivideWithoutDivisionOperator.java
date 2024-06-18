package Michael.week_1;

public class DivideWithoutDivisionOperator {
    public static void main(String[] args) {
        divideWithoutDivisionOperatorMethod(20,2);

    }

    public static void divideWithoutDivisionOperatorMethod(int num3, int num4) {
        if(num4==0) {
            System.out.println("Invalid Number");
        }


        System.out.print("When "+ num3 +" is divided by "+num4 +", the result is: " );

        int count =0;
        while(num3 >= num4) {
            num3 -= num4;
            count++;
        }

        System.out.println( count+" and remainder is "+num3);
    }

}

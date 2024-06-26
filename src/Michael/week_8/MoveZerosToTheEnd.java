package Michael.week_8;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*
  Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
        Ex:
        input:  {1,0,2,0,3,0,4,0};
        output: [1, 2, 3, 4, 0, 0, 0, 0]
*/


    public static void main(String[] args) {
        int [] arr={1,0,2,0,3,0,4,0};
        int[] zerosAtTheEnd = moveZeros(arr);
        System.out.println("zerosAtTheEnd = " + Arrays.toString(zerosAtTheEnd));

    }

    public static int[] moveZeros( int[]  arr ) {
        ArrayList<Integer> list = new ArrayList<>();
        int countZero = 0;
        for(int each: arr) {
            list.add(each);
            countZero+= (each==0)?1:0;
        }
        list.removeAll(Arrays.asList(0));
        arr = new int[arr.length];
        for(int i=0; i <arr.length-countZero; i++ ) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}

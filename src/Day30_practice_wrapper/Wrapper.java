package Day30_practice_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class Wrapper {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        replace(arr, 2, 30);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------");
        String[] arr2 = {"java", "Python", "C+"};
        arr2=replace(arr2, 2, "C#");
        System.out.println(Arrays.toString(arr2));


    }


    //                          {1,2,3,4,5}    200 ,        30
    public static int[] replace(int[] array, int index, int newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index:" + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    public static double[] replace(double[] array, int index, double newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index:" + index);
            System.exit(0);


        }
        return array;
    }

    public static String[] replace(String[] array, int index, String newElement) {
        if (index < 0 || index > array.length - 1) {
            System.out.println("Invalid Index:" + index);
            System.exit(0);
        }
        return array;
    }
}

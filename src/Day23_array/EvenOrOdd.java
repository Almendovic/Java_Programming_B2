package Day23_array;

import java.util.Arrays;

public class EvenOrOdd {

    public static void main(String[] args) {

        int[] nums = {3,5,67,75,12,4,2};
        System.out.println(Arrays.toString(nums));

        int even=0,odd=0;

        for (int num : nums) {
            if(num%2==0){
                even++;
            }else{

                odd++;
            }

        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);







    }



}

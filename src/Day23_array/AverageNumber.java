package Day23_array;

public class AverageNumber {
    public static void main(String[] args) {


        double[]prices ={13.99,19.14,3.112,65.332};

        double sum=0;

        for (double price : prices) {
            sum+=price;


        }
        System.out.println(sum/prices.length);


        }



    }


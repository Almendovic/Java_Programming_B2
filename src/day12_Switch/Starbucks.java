package day12_Switch;

public class Starbucks {
    /*

     */
    public static void main(String[] args) {

        String size = "grande";
        int calories =0;
        double price =0;



        switch (size){


            case"tall":
                price =2.50;
                calories=100;
                break;
            case "grande":
                price=4.00;
                calories=150;
                break;
            case "venti":
                price=4.50;
                calories=200;
                break;





        }
        if(price != 0 && calories !=0 ) {
            System.out.println("Size: " + size + " is " + calories + " calories and costs $ " + price);//print statement outside of switch statement
        }









    }
}

package PracticeAndHW;

public class ifpractice2 {
    public static void main(String[] args) {

     int number = 40;

     if(number > 0){
         System.out.println("Positive");
     }else if(number <0){
         System.out.println("Negative");
     }else{
            System.out.println("Zero");
        }

        System.out.println("----------------------------------------");
     int score = 140;
     char grade ; //A,B,C,D,F



      if(score >120){
         grade = 'A';

     } else if( score >=80) {
          grade = 'B';
     } else if(score >=70 ) {
         grade = 'C';
     }else if (score >=60){
         grade = 'D';
     }else {
         grade = 'F';
     }
        System.out.println("The grade is " + grade);



     }


    }


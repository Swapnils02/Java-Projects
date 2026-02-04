import java.util.*;
import java.lang.Math;
public class NumberGuess{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number=(int)(100*Math.random())+1;
        System.out.println(number);
        int attempts=5;
        System.out.println("You have " + attempts + " attempts to guess the correct number");
        System.out.println("Guess Number between 1 to 100");
        for(int i=0;i<attempts;i++){
            System.out.println("Enter your guess:");
            int guess=sc.nextInt();
            if(guess==number){
                System.out.println("Congratulations! You Guessed right!!!!");
                break;
            }
            else if(guess<number) {
                System.out.println("The number is greater than " + guess);
            }
            else{
                System.out.println("The number is less than " + guess);
            }
        }
        System.out.println("You have reached the limit of attempts");
        System.out.println("Do you want to know what the number was? Press 1.Yes 2.No");
        int choice=sc.nextInt();
        if(choice==1){
            System.out.println("The correct number was: " + number);
        }
        System.out.println("Thanks For Playing Game!!!");
    }
}
        

       

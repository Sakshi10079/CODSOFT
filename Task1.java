import java.util.Random;
import java.util.Scanner;

class Game{
   public int userInput,generatedNumber;
   public int noOfGuesses=0;

     public int getNoOfGuesses() {
         return noOfGuesses;
     }

     public void setNoOfGuesses(int noOfGuesses) {
         this.noOfGuesses = noOfGuesses;
     }


     Game(){
         Random rd= new Random();
         generatedNumber = rd.nextInt(100);
     }
  void userInput(){
      System.out.println("Guess the number");
      Scanner sc = new Scanner(System.in);
      userInput = sc.nextInt();
  }
  boolean isEqual(){
         noOfGuesses++;
             if (generatedNumber == userInput)
             {System.out.format("You guessed it right,it was %d\n you guessed it in %d attempts",generatedNumber,noOfGuesses);
             return true;
             }
             else if (userInput > generatedNumber)
             {System.out.println("Too high. Try again!");}
             else if (userInput < generatedNumber)
             {System.out.println("Too low. Try again!");}
       return false;
     }
 void noOfGuesses(){

 }
}
public class Task1 {
    public static void main(String[] args) {
        /*
        Create a class Game to allow user to play "guess the no" game
        the class should have following functions:
        1. constructor to generate random number
        2.userInput() to take user input
        3.isEqual() to check if the generated no is equal to guessed n
        4.noOfGuesses() to calculate the total no of guesses
         */
        boolean b = false;
       Game g = new Game();
       while(!b){
       g.userInput();
       b=g.isEqual();
    }
    }

}
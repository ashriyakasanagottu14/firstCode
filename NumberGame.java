import java.util.Random;
import java.util.Scanner;

//creating a class for the game
class NumberGame {
    //creating the main method
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        
        int maxAttempts=10;
        Boolean playAgain=true;
        int totalScore=0;
        
        while(playAgain){
            int randomNum=rand.nextInt(100);
            System.out.println(randomNum);
            
            
            int attempts=0;
            Boolean guessedCorrectly=false;
            
            while(attempts<maxAttempts && !guessedCorrectly){
                System.out.println("Guess the Generated Numbeer");
                int guessedNum=sc.nextInt();
                attempts++;
            
                if(guessedNum==randomNum){
                    System.out.println("Congratulations!!! you have guessed the correct number :)");
                    guessedCorrectly=true;
                }else if(guessedNum<randomNum){
                    System.out.println("guessedNumber is less than generatedNumber");
                }else{
                    System.out.println("guessed number is higher than the generatedNumber");
                }
            }
            
        
            if(!guessedCorrectly){
                System.out.println("You lost all the attempts");
            }
            totalScore+=(maxAttempts-attempts+1);
            //printing the score of the user
            System.out.println("Your Score is:"+totalScore);
            
            //if the user wants to play again
            System.out.println("Do you want to play again?\nif yes press 1 if no press 0 (1/0)");
            int play=sc.nextInt();
            if(play==1){
                playAgain=true;
            }else{
                playAgain=false;
            }
        }
        System.out.println("Thank you for playing!!!!");
        
    }
}
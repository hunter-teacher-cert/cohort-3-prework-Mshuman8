import java.util.Scanner;
import java.util.Random;

public class Guess {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        // System.out.println(number);

        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");

        Scanner input = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int guess = input.nextInt();
        
        input.nextLine();

        System.out.println("Your guess is: " + guess);
        
        System.out.println("The number I was thinking of is: " + number);
        System.out.print("You were off by: ");
        System.out.print(guess - number);
        
    }
    
}
import java.util.Scanner;

public class Craps {

    public static int roll(int num) {

        double randNum =  Math.random() * (num-1);
        int rounded = (int) randNum;

        // int randNum = (int) Math.random() * (num + 1);
        return rounded;
        
    }

    public static int shoot(int numDice, int maxVal) {

        int totalPoss = numDice * maxVal;
        int ptsRolled = roll(totalPoss);
        return ptsRolled;
        
    }

    public static boolean round() {
        
        int points = shoot(2,6);
        if (points == 2 || points == 3 || points == 12) {
            return false;
        }
        else if (points == 7 || points == 11) {
            return true;
        }
        else {
            int newRoll = shoot(2,6);
            while (newRoll != points) {
                if (newRoll == 7) {
                    return false;
                }
                newRoll = shoot(2,6);
            }
            return true;
        }
        
    }


    public static void main(String[] arg) {
        
        //roll test
        // double randNum1 = roll(10);
        // System.out.println(randNum1);

        // //shoot test
        // int ex1 = shoot(2,6);
        // System.out.println(ex1);

        // //round test
        // boolean ex2 = round();
        // System.out.println(ex2);

        Scanner input = new Scanner(System.in);
        System.out.println("How many rounds do you want to play?");
        int numRounds = input.nextInt();
        input.nextLine();
        int userScore = 0;

        for (var i=0; i<numRounds; i++) {
            System.out.print("Welcome to round ");
            System.out.println(i + 1);
            boolean roundResult = round();
            if (roundResult == true) {
                System.out.print("Congratulations you won round ");
                System.out.println(i+1);
                userScore += 1;
            } else {
                System.out.print("I am sorry, you lost round ");
                System.out.println(i+1);
            }
            
        }
        System.out.print("Thanks for playing! Your final score was ");
        System.out.println(userScore);
        
        
    }

}



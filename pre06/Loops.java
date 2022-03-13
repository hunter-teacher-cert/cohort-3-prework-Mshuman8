//exercises 2, 3, 4

public class Loops {

    //Exercise 2: make a method called squareRoot that takes in a double and returns an approximation of the square root of the parameter using x1 = (x0 + a/x0)/2
    
    public static double squareRoot(double num) {
        
        double x0 = num/2;
        double x1 = (x0 + num/x0)/2;

        while(Math.abs(x1 - x0) > 0.0001) {
            x0 = x1;
            x1 = (x0 + num/x0)/2;
        }
        return x0;
    }

    //Exercise 3: write a method called power that takes in a double x and an integer n and returns x^n. Write an iterative method to perform the same calculation

    public static double power(double x, int n) {
        
        double total = x;
        int i = 0;

        while(i <= n) {
            total *= x;
            i += 1;
        }
        return total;
    }

    //write a method that computes the factorial of a given integer

    public static double factorial(int num) {

        double total = 1;
        while (num > 0) {
            total *= num;
            num -= 1;
        }
        return total;
        
    }
    

    public static void main(String[] arg) {
        
        //exercise 2 test
        double ex1 = squareRoot(2);
        System.out.println(ex1);

        //exercise 3 test
        double ex2 = power(2,5);
        System.out.println(ex2);

        //exercise 4 test
        double ex3 = factorial(3);
        System.out.println(ex3);
    }

}


//Write a recursive method called power that takes a double x and an integer n and returns xn.

// Hint: A recursive definition of this operation is xn = x · xn−1. Also, remember that anything raised to the zeroth power is 1.

// Optional challenge: you can make this method more efficient, when n is even, using xn = ( xn/2 )2.
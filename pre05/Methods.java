// Create a folder named pre05 under the assignment repo. Write a program named Methods.java with methods that solve exercises 2, 3, and 8 from Chapter 6 in Think Java.

public class Methods {

    //isDivisible -- takes in 2 integers, n and m and returns true if n is divisible by m and false otherwise.
    
    public static boolean isDivisible(int n, int m) {
        if (n%m == 0) {
            return true;
        }
        else {
            return false;
        }

    }

    //Write a method named isTriangle that takes three integers as arguments and returns either true or false, depending on whether you can or cannot form a triangle from sticks with the given lengths. The point of this exercise is to use conditional statements to write a value method.

    public static boolean isTriangle(int side1, int side2, int side3) {
        if (side1 + side2 < side3 || side1 + side2 < side3 || side2 + side3 < side1) {
            return false;
        }
        else {
            return true;
        }
    }

    public static int ack(int num1, int num2) {
        if (num1 == 0) {
            return num2 + 1;
        }
        else if (num1 > 0 && num2 == 0) {
            return ack(num1-1,1);
        }
       return ack(num1-1,ack(num1,num2-1));

    }

    

    public static void main(String[] arg) {
        //tests for isDivisible
        boolean ex1 = isDivisible(6,3);
        boolean ex2 = isDivisible(5,3);
        boolean ex3 = isDivisible(2,6);
        System.out.print("Tests for isDivisible: ");
        System.out.print(ex1);
        System.out.print(ex2);
        System.out.println(ex3);

        //tests for isTriangle
        boolean ex4 = isTriangle(1,1,12);
        boolean ex5 = isTriangle(3,4,5);
        boolean ex6 = isTriangle(6,6,10);
        System.out.print("Tests for isTriangle: ");
        System.out.print(ex4);
        System.out.print(ex5);
        System.out.println(ex6);


        //tests for ack
        int ex7 = ack(1,2);
        int ex8 = ack(2,1);
        int ex9 = ack(0,1);
        System.out.print("Tests for ack: ");
        System.out.println(ex7);
        System.out.println(ex8);
        System.out.println(ex9);
        
    }

}
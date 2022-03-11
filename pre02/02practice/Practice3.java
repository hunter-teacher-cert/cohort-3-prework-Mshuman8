import java.util.Scanner;

// public class Practice3 {

//     public static void main(String[] args) {
//         String line;
//         //make a Scanner variable titled "in" that takes in input from System.in
//         //make the variable and then set another variable (string) equal to that input variable.nextLine()
//         Scanner in = new Scanner(System.in);

//         System.out.print("Type something: ");
//         line = in.nextLine();
//         System.out.println("You said: " + line);

//         System.out.print("Type something else: ");
//         line = in.nextLine();
//         System.out.println("You also said: " + line);
//     }
    
// }

// public class Practice3 {

//     public static void main(String[] args) {

//         int inch;
//         double cm;
//         Scanner input = new Scanner(System.in);

//         System.out.print("How many inches? ");
//         inch = input.nextInt();
//         cm = inch * 2.54;
//         System.out.print(inch + " in = ");
//         System.out.println(cm + " cm");
        
//     }
    
// }


// // Literals == constants
// public class Practice3 {

//     public static void main(String[] args) {

//         int inch;
//         double cm;
//         final double CM_PER_INCH = 2.54;
//         Scanner input = new Scanner(System.in);

//         System.out.print("How many inches? ");
//         inch = input.nextInt();
//         cm = inch * CM_PER_INCH;
//         System.out.print(inch + " in = ");
//         System.out.println(cm + " cm");
        
//     }
    
// }

// //Formatting Output

// // There is another type of print: System.out.printf

// public class Practice3 {

//     public static void main(String[] args) {

//         System.out.println(4.0 / 3.0);

//         System.out.printf("Four thirds = %.3f", 4.0 / 3.0);
        
//     }
    
// }


// public class Practice3 {

//     public static void main(String[] args) {

//         // int inch = 100;
//         // final double CM_PER_INCH = 2.54;
//         // double cm = inch * CM_PER_INCH;
//         // System.out.printf("%d in = %f cm\n", inch, cm);


//         // putting (int) before a number or varaible will convert it (to just the leading # -- similar to floor())
        
//         // 3.7
//         // double pi = 3.14159;
//         // int x = (int) pi;
        
        
//     }
    
// }

// class Practice3 {

//     public static void main(String[] args) {

//         double cm;
//         int feet, inches, remainder;
//         final double CM_PER_INCH = 2.54;
//         final int IN_PER_FOOT = 12;
//         Scanner input = new Scanner(System.in);

//         //prompt user and get the value of cm
//         System.out.print("Exactly how many cm? ");
//         cm = input.nextDouble();

//         //convert and output the result
//         inches = (int) (cm/CM_PER_INCH);
//         feet = inches / IN_PER_FOOT;
//         remainder = inches % IN_PER_FOOT;
//         System.out.printf("%2f cm = %d ft, %d in\n", cm, feet, remainder);
        
        
//     }
    
// }

class Practice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age = input.nextInt();
        input.nextLine(); //read the newline
        System.out.print("What is your name? ");
        String name = input.nextLine();
        
        System.out.printf("Hello %s, age %d\n",name,age);
        
    }
    
}
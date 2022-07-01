import java.util.Scanner;

class Celsius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in celsius ");
        double degreeC = input.nextInt();
        input.nextLine();
        final double C_TO_F_MULT = 9 / 5;
        final double C_TO_F_ADD = 32;
        double degreeF = degreeC * C_TO_F_MULT + C_TO_F_ADD;

        
        System.out.printf("%1f C = %1f F\n",degreeC,degreeF);
            
    }

    

    
        
    
}

// %d displays decimal values
    // ex: 1234
// %08d padded with zeros, at least 8 wide
    // ex: 00012345
// %f floating-point
    // ex: 6.789000
//%.2f rounded to 2 decimal places
    // ex: 6.79
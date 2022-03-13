public class Beer {

    public static void numBottles(int num) {
        if (num > 0) {
            System.out.print(num);
            System.out.println(" bottles of beer on the wall,");
            System.out.print(num);
            System.out.println(" bottles of beer,");
            System.out.println("ya' take one down, ya' pass it around,");
            System.out.print(num-1);
            System.out.println(" bottles of beer on the wall,");
            numBottles(num-1);
        }
        else {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya' can't pass it around,");
            System.out.println("cause there are no more bottles of beer on the wall,");
            System.out.println(" ");
        }
    }

    public static void main(String[] arg) {
        numBottles(3);
    }

}
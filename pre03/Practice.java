

public class Practice {

    public static void newLine() {
        System.out.println();
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    // public static void main(String[] args) {
    //     System.out.println("First line.");
    //     threeLine();
    //     System.out.println("Second line");
    //     threeLine();
    //     System.out.println("third line");
    // }

    public static void printTwice(String aString) {
        System.out.println(aString);
        System.out.println(aString);
    }

    public static void main(String[] args) {
        printTwice("Repeat it and reverse it");
    }
    
}
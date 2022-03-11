public class Data {
    public static void main(String[] args) {
        String day = "Thursday";
        int date = 10;
        String month = "March";
        int year = 2022;

        // System.out.println(day);
        // System.out.println(date);
        // System.out.println(month);
        // System.out.println(year);

        System.out.println("American format: ");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(", ");
        System.out.println(year);
        
        System.out.println("European format: ");
        System.out.print(day);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(" ");
        System.out.println(year);
    }
}
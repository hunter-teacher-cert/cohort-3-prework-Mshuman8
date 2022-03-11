public class Time {   
    public static void main(String[] args) {

        //2. 19:41:28
        int hour = 19;
        int minute = 41;
        int second = 28;

        //3.
        System.out.print("The number of seconds since midnight (last night): ");
        System.out.println(hour*60*60 + minute*60 + second);

        //4.
        System.out.print("The number of seconds remaining in the day: ");
        System.out.println((23 - hour)*60*60 + (59 - minute)*60 + (60 - second));

        //5. 
        double timeLeft = (23.0 - hour)*60*60 + (59 - minute)*60 + (60 - second);
        double timePassed = hour*60*60.0 + minute*60 + second;

        
        System.out.print("The percentage of the day that has passed is: ");
        System.out.print((timePassed/(24*60*60))*100);
        System.out.println("%");

        hour = 19;
        minute = 55;
        second = 28;

        System.out.print("The time is now: ");
        System.out.println(hour*60*60 + minute*60 + second);

        System.out.print("Since starting this exercise it has taken  ");
        System.out.print((hour*60*60 + minute*60 + second) - 70888);
        System.out.println(" seconds.");
        System.out.print("Which is ");
        System.out.print(((hour*60*60 + minute*60 + second) - 70888)/60);
        System.out.print(" minutes.");
    }

}
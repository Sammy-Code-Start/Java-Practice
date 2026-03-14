package java_programming_I.Part_1.part_16;
import java.util.Scanner;
public class SecondsInADay {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        // 1 day = 24 hrs
        // 1 hr = 60 mins
        // 1 mins = 60 secs
        int seconds = days * 24 * 60 * 60;
        System.out.println(seconds);
    }
}

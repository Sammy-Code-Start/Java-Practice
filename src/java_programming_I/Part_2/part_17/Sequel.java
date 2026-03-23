package java_programming_I.Part_2.part_17;
import java.util.Scanner;
public class Sequel {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("First number?");
        int first_num = Integer.valueOf(sc.nextLine());
        System.out.print("Last number?");
        int second_num = Integer.valueOf(sc.nextLine());
        int sum = 0;
        for(int i=first_num; i<=second_num; i++)
        {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}

package java_programming_I.Part_1.part_28;
import java.util.Scanner;
public class Positivity {
    public static void main(String[] args)
    {
        System.out.println("Give a number:");
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        if(n>0)
        {
            System.out.println("The number is positive.");
        }
        else
        {
            System.out.println("The number is not positive.");
        }
    }
}

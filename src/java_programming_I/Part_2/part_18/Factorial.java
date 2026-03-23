package java_programming_I.Part_2.part_18;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args)
    {
        System.out.print("Give a number: ");
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        int factorial = 1;
        for(int i=1; i<=num; i++)
        {
            factorial*=i;
        }
        System.out.println("Factorial: " + factorial);
    }
}

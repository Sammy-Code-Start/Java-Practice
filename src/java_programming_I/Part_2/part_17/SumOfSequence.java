package java_programming_I.Part_2.part_17;
import java.util.Scanner;
public class SumOfSequence {
    public static void main(String[] args)
    {
        System.out.print("Last number?");
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        int sum = 0;
        for(int i = 0; i<=num; i++)
        {
            sum+=i;
        }
        System.out.println("The sum is " + sum);
    }
}

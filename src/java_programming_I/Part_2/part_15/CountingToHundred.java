package java_programming_I.Part_2.part_15;
import java.util.Scanner;
public class CountingToHundred {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        for(int i=num; i<=100; i++)
        {
            System.out.println(i);
        }
    }
}

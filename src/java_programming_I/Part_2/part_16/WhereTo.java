package java_programming_I.Part_2.part_16;
import java.util.Scanner;
public class WhereTo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Where to?");
        int num = Integer.valueOf(sc.nextLine());
        for(int i=01; i<=num; i++)
        {
            System.out.println(i);
        }
        //Part 1 ends

    }
}

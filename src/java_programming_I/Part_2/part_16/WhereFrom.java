package java_programming_I.Part_2.part_16;
import java.util.Scanner;
public class WhereFrom {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Where to?");
        int num_end = Integer.valueOf(sc.nextLine());
        System.out.print("Where from?");
        int num_begin = Integer.valueOf(sc.nextLine());
        if(num_begin<=num_end)
        {
            for(int i=num_begin; i<=num_end; i++)
            {
                System.out.println(i);
            }
        }
        //Part 2 ends

    }
}

package java_programming_I.Part_2.part_08;
import java.util.Scanner;
public class NumberOfNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true)
        {
            System.out.println("Give a number:");
            int num = Integer.valueOf(sc.nextLine());
            if(num == 0)
            {
                break;
            }
            else
            {
                count+=1;
                continue;
            }
        }
        System.out.println("Number of numbers: " + count);
    }
}

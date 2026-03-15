package java_programming_I.Part_2.part_04;
import java.util.Scanner;
public class ComparingNumbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int first_num = Integer.valueOf(sc.nextLine());
        int second_num = Integer.valueOf(sc.nextLine());
        if(first_num>second_num)
        {
            System.out.println(first_num + " is greater than " + second_num + ".");
        }
        else if(first_num<second_num)
        {
            System.out.println(first_num + " is smaller than " + second_num + ".");
        }
        else
        {
            System.out.println(first_num + " is equal to " + second_num + ".");
        }
    }
}

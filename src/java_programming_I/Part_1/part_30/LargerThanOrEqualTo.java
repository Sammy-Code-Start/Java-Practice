package java_programming_I.Part_1.part_30;
import java.util.Scanner;
public class LargerThanOrEqualTo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the first number:");
        int first_num = Integer.valueOf(sc.nextLine());
        System.out.println("Give the second number:");
        int second_num = Integer.valueOf(sc.nextLine());
        int max_num = 0;
        if(first_num!=second_num)
        {
            max_num = first_num>second_num?first_num:second_num;
            System.out.println("Greater number is: " + max_num);
        }
        else
        {
            System.out.println("The numbers are equal!");
        }
    }
}

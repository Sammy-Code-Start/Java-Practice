package java_programming_I.Part_2.part_19;
import java.util.Scanner;
public class Reading {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give numbers:");
        int num = 0;
        while(true)
        {
            num = Integer.valueOf(sc.nextLine());
            if(num == -1)
            {
                System.out.println("Thx! Bye!");
                break;
            }
            else
            {
                continue;
            }
        }
    }
}

package java_programming_I.Part_2.part_19;
import java.util.Scanner;
public class EvenAndOdd {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give numbers:");
        int num = 0, sum = 0, count = 0, even_count = 0, odd_count = 0;
        double average = 0.0;
        while(true)
        {
            num = Integer.valueOf(sc.nextLine());
            if(num == -1)
            {
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + sum);
                System.out.println("Numbers: " + count);
                average = (double)sum/count;
                System.out.println("Average: " + average);
                System.out.println("Even: " + even_count);
                System.out.println("Odd: " + odd_count);
                break;
            }
            else
            {
                sum+=num;
                count +=1;
                if(num%2==1)
                {
                    odd_count +=1;
                }
                else
                {
                    even_count+=1;
                }
                continue;
            }
        }
    }
}

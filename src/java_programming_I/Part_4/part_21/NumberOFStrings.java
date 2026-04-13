package java_programming_I.Part_4.part_21;
import java.util.Scanner;
public class NumberOFStrings {
    public static void main(String[] args)
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String line = sc.nextLine();
            if(line.equals("end"))
            {
                break;
            }
            count+=1;
        }
        System.out.println(count);
    }
}

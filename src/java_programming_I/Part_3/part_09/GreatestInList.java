package java_programming_I.Part_3.part_09;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class GreatestInList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true)
        {
            int num = Integer.valueOf(sc.nextLine());
            if(num == -1)
            {
                break;
            }

            numbers.add(num);
        }
        int max = numbers.get(0);
        for(int i=1; i<numbers.size(); i++)
        {
            if(max<numbers.get(i))
            {
                max = numbers.get(i);
            }
        }

        System.out.println("The greatest number: " + max);
    }
}

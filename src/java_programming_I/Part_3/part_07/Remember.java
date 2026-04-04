package java_programming_I.Part_3.part_07;
import java.util.Scanner;
import java.util.ArrayList;
public class Remember {
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

        //we got the user to enter all the numbers.
        //Now we need to print all these numbers.

        for(int i=0; i<numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }
    }
}

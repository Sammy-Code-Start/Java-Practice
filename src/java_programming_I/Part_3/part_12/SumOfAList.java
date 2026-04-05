package java_programming_I.Part_3.part_12;
import java.util.Scanner;
import java.util.ArrayList;
public class SumOfAList {
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

        //Using a for-each Loop
        int sum = 0;
        for(var x : numbers) // int x : numbers
        {
            sum +=x;
        }

        System.out.println("Sum: " + sum);
    }
}

/*
import java.util.Scanner;
import java.util.ArrayList;
public class SumOfAList {
    public static void main(String[] args)
    {

    }
}
 */
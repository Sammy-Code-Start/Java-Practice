package java_programming_I.Part_2.part_33;
import java.util.ArrayList;
import java.util.Scanner;
public class AdvancedAstrology {
    public static void printSpaces(int number)
    {
        for(int i=0; i<number; i++)
        {
            System.out.print(" ");
        }
    }
    public static void printStars(int num)
    {
        for(int i=0; i<num; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    public static void printTriangle(int size)
    {
        int spaces = size-1;
        for(int i=1; i<=size; i++)
        {
            printSpaces(spaces);
            printStars(i);
            spaces-=1;
        }
    }
    public static void christmasTree(int height)
    {
        int spaces = height-1;
        for(int i=1; i<height; i++)
        {
            printSpaces(spaces);
            printStars(i*2-1);
            spaces-=1;
        }
        //for printing the base
        spaces = height*2-1;
        spaces = spaces - 3;
        spaces = spaces/2;
        for(int i=0; i<2; i++)
        {
            printSpaces(spaces);
            printStars(3);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while(true)
        {
            int num = Integer.valueOf(sc.nextLine());
            if(num<=0)
            {
                break;
            }

            numbers.add(num);
        }

        //Part 1 - does not require to print anything
        //Part 2
        for(int x: numbers)
        {
            printTriangle(x);
        }
        //Part 3
        for(int x : numbers)
        {
            christmasTree(x);
        }

    }
}

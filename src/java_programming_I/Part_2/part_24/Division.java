package java_programming_I.Part_2.part_24;
import java.util.Scanner;
public class Division {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        division(Integer.valueOf(sc.nextLine()), Integer.valueOf(sc.nextLine()));
    }

    public static void division(int numerator, int denominator)
    {
        System.out.println((double)numerator/denominator);
    }
}

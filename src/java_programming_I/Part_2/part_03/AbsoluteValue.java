package java_programming_I.Part_2.part_03;
import java.util.Scanner;
public class AbsoluteValue {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = Integer.valueOf(sc.nextLine());
        int abs_num = (num>0)? num:(num*-1);
        System.out.println(abs_num);
    }
}

package java_programming_I.Part_2.part_05;
import java.util.Scanner;
public class CarryOn {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String carry_on = "";

//        do {
//            System.out.println("Shall we carry on?");
//            carry_on = scanner.nextLine();
//        }
//        while(!(carry_on.equals("no")));

        while(!(carry_on.equals("no")))
        {
            System.out.println("Shall we carry on?");
            carry_on = scanner.nextLine();
        }
    }
}

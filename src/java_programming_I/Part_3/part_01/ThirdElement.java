package java_programming_I.Part_3.part_01;
import java.util.ArrayList;
import java.util.Scanner;
public class ThirdElement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
         while(true)
         {
             String name = sc.nextLine();
             if(name.equals(""))
             {
                 break;
             }

             names.add(name);
         }

        System.out.println(names.get(2));
    }
}

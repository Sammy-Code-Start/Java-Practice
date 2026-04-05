package java_programming_I.Part_3.part_14;
import java.util.Scanner;
import java.util.ArrayList;
public class OnList {
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

        System.out.print("Search for? " );
        String search_name = sc.nextLine();
        if(names.contains(search_name))
        {
            System.out.println(search_name + " was found!");
        }
        else
        {
            System.out.println(search_name + " was not found!");
        }

    }
}

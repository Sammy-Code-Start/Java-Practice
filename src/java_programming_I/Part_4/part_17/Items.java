package java_programming_I.Part_4.part_17;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Items {
    private String item_name;
    private String time;
    public Items(String name)
    {
        this.item_name = name;
        LocalDateTime obj = LocalDateTime.now();
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        this.time = obj.format(form);
    }
    public String toString()
    {
        return (item_name + " (created at " + time + ")");
    }

    public static void main(String[] args)
    {
        List<Items> items = new ArrayList<>();
//        List<LocalDateTime> times = new ArrayList<>();
//        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

//        LocalDateTime obj = LocalDateTime.now();
//        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
//        obj.format(form);
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.print("Name: ");
            String item = sc.nextLine();
            if(item.equals(""))
            {
                break;
            }

            items.add(new Items(item));
//            times.add(LocalDateTime.now()); // (LocalDateTime.now()).format(form) is of String format
        }
        for(int i=0; i<items.size(); i++)
        {
            System.out.println(items.get(i));
//            System.out.println("(created at: " + (times.get(i)).format(form) + ")");
        }
    }
}

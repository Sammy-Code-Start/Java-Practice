package java_programming_I.Part_4.part_19;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class TV {
    private String name;
    private int duration;
    public TV(String show_name, int time)
    {
        name = show_name;
        duration = time;
    }
    public int getDuration()
    {
        return duration;
    }
    public String toString()
    {
        return (name + ", " + duration + " minutes");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<TV> shows = new ArrayList<>();
        while(true)
        {
            System.out.print("Name: ");
            String show_name = sc.nextLine();
            if(show_name.equals(""))
            {
                break;
            }
            System.out.print("Duration: ");
            int time = Integer.valueOf(sc.nextLine());
            shows.add(new TV(show_name, time));
        }
        System.out.print("Program's maximum duration? ");
        int max_time = Integer.valueOf(sc.nextLine());
        for(TV x : shows)
        {
            if(x.getDuration()<=max_time)
            {
                System.out.println(x);
            }
        }
    }
}

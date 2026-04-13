package java_programming_I.Part_4.part_20;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Books {
    private String name;
    private int pages;
    private int year;
    public Books(String name, int pages, int year)
    {
        this.name = name;
        this.pages = pages;
        this.year = year;
    }

    public String getName() {
        return name;
    }
    public int getPages()
    {
        return pages;
    }
    public int getYear()
    {
        return year;
    }
    public String toString()
    {
        return (getName() + ", " + getPages() + ", " + getYear());
    }
    public static void main(String[] args)
    {
        List<Books> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            System.out.print("Title: ");
            String title = sc.nextLine();
            if(title.equals(""))
            {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());
            System.out.print("Publication Year: ");
            int year = Integer.valueOf(sc.nextLine());
            books.add(new Books(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String info = sc.nextLine();
        if(info.equalsIgnoreCase("everything"))
        {
            for (Books x: books)
            {
                System.out.println(x);
            }
        }
        else if(info.equalsIgnoreCase("name"))
        {
            for (Books x: books)
            {
                System.out.println(x.getName());
            }
        }
        else if(info.equalsIgnoreCase("pages"))
        {
            for (Books x: books)
            {
                System.out.println(x.getName() + ", " + x.getPages());
            }
        }
        else if(info.equalsIgnoreCase("year"))
        {
            for (Books x: books)
            {
                System.out.println(x.getName() + ", " + x.getYear());
            }
        }
    }
}

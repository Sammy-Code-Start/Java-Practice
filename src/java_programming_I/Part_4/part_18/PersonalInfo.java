package java_programming_I.Part_4.part_18;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class PersonalInfo {
    private String first_name, last_name, identity_num;
    public PersonalInfo(String first_name, String last_name, String identity_num)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.identity_num = identity_num;
    }
    public String toString()
    {
        return (this.first_name + " " + this.last_name);
    }
    public static void main(String[] args)
    {
        List<PersonalInfo> persons = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        while(true)
        {
            System.out.print("First Name: ");
            String first_name = sc.nextLine();
            if(first_name.equals(""))
            {
                break;
            }
            System.out.print("Last Name: ");
            String last_name = sc.nextLine();
            System.out.print("Identification Number: ");
            String identity_num = sc.nextLine();
            persons.add(new PersonalInfo(first_name, last_name, identity_num));
        }
        for(int i=0; i<persons.size(); i++)
        {
            System.out.println(persons.get(i));
        }
    }
}

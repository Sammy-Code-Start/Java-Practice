package java_programming_I.Part_4.part_13;

public class Agent {
    private String firstName, lastName;
    public Agent(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString()
    {
        return ("My name is " + lastName + ", " + firstName + " " + lastName);
    }
    public static void main(String[] args)
    {
        Agent bond = new Agent("James", "Bond");

        bond.toString(); // prints nothing
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
    }
}

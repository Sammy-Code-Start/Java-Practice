package java_programming_I.Part_4.part_06;

public class Door {
    public Door() // empty constructor
    {

    }
    public void knock()
    {
        System.out.println("Who's there ?");
    }
    public static void main(String[] args)
    {
        Door alexander = new Door();
        alexander.knock();
    }
}

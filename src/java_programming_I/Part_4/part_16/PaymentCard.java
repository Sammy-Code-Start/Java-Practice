package java_programming_I.Part_4.part_16;
import java.util.Scanner;
public class PaymentCard {
    private double balance;
    public PaymentCard(double openingBalance)
    {
        this.balance = openingBalance;
    }
    public void eatAffordably()
    {
        if(balance>=2.6)
        balance-=2.6;
    }
    public void eatHeartily()
    {
        if(balance>=4.6)
        balance-=4.6;
    }
    public void addMoney(double amount)
    {
        if(amount>0)
        balance = (balance+amount)>150 ? 150 : (balance+amount);
    }
    public String toString()
    {
        return String.format("The card has a balance of %.2f euros", balance);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Part 1
        int balance = Integer.valueOf(sc.nextLine());
        PaymentCard card = new PaymentCard(balance);
        System.out.println(card.toString());
        //We can also write - System.out.println(card); - Prints the toString() function because
        // Your method: public String toString() is overriding the default toString() method from Object.

        // Part 2
        card.eatAffordably();
        System.out.println(card); // or System.out.println(card.toString());

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card); // or System.out.println(card.toString());

        // Part 3 - The functions do not print any negative balance

        // Part 4
        System.out.print("Enter money to be added: ");
        double amt = Double.valueOf(sc.nextLine());
        card.addMoney(amt);
        System.out.println(card);

        // Part 5 - the addMoney() function was made to not add any negative value

        // part 6
        /*Write code in the main method of the MainProgram class that contains the following sequence of events:
            Create Paul's card. The opening balance of the card is 20 euros
            Create Matt's card. The opening balance of the card is 30 euros
            Paul eats heartily
            Matt eats affordably
            The cards' values are printed (each on its own line, with the cardholder name at the beginning of it)
            Paul tops up 20 euros
            Matt eats heartily
            The cards' values are printed (each on its own line, with the cardholder name at the beginning of it)
            Paul eats affordably
            Paul eats affordably
            Matt tops up 50 euros
            The cards' values are printed (each on its own line, with the cardholder name at the beginning of it)
         */
        System.out.print("Enter the opening Balance for Paul's Card: ");
        double paul_bal = Double.valueOf(sc.nextLine());
        PaymentCard Paul_Card = new PaymentCard(paul_bal);
        System.out.print("Enter the opening Balance for Matt's Card: ");
        double matt_bal = Double.valueOf(sc.nextLine());
        PaymentCard Matt_Card = new PaymentCard(matt_bal);
        Paul_Card.eatHeartily();
        Matt_Card.eatAffordably();
        System.out.println("Paul: " + Paul_Card);
        System.out.println("Matt: " + Matt_Card);
        Paul_Card.addMoney(20);
        Matt_Card.eatHeartily();
        System.out.println("Paul: " + Paul_Card);
        System.out.println("Matt: " + Matt_Card);
        Paul_Card.eatAffordably();
        Paul_Card.eatAffordably();
        Matt_Card.addMoney(50);
        System.out.println("Paul: " + Paul_Card);
        System.out.println("Matt: " + Matt_Card);
    }
}

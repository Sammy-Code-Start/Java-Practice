package java_programming_I.Part_3.part_26;
import java.util.Scanner;
public class FirstWords {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            String sentence = sc.nextLine();
            if(sentence.equals(""))
            {
                break;
            }
            String[] split_sentence = sentence.split(" ");
            System.out.println(split_sentence[0]);
        }
    }
}

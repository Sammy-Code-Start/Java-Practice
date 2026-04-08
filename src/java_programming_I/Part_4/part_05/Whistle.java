package java_programming_I.Part_4.part_05;

public class Whistle {
    private String sound;
    public Whistle(String whistleSound)
    {
        sound = whistleSound;
    }
    public void sound()
    {
        System.out.println(sound);
    }

    public static void main(String[] args)
    {
        Whistle duckWhistle = new Whistle("Qwack");
        Whistle roosterWhistle = new Whistle("Crow");

        duckWhistle.sound();
        roosterWhistle.sound();
    }
}

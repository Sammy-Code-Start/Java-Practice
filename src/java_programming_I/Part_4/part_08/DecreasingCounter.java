package java_programming_I.Part_4.part_08;

public class DecreasingCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        this.value -= (this.value-1 >= 0 ? 1 : 0);
    }
    // and the other methods go here
    public void reset()
    {
        this.value = 0;
    }

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        DecreasingCounter counter1 = new DecreasingCounter(2);

        counter1.printValue();

        counter1.decrement();
        counter1.printValue();

        counter1.decrement();
        counter1.printValue();

        DecreasingCounter counter2 = new DecreasingCounter(100);

        counter2.printValue();

        counter2.reset();
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();
    }
}

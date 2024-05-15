import java.util.*;
public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>();
        Random random = new Random();

        // Adding 9000 random elements
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(random.nextInt(1000)); // Adjust range according to your needs
            table.put(key, i);
        }

        // Printing number of elements in each bucket
        table.printBucketSizes(10);
    }
}
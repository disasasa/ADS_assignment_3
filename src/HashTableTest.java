import java.util.*;
class HashTableTest {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Integer> table = new MyHashTable<>();
        Random random = new Random();

        // Adding 10000 random elements
        for (int i = 0; i < 10000; i++) {
            MyTestingClass key = new MyTestingClass(random.nextInt(1000)); // Adjust range according to your needs
            table.put(key, i);
        }

        // Printing number of elements in the first 10 buckets
        table.printBucketSizes(10);
    }
}
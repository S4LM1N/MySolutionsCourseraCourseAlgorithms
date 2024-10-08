package Module4;

import edu.princeton.cs.algs4.StdIn;

public class Permutation {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]);
        RandomizedQueue<String> strings = new RandomizedQueue<String>();
        while (!StdIn.isEmpty()) {
            strings.enqueue(StdIn.readString());
        }
        for (int i = 0; i < k; i++) {
            System.out.println(strings.dequeue());
        }
    }
}

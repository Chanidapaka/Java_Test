package sit.int202;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add((int) (Math.random()*100));
        }

        Set<Integer> copy = new TreeSet<>(set);
        for (int i = 0; i < 20; i++) {
            copy.add((int) (Math.random()*100));
        }
    }

}

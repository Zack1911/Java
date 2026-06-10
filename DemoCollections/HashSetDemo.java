package DemoCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet — no duplicates, no guaranteed order
        HashSet<String> set = new HashSet<>();
        set.add("India");
        set.add("America");
        set.add("China");
        set.add("France");
        set.add("Germany");
        System.out.println("Countries are :" + set);
        set.add("India");
        System.out.println("Countries after adding India again:" + set);

        System.out.println("The size of set is:" + set.size()); // It excludes the duplicate values

        System.out.println("Is India present in the set:" + set.contains("India")); // checks if an element is present

        System.out.println(set.remove("China")); // removes the element
        System.out.println("set after removing China:" + set);

        for (String l : set) {
            System.out.println(l);
        }

        // LinkedHashSet — no duplicates, insertion order guaranteed
        // INSERTION order-vise
        LinkedHashSet<String> lset = new LinkedHashSet<>();
        lset.add("Apple");
        lset.add("Banana");
        lset.add("Cherry");
        lset.add("Date");
        lset.add("Elderberry");
        System.out.println("Initially Fruits are:" + lset);

        lset.add("Apple"); // adds only if not present, ignores if present
        lset.add("Fig"); // adds this new element
        System.out.println("Fruits after adding Apple again and Fig:" + lset);

        lset.remove("Banana"); // removes element
        System.out.println("Fruits after removing Banana:" + lset);

        for (String ls : lset) {
            System.out.println(ls);
        }

        // TreeSet — no duplicates, natural order (ascending for numbers)
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(11);
        ts.add(25);
        ts.add(6);
        ts.add(32);
        ts.add(19);
        System.out.println("Set in Natural order (Ascending order):" + ts);

        ts.add(32);
        System.out.println("TreeSet after adding 32 again : " + ts); // it will not add because it already exists
        ts.remove(6);
        System.out.println("TreeSet after removing 6 : " + ts);

        for (Integer tsValue : ts) {
            System.out.println(tsValue);
        }
        System.out.println("First element:" + ts.first()); // first element
        System.out.println("Last element:" + ts.last()); // last element
        System.out.println("Element just below 25:" + ts.lower(25)); // element just below 25
        System.out.println("Element just above 25:" + ts.higher(25)); // element just above 25
        System.out.println("Elements before 25 (excluding 25):" + ts.headSet(25)); // elements before 25
        System.out.println("Elements after 25 (including 25):" + ts.tailSet(25)); // elements after 25 including 25
        System.out.println("Elements after 25 (exclusive):" + ts.tailSet(25, false)); // elements after 25 excluding 25
        System.out.println("Elements before 25 (exclusive):" + ts.headSet(25, false)); // elements before 25 excluding
                                                                                       // 25
        System.out.println("Elements before 25 (inclusive):" + ts.headSet(25, true)); // elements before 25 including 25
        System.out.println("Elements after 25 (inclusive):" + ts.tailSet(25, true)); // elements after 25 including 25

        System.out.println(ts.pollFirst()); // removes and returns the first element
        System.out.println(ts.pollLast()); // removes and returns the last element
        System.out.println(ts.pollFirst()); // removes and returns the first element
        System.out.println(ts.pollLast()); // removes and returns the last element
        System.out.println(ts);

    }
}

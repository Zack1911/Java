package DemoCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> Bhasa = new ArrayList<>();
        ArrayList<Integer> Bhasa1 = new ArrayList<>(20);
        ArrayList<String> Bhasa3 = new ArrayList<>();

        Bhasa.add("Hindi");
        Bhasa.add("English");
        Bhasa.add("German");
        Bhasa.add("Mahgayi");
        Bhasa.add("Bhojpuri");

        ArrayList<String> Bhasa2 = new ArrayList<>(Bhasa);
        Bhasa2.remove(0);
        Bhasa2.set(2, "Farsi");

        for (String a : Bhasa) {
            System.out.println(a);
        }

        Bhasa1.add(1210);
        Bhasa1.add(321);
        Bhasa1.add(332);
        Bhasa1.add(33423);
        Bhasa1.add(33123);

        // Collections.sort(Bhasa1);

        Collections.sort(Bhasa1, Collections.reverseOrder());

        for (Integer b : Bhasa1) {
            System.out.println(b);
        }

        Bhasa2.add("Jay");

        for (String c : Bhasa2) {
            System.out.println(c);
        }
        // Mathos used in ArrayList
        // add() Add element
        // get() Access element
        // set() Update element
        // remove() Delete element
        // size() Number of elements
        // clear() Remove all elements
        // contains() Check element exists

    }
}

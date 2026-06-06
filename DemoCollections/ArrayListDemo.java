package DemoCollections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> Bhasa = new ArrayList<>();
        ArrayList<String> Bhasa1 = new ArrayList<>(20);
        ArrayList<String> Bhasa2 = new ArrayList<>(Bhasa);
        ArrayList<String> Bhasa3 = new ArrayList<>();

        Bhasa.add("Hindi");
        Bhasa.add("English");
        Bhasa.add("German");
        Bhasa.add("Mahgayi");
        Bhasa.add("Bhojpuri");

        for(String a : Bhasa){
            System.out.println(a);
        }


        

        
    }
}

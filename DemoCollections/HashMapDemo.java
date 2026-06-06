package DemoCollections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        marks.put("Math", 90);
        marks.put("Science", 80);
        marks.put("English", 85);
        marks.put("Hindi", 100);
        marks.put("German", 14);

        System.out.println(marks);

        for (String k : marks.keySet()) { // for looping keys
            System.out.println(k);
        }

        for (Integer v : marks.values()) { // for looping values
            System.out.println(v);
        }

        marks.forEach((k, v) -> System.out.println(k + "::" + v)); // lambda expression

        System.out.println(marks.get("Math"));
        System.out.println(marks.get("French"));
        System.out.println(marks.getOrDefault("French", 0));
        System.out.println(marks.containsValue(80));
        System.out.println(marks.containsKey("French"));
        System.out.println(marks.containsKey("German"));

        System.out.println(marks.size());

        marks.remove("German", 100); // remove only when the key and value matches
        marks.remove("Hindi"); // remove by key
        System.out.println(marks);

        marks.putIfAbsent("Sanskrit", 77);
        System.out.println(marks);

        for (Map.Entry<String, Integer> search : marks.entrySet()) { // for looping keys and values both
            System.out.println(search.getKey() + " " + search.getValue());
        }

        // merge — adds if not exists, combines if exists
        marks.merge("German", 100, (oldValue, newValue) -> oldValue + newValue);
        System.out.println(marks);

        // compute — only updates if key exists
        marks.compute("German", (k, v) -> v == null ? 0 : v + 10);
        System.out.println(marks);

    }
}

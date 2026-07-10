import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

public class LearnJava1 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Gablu");
        names.add("hablu");
        names.add("habibi");
        names.add("lali");
        names.add("pili");
        names.add("halulu");

        int count = 0;

        // Count names starting with 'h'
        for (int i = 0; i < names.size(); i++) {

            String actual = names.get(i);

            if (actual.startsWith("h")) {
                count++;
            }
        }

        System.out.println("Count = " + count);

        StreamFilter();
        StreamOfExample();
        SteamUpperCase();
    }

    // Stream API Example
    public static void StreamFilter() {

        ArrayList<String> name = new ArrayList<>();

        name.add("kopi");
        name.add("popiilll");
        name.add("nopi");
        name.add("poli");
        name.add("tupiiiii");

        // Count strings starting with p
        long display = name.stream()
                .filter(check -> check.startsWith("p"))
                .count();

        System.out.println("Strings starting with p = " + display);

        // First string whose length is greater than 4
        name.stream()
                .filter(check -> check.length() > 4)
                .limit(1)
                .forEach(System.out::println);

        // Equivalent using for loop
        for (int i = 0; i < name.size(); i++) {

            if (name.get(i).length() > 4) {
                System.out.println("Using for loop: " + name.get(i));
            }
        }
    }

    // Stream.of() Example
    public static void StreamOfExample() {

        long data = Stream.of(
                "Alipta",
                "Balipta",
                "Salipta",
                "Nulipta",
                "Alupi",
                "Auli")
                .filter(check -> check.startsWith("A"))
                .count();

        System.out.println("Strings starting with A = " + data);
    }

    // Map, Sorted, Concat and anyMatch Example
    public static void SteamUpperCase() {

        // Convert to Uppercase
        Stream.of("Apple", "Barka Apple", "Chotka Apple", "Dosarka apple", "Ek aur Apple")
                .filter(check -> check.endsWith("e"))
                .map(check -> check.toUpperCase())
                .forEach(System.out::println);

        System.out.println("-------------------------");

        List<String> storesData = Arrays.asList(
                "hkjgf",
                "jvjhhgf",
                "iouuty",
                "ewtrdhf",
                "pkjhjv");

        // Sort and convert to uppercase
        storesData.stream()
                .filter(check -> check.endsWith("f"))
                .sorted()
                .map(check -> check.toUpperCase())
                .forEach(System.out::println);

        System.out.println("-------------------------");

        // Merge two streams
        Stream<String> stream1 = Stream.of(
                "Apple",
                "Barka Apple",
                "Chotka Apple",
                "Dosarka apple",
                "Ek aur Apple");

        Stream<String> stream2 = storesData.stream();

        Stream<String> streamConcat = Stream.concat(stream1, stream2);

        boolean flag = streamConcat.anyMatch(check -> check.equalsIgnoreCase("Apple"));

        Assert.assertTrue(flag);

        System.out.println("Apple Present? " + flag);
    }
}
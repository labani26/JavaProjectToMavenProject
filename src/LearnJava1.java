import java.util.ArrayList;
import java.util.stream.Stream;

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

        // Count names starting with 'h' using a for loop
        for (int i = 0; i < names.size(); i++) {

            String actual = names.get(i);

            if (actual.startsWith("h")) {
                count++;
            }
        }

        System.out.println("Count = " + count);

        // Call the methods
        StreamFilter();
        StreamOfExample();
    }

    // Stream API Example
    public static void StreamFilter() {

        ArrayList<String> name = new ArrayList<>();

        name.add("kopi");
        name.add("popiilll");
        name.add("nopi");
        name.add("poli");
        name.add("tupiiiii");

        // Count strings starting with 'p'
        long display = name.stream()
                           .filter(check -> check.startsWith("p"))
                           .count();

        System.out.println("Strings starting with p = " + display);

        // Print the first string whose length is greater than 4
        name.stream()
            .filter(check -> check.length() > 4)
            .limit(1)
            .forEach(System.out::println);
        //forEach() means: "Do something with each element in the stream."
        
        
        // Equivalent using a for loop
        for (int i = 0; i < name.size(); i++) {  	
        	//i < names.size() → Continue until the last index.
			//names.get(i) means: Get the element stored at index i.

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
}
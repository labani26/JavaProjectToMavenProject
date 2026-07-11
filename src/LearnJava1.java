import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class LearnJava1 {

    public static void main(String[] args) {

 //   	ArrayList<String> - It is a class that implements List.
  //                     It behaves exactly like a List regarding streams.
    	
        ArrayList<String> names = new ArrayList<>();

        names.add("Gablu");
        names.add("hablu");
        names.add("habibi");
        names.add("lali");
        names.add("pili");
        names.add("halulu");

        int count = 0;

        // Count names starting with 'h'
        for (String actual : names) {
            if (actual.startsWith("h")) {
                count++;
            }
        }

        System.out.println("Count = " + count);

        StreamFilter();
        StreamOfExample();
        StreamUpperCase();
        StreamCollector();
    }

    // Stream Filter Example
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
                .forEach(check -> System.out.println(check));

        // Using for loop
        for (String s : name) {
            if (s.length() > 4) {
                System.out.println("Using for loop: " + s);
                
            }
        }
    }

    // Stream.of() Example
    public static void StreamOfExample() {

    	//long can store much bigger number then int
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
    public static void StreamUpperCase() {

        // Convert to Uppercase
    	
//    	Stream<String> - This does not store data like a collection.
//          It is a pipeline that processes data.
//          There is no .stream() method because it is already a stream.   	
        Stream<String> data = Stream.of(
                "Apple",
                "Barka Apple",
                "Chotka Apple",
                "Dosarka apple",
                "Ek aur Apple");
        
//        data type	Use
//        List<String> data	data.stream() ✅
//        ArrayList<String> data	data.stream() ✅
//        Set<String> data	data.stream() ✅
//        Stream<String> data	data (not data.stream()) ✅
        
//        data.forEach(System.out::println);   // Stream is consumed
//        Stream.concat(storesData.stream(), data); // ❌ IllegalStateException

        data.filter(check -> check.endsWith("e"))
        .map(check -> check.toUpperCase())
        .forEach(check -> System.out.println(check));
        System.out.println("-------------------------");

        //List<String> - Stores elements in memory. Can access elements multiple times. Has a .stream() method.
        
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
                .forEach(check -> System.out.println(check));

        System.out.println("-------------------------");
// Create a NEW stream because streams cannot be reused
        
//        Stream<String> - This does not store data like a collection.
//                         It is a pipeline that processes data.
//                         There is no .stream() method because it is already a stream.
        
// Stream does not store elements in a way that lets you access them by index. 
        
        Stream<String> data1 = Stream.of(
                "Apple",
                "Barka Apple",
                "Chotka Apple",
                "Dosarka apple",
                "Ek aur Apple");

        Stream<String> streamConcat = Stream.concat(storesData.stream(), data1);

        boolean flag = streamConcat.anyMatch(check -> check.equalsIgnoreCase("Apple"));

        Assert.assertTrue(flag);

        System.out.println("Apple Present? " + flag);
        System.out.println("-------------------------");
    }
    
    public static void StreamCollector() {
    	
    Stream<String> data2 = Stream.of(
    		"hgAFXHG",
    		"KJDCHJASMC",
    		"JHxbzkjaxoai",
    		"asjgxKXHKA",
    		"POUPIHCS");
    
   
	data2.filter(check -> check.endsWith("i")).map(check->check.toUpperCase())
	.collect(Collectors.toList())
   .forEach(check ->System.out.println(check));
	System.out.println("-------------------------");
	
	List<String> data3 = Arrays.asList(
            "hkjgf",
            "jvjhhgf",
            "iouuty",
            "ewtrdhf",
            "pkjhjv");
	
	List<String> result = data3.stream().filter(check -> check.endsWith("f")).map(check->check.toUpperCase())
	.sorted().collect(Collectors.toList());
	System.out.println(result + result.get(2));
	
//collect(Collectors.toList()) - It takes all the elements from a Stream and stores them into a List.
	
	System.out.println("-------------------------");
	
	
	List<String> data4 = Stream.of("hkjgf","jvjhhgf","iouuty","ewtrdhf","pkjhjv")
			.filter(check -> check.endsWith("f"))
			.sorted()
			.map(check->check.toUpperCase())
			.collect(Collectors.toList());
	System.out.println(data4.get(2));
			
	
	List<Integer> values1 = Arrays.asList(4,4,36,6,6,8,9);
	
	List<Integer> result1 = values1.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(result1);
	System.out.println(result1.get(2));
    
    }
}

//Set<String>
//A Set also stores data.
//
//Difference from List:
//
//Doesn't allow duplicate values.
//Order is not guaranteed (for HashSet).
//
//It also has .stream().
//
//data.stream().forEach(System.out::println);
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DemoArrayList {

    public static void main(String[] args) {

    	//ArrayList
        ArrayList<String> a = new ArrayList<String>();

        a.add("Labani");
        a.add("Sardar");
        a.add("Test");
        a.add("12345");

        System.out.println(a.remove(2));
        System.out.println(a.get(0));
        System.out.println("__________");
        //for Array List we have to use size instead of length
        for(int i = 0; i < a.size(); i++) {
        	//for Array List we have to use get
        	System.out.println(a.get(i));
        }
        System.out.println("__________");
        for(String test : a ) {
        	System.out.println(test);
        }
        System.out.println("__________");
        //convert normal Array to ArrayList
        String[] names = {"taplu", "gaplu", "dhaplu"};

        List<String> nameArrayList = new ArrayList<>(Arrays.asList(names));

        System.out.println(nameArrayList.contains("1"));

    }
}
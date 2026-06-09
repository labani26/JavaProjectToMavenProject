public class DemoDataType {

    public static void main(String[] args) {

        int Number = 5;
        float decimal = 5.8f;
        char letter = 'y';
        double dec = 7.9;
        boolean myCard = true;

        // Array
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[3] = 4;
        arr[4] = 8;
        arr[5] = 9;

        int[] arr1 = {1, 4, 8, 5, 7, 0, 9};

        // Print arr1 using for loop
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // String array
        String[] name = {"ruch", "puchi", "nuchi"};

        // Print String array using normal for loop
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }

        // Print String array using enhanced for loop
        for (String test : name) {
            System.out.println(test + " String name");
        }

        // ----------------------------
        // Numbers array example
        // ----------------------------

        // Create the array only once
        int[] numbers = {10, 20, 30, 40, 50};

        // First element
        System.out.println("First element: " + numbers[0]);

        // Last element
        System.out.println("Last element: " + numbers[numbers.length - 1]);
        
//        numbers[numbers.length - 1] - numbers.length is 5.
//        		The last index is 5 - 1 = 4.
//        		numbers[4] gives the last element (50).

        // Print array in reverse order
   
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Array in reverse order:"+numbers[i]);
        }

        // Count total number of elements
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            count++;
        }

        System.out.println("Total number of elements: " + count);
    }
}
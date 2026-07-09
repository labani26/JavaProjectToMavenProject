import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.Now;

public class LearnJava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names = new ArrayList<String>();
		names.add("Gablu");
		names.add("hablu");
		names.add("habibi");
		names.add("lali");
		names.add("pili");
		names.add("halulu");
		
		int count = 0;
		
		for(int i = 0; i<names.size(); i++) {
			//i < names.size() → Continue until the last index.
			//names.get(i) means: Get the element stored at index i.
			String Actual = names.get(i);
			if(Actual.startsWith("h")) {
				
				count++;
				
			}
		}
		System.out.println(count);
	}

}
  
   
   public void StreamFilter() {
	   
	   ArrayList<String> Name = new ArrayList<String>();
	   
	   Name.add("kopi");
	   Name.add("popi");
	   Name.add("nopi");
	   Name.add("poli");
	   Name.add("tupi");
	   
	   Long Display = Name.stream().filter(check -> check.startsWith("p")).count();
	   //stream = collection of string
	   //Long is a wrapper class in Java. It is the object version of the primitive data type long.
	   //long	Primitive data type	long a = 10;  Long	Wrapper class (Object)	Long b = 10L;
	   //Long - A wrapper class in Java is a class that wraps (converts) a primitive data type(like int, long, double) into an object(Student s1 = new Student();).
	   System.out.println(Display);
	   
   }


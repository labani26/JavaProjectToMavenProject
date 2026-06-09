
public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Labani";
		String s2 = "Labani";

		String s3 = new String("Labani");
		String s4 = new String("Labani");
//		s1 and s2 may refer to the same pooled string.
//		s3 and s4 are separate objects./
		
		String name = "taplu dhaplu gaplu";
		System.out.println(name.replace(" ", ""));
		
		System.out.println("-----------");
		
		String name1 = "   taplu dhaplu gaplu   ";
		System.out.println(name1.trim());
		
		System.out.println("-----------");
		
		String[] SplittedString = name.split(" ");
		System.out.println(SplittedString[0]);
		System.out.println(SplittedString[1]);
		System.out.println(SplittedString[2]);
		
		System.out.println("-----------");
		
		String[] RemoveWord = name.split("dhaplu");
		System.out.println(RemoveWord[0]);
		System.out.println(RemoveWord[1].trim());
		
		System.out.println("-----------");
		
		for(int i = 0; i < name.length(); i++) {
			
			System.out.println(name.charAt(i));
		}
		
		System.out.println("-----------");
		
		for(int i = name.length()-1 ; i >= 0 ; i-- ) {
			System.out.println(name.charAt(i));
		}
		
	}


}

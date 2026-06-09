
public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {11,22,33,44,55,66,77,88,99};
		
		//check are this multiply by 2
		
		for(int test : num) {
			
			if(test % 2 == 0) {
				
				System.out.println(test+" multiply by 2");
			}
			else {
				System.out.println(test+" not multiply by 2");
			}
			
//		for(int i = 0; i< num.length; i++) {
//			
//			if(num[i] % 2 == 0) {
//				System.out.println(num[i]+" multiply by 2");
//			}
//			else {
//				System.out.println(num[i]+" not multiply by 2");
//			}
			
			
		}
	}

}

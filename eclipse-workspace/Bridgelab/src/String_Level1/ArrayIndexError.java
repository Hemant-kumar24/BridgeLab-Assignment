package String_Level1;

public class ArrayIndexError {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		 System.out.println("\nCalling generateException():");
		 try {
			 generateArrayIndexError(arr);
		 }
		 catch(Exception e) {
			 System.out.println("Exception occurred in generateException(): " + e);
		 }
		 System.out.println("\nCalling handleException():");
		 handleException(arr);
		
	}
	public static void generateArrayIndexError(int[] arr) {
		System.out.println("access array length +1 elemet"+ arr[arr.length+1]);

	
	}
	
	public static void handleException(int[] arr) {
		try {
			System.out.println("access array length +1 elemet"+ arr[arr.length+1]);
		}
	  catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
     } catch (RuntimeException e) {
         
         System.out.println("Caught RuntimeException: " + e);
     }
	}
}
	

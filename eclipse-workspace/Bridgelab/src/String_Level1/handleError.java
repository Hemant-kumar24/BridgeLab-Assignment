package String_Level1;

public class handleError {
	public static void main(String[] args) {
		String s=null;
		try {
			System.out.println(s.length());
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Hemant");
		System.out.println("Program End without any interupt");
	}

}

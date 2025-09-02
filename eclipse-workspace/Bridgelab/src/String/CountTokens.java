package String;
import java.util.*;
public class CountTokens {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String :");
		String s1= sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s1);
		int count=st.countTokens();
		System.out.println("no.of words: "+count);
		
		
	}
}

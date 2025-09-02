package String;
import java.util.*;
public class Reverse_Word {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter String : ");
		String s= sc.nextLine();
		String[] str=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length;i++) {
			String word=str[i];
			if(i==str.length-1) {
				sb.append(reverse(word));
			}
			else {
			sb.append(reverse(word)+" ");
			}
		}
		System.out.println(sb.toString());
		
	}
	public static  String reverse(String word) {
		StringBuilder sb=new StringBuilder();
		for(int i=word.length()-1;i>=0;i--) {
			sb.append(word.charAt(i));
		}
		return sb.toString();
	}

}

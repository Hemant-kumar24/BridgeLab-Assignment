package String;
import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		if(isAnagram(s1,s2)) {
			System.out.println("Both strings are Anagram");
		}
		else {
			System.out.println("Strings are not Anagram");
		}
		
	}
	public static boolean isAnagram(String s1,String s2) {
//		if(s1.length()!=s2.length()) {
//			return false;
//		}
//		int[] count=new int[256];
//		 
//		for(int i=0;i<s1.length();i++) {
//			count[s1.charAt(i)]++;
//			count[s2.charAt(i)]--;
//		}
//		for(int val:count) {
//			if(val!=0) {
//				return false;
//			}
//		}
//		return true;
		char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare
        return Arrays.equals(arr1, arr2);
	}

}

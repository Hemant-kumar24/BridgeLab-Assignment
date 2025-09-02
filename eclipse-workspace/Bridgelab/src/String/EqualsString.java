package String;

public class EqualsString {
	public static void main(String[] args) {
		String s1="welcome";
		String s2="welcomee";
		System.out.println(compare(s1,s2));
	}
	public static boolean compare(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

}

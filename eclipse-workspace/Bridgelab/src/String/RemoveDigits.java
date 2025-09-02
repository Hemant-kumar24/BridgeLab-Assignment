package String;

public class RemoveDigits {
	public static void main(String[] args) {
		String s="he11o";
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if((ch>='A' && ch<='Z')|| (ch>='a' && ch<='z')|| ch==' ') {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
	}
}

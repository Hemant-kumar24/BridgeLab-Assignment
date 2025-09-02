package String;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s="paabbcccb";
		StringBuilder sb=new StringBuilder();
		sb.append(s.charAt(0));
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(i-1)) {
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
	


}

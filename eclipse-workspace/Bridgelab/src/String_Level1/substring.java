package String_Level1;

public class substring {
	public static void main(String[] args) {
		String s="welcome";
		System.out.println(subString(s, 0, 4));
		System.out.println("substring by built in method ");
		System.out.println(s.substring(0,4));
		
		
	}
	public static String subString(String s,int start,int end) {
		StringBuilder sb=new StringBuilder();
		for(int i=start;i<end;i++) {
			sb.append(s.charAt(i));
			
		}
		return sb.toString();
		}

}

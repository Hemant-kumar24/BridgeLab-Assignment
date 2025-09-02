package String;

public class CompressString {
	public static void main(String[] args) {
		String s="aaabbcccddde";
		StringBuilder sb=new StringBuilder();
		int count=1;
		char current=' ';
		for(int i=0;i<s.length()-1;i++) {
			current=s.charAt(i+1);
			if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
			else {
				sb.append(s.charAt(i)+""+count);
				count=1;
			}
			
		}
		sb.append(current+""+count);
		
		System.out.println(sb.toString());
	}

}

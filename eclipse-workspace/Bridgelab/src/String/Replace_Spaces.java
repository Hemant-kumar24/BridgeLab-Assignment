package String;

public class Replace_Spaces {
	public static void main(String[] args) {
		String s="hello hemant  welcome ";
//	for(int i=0;i<s.length();i++) {
//			char ch=s.charAt(i);
//			if(ch==' ') {
//				s=s.replace(ch,'_');
//			}
//		}
		s=s.replace(' ','_');
		System.out.println(s);
		
		for(int i=0;i<s.length();i++) {
			System.out.println("Ascii value of "+s.charAt(i)+" is "+(int)(s.charAt(i)));
		}
		
		
	}

}

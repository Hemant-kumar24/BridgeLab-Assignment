package String;

public class Substring {
	public static void main(String[] args) {
		String s="welcome";
		String sub="wel";
		System.out.println(contain(s,sub));
		
	}
	public static boolean contain(String s,String sub) {
		int n=s.length();
		int k=sub.length();
		for(int i=0;i<=n-k;i++) {
			if(s.substring(i,k+i).equals(sub)) {
				return true;
				
			}
		}
		return false;
	}

}

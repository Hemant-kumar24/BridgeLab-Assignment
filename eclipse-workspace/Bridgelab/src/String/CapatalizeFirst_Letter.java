package String;

public class CapatalizeFirst_Letter {
	public static void main(String[] args) {
		String s1="welcome in java class";
		StringBuilder sb=new StringBuilder();
		String[] str=s1.split(" ");
		for(String word:str) {
			sb.append(word.substring(0,1).toUpperCase());
			sb.append(word.substring(1)+" ");
		}
		System.out.println(sb.toString().trim());
	}
}

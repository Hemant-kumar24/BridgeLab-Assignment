package String_Level1;



public class UppercaseConverter {
	public static void main(String[] args) {
        String s="heLLlo";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                sb.append((char)(ch-32));
            }
            else{
                sb.append(ch);
            }

        }
        System.out.println(sb.toString());
        System.out.println("Built in string method of uppercase string");
        System.out.println(s.toUpperCase());
    }
}


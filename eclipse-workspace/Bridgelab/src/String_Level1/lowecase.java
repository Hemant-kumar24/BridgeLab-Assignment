package String_Level1;

public class lowecase {
	public static void main(String[] args) {
        String s="heLLlo";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                sb.append((char)(ch+32));
            }
            else{
                sb.append(ch);
            }

        }
        System.out.println(sb.toString());
        
        System.out.println("Built in string method of lowercase string");
        System.out.println(s.toLowerCase());
        
    }
}


import java.util.*;
public class Rectangle{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Length Of Rectangle: ");
	int length=sc.nextInt();
	System.out.println("Enter The Width Of Rectangel: ");
	int width=sc.nextInt();
	
	int result=2*(length+width);
	System.out.println("Perimeter Of Rectangle :"+result);

    }
}

import java.util.*;
public class cyclinder{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Radius Of Cylinder: ");
	int  radius=sc.nextInt();
	System.out.println("Enter Height Of Cylinder: ");
	int  height=sc.nextInt();
	Double result=Math.PI*radius*radius*height;
	System.out.println("Area of Cylinder is :"+result);

    }
}
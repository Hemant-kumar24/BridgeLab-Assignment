import java.util.Scanner;
import java.util.*;
public class circle{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Radius Of Circle: ");
	int  radius=sc.nextInt();
	Double result=Math.PI*radius*radius;
	System.out.println("Area of Circle is :"+result);

    }
}

import java.util.*;
public class simpleInterest{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Principal Amount: ");
	double  p=sc.nextDouble();
	System.out.println("Enter The Rate Of The Amount: ");
	double  r=sc.nextDouble();
	System.out.println("Enter The Time Of The Amount: ");
	double  t=sc.nextDouble();
	double result=(p*r*t)/100;
	System.out.println("Simple Interest :"+result);

    }
}
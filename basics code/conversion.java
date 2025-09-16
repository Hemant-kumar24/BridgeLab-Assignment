import java.util.Scanner;
public class conversion{
    public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Temperature In Celsius: ");
	float celsius=sc.nextFloat();
	Float result=(celsius*9/5)+32;
	System.out.println(celsius + "°C in Fahrenheit is " + result + "°F");

    }
}
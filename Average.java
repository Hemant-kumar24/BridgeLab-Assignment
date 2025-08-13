import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1=sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2=sc.nextInt();
	System.out.print("Enter Third Number: ");
        int num3=sc.nextInt();
        int  result = (num1+num2+num3)/3;
        System.out.println("Average of Three Numbers "+num1 +", "+num2+", "+num3 +" is :"+ result);
    }
}
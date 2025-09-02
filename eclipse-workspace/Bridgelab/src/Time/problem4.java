package Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

   
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

     
        System.out.print("Enter the first date (dd-MM-yyyy): ");
        String date1Input = sc.nextLine();
        LocalDate date1 = LocalDate.parse(date1Input, formatter);

        System.out.print("Enter the second date (dd-MM-yyyy): ");
        String date2Input = sc.nextLine();
        LocalDate date2 = LocalDate.parse(date2Input, formatter);

        if (date1.isBefore(date2)) {
            System.out.println(date1.format(formatter) + " is BEFORE " + date2.format(formatter));
        } else if (date1.isAfter(date2)) {
            System.out.println(date1.format(formatter) + " is AFTER " + date2.format(formatter));
        } else if (date1.isEqual(date2)) {
            System.out.println(date1.format(formatter) + " is EQUAL to " + date2.format(formatter));
        }
    }
}


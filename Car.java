package constructor;

public class Car {
	private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Default constructor
    public Car() {
        this.customerName = "Unknown";
        this.carModel = "Not Assigned";
        this.rentalDays = 0;
        this.dailyRate = 0.0;
    }

    // Parameterized constructor
    public Car(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    // Copy constructor
    public Car(Car other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
        this.dailyRate = other.dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
    public void displayDetails() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + dailyRate);
        System.out.println("Total Cost: $" + calculateTotalCost());
        System.out.println("-----------------------------");
    }


    public static void main(String[] args) {
        Car rental1 = new Car("Hemant Kumar", "Toyota Fortuner", 5, 2500.0);
        rental1.displayDetails();

        
        Car rental2 = new Car(rental1);
        rental2.displayDetails();

        
        Car rental3 = new Car();
        rental3.displayDetails();
    }
}

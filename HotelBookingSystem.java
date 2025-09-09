package constructor;

public class HotelBookingSystem {
	private String guestName;
    private String roomType;
    private int nights;
    // Default constructor
    public HotelBookingSystem() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }
    // Parameterized constructor
    public HotelBookingSystem(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }
    // Copy constructor
    public HotelBookingSystem(HotelBookingSystem other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }
    //for display data 
    public void displayBooking() {
        System.out.println("Guest: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("----------------------------");
    }
    public static void main(String[] args) {
       
        HotelBookingSystem booking1 = new HotelBookingSystem();
        System.out.println("Default constructor booking ->");
        booking1.displayBooking();
        
        HotelBookingSystem booking2 = new HotelBookingSystem("Hemant Kumar", "Deluxe", 3);
        System.out.println("Parameterized constructor booking ->");
        booking2.displayBooking();
        
        HotelBookingSystem booking3 = new HotelBookingSystem(booking2);
        System.out.println("Copy constructor booking ->");
        booking3.displayBooking();
    }
}

package constructor;

public class Circle {
	  private double radius;

	    public Circle() {
	        this(1.0);	 
	        }
	    public Circle(double radius) {
	        if (radius > 0) {
	            this.radius = radius;
	        } else {
	            this.radius = 1.0; 
	        }
	    }
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	    public double getCircumference() {
	        return 2 * Math.PI * radius;
	    }
	    public void display() {
	        System.out.println("Radius: " + radius);
	        System.out.println("Area: " + getArea());
	        System.out.println("Circumference: " + getCircumference());
	        System.out.println("-----------------------------");
	    }

	    public static void main(String[] args) {
	        Circle c1 = new Circle(); 
	        System.out.println("Default constructor ->");
	        c1.display();

	        Circle c2 = new Circle(5.5);
	        System.out.println("Parameterized constructor ->");
	        c2.display();
	    }
}

package constructor;

public class Person {
	private String name;
    private int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Hemant", 22);  
        System.out.print("Original Person -> ");
        p1.display();

        Person p2 = new Person(p1); 
        System.out.print("Copied Person -> ");
        p2.display();
    }
}

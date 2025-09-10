package OOPs;

public class Employee {
	static String companyName="HemantXYZCompany";
	static int totalEmployees=0;
	String name;
	final int id; // Final variable to ensure the employee ID cannot be modified
	String designation;
	
	public Employee(String name,int id,String designation) {
		this.name=name;
		this.id=id;
		this.designation=designation;
		totalEmployees++;
		
	}
	public static void displayTotalEmployees() {
	       System.out.println("Total Employees: " + totalEmployees);
	   }
	
	 public void displayEmployeeDetails() {

	       if (this instanceof Employee) {
	           System.out.println("Company Name: " + companyName);
	           System.out.println("Employee ID: " + id);
	           System.out.println("Name: " + name);
	           System.out.println("Designation: " + designation);
	       } else {
	           System.out.println("The object is not an instance of the Employee class.");
	       }
	       System.out.println("_______________________________________");
	 }
	 public static void main(String[] args) {
		 System.out.println(Employee.companyName);
		 Employee employee1=new Employee("Hemant",1,"Frontend Engineer");
		 employee1.displayEmployeeDetails();
	 }


}

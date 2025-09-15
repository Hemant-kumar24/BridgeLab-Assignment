package OOps;

public class  {
    static class Student{
        static String univname = "GLA";
        static int totalstudents;
        String name;
        final int roll;
        String grade;

        Student(String name , int roll,String grade){
            this.name=name;
            this.roll=roll;
            this.grade=grade;
            totalstudents++;
        }
        void getstudent(){
            System.out.println("student name is "+this.name);
            
        }
        void totalstudent(){
            System.out.println(totalstudents);
        }


        
    }
    public static void main(String[] args) {
        Student s1 = new Student("Hemant", 31, "O");
        s1.getstudent();
         s1.totalstudent();
        Student s2 = new Student("AKash", 6, "O");
        s2.getstudent();
         s1.totalstudent();
        
        
        
       
        
    }
    
}

import java.util.Scanner;

class Person{
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
       return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String toString() {
        return "Person[" 
                + "name=" + this.name 
                + ", address=" + this.address 
                + "]";
    }
}

class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address); 
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return this.fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString() {
        return "Student["
                + "name=" + getName()
                + ", address=" + getAddress()
                + ", program=" + this.program
                + ", year=" + this.year
                + ", fee=" + this.fee
                + "]";
    }
}

class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address); 
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return this.school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return this.pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return "Staff["
                + "name=" + getName()
                + ", address=" + getAddress()
                + ", school=" + this.school
                + ", pay=" + this.pay
                + "]";
    }
}

public class SchoolBusinessTest {
    public static void main(String[] args) {
        
        Student[] students = new Student[5];
        students[0] = new Student("Student A", "Address A", "Program A", 2023, 1000);
        students[1] = new Student("Student B", "Address B", "Program A", 2023, 1000);
        students[2] = new Student("Student C", "Address C", "Program B", 2023, 1500);
        students[3] = new Student("Student D", "Address D", "Program B", 2023, 1500);
        students[4] = new Student("Student E", "Address E", "Program C", 2023, 2000);

        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println(students[i].toString());
        }
        System.out.println();

        Staff staff = new Staff("Staff A", "Address", "School A", 2000.0);
        staff.setAddress("New Address");

        System.out.println("Staff Information:");
        System.out.println(staff.toString());
    }
}
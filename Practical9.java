class Employee9 {
    String employeeName;
    double salary;

    static int employeeCount = 0;

 
    Employee9() {
        this("Unknown", 0);
    }


    Employee9(String employeeName, double salary) {
        this.employeeName = employeeName;
        this.salary = salary;
        employeeCount++;
    }

    void display() {
        System.out.println("Name: " + this.employeeName);
        System.out.println("Salary: " + this.salary);
        System.out.println();
    }

    static void displayEmployeeCount() {
        System.out.println("Total Employees Created: " + employeeCount);
    }
}

public class Practical9 {
    public static void main(String[] args) {

        Employee9 e1 = new Employee9();
        Employee9 e2 = new Employee9("Vidhi", 50000);
        Employee9 e3 = new Employee9("Rahul", 45000);

        e1.display();
        e2.display();
        e3.display();

        Employee9.displayEmployeeCount();
    }
}
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}


class Employee {
    double calculatePay() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double calculatePay() {
        return 50000;
    }
}

class PartTimeEmployee extends Employee {
    double calculatePay() {
        return 20000;
    }
}

public class Practical4 {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Sum of 2 integers: " + calculator.add(10, 20));
        System.out.println("Sum of 3 integers: " + calculator.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + calculator.add(10.5, 20.5));

        System.out.println();

        Employee employee;

        employee = new FullTimeEmployee();
        System.out.println("Full-Time Pay: " + employee.calculatePay());

        employee = new PartTimeEmployee();
        System.out.println("Part-Time Pay: " + employee.calculatePay());
    }
}
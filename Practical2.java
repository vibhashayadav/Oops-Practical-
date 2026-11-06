// Single Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Person {
    String name = "Vidhi";

    void showPerson() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int employeeId = 101;

    void showEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println("Manager is managing the team.");
    }
}


class Shape {
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class Practical2 {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Car car = new Car();
        car.start();
        car.drive();

        System.out.println("\nMultilevel Inheritance:");
        Manager manager = new Manager();
        manager.showPerson();
        manager.showEmployee();
        manager.manage();

        System.out.println("\nHierarchical Inheritance:");
        Circle circle = new Circle();
        circle.display();
        circle.drawCircle();

        Rectangle rectangle = new Rectangle();
        rectangle.display();
        rectangle.drawRectangle();
    }
}
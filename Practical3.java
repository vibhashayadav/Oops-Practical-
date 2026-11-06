interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

// Multiple inheritance through interfaces
class AllInOnePrinter implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}

// Base class
class Machine {
    void powerOn() {
        System.out.println("Machine is powered on.");
    }
}

// Hybrid structure
class SmartPrinter extends Machine implements Printable, Scannable {
    public void print() {
        System.out.println("Smart Printer is printing.");
    }

    public void scan() {
        System.out.println("Smart Printer is scanning.");
    }
}

public class Practical3 {
    public static void main(String[] args) {
        AllInOnePrinter printer = new AllInOnePrinter();
        printer.print();
        printer.scan();

        System.out.println();

        SmartPrinter smartPrinter = new SmartPrinter();
        smartPrinter.powerOn();
        smartPrinter.print();
        smartPrinter.scan();
    }
}
class ComplexNumber {
    int real;
    int imaginary;

    ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(
            this.real + other.real,
            this.imaginary + other.imaginary
        );
    }

    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class Practical5 {
    public static void main(String[] args) {

        ComplexNumber c1 = new ComplexNumber(4, 3);
        ComplexNumber c2 = new ComplexNumber(2, 5);

        ComplexNumber result = c1.add(c2);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        System.out.print("Sum: ");
        result.display();
    }
}
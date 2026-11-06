class Book {
    String title;
    String author;
    double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0;
    }


    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }


    Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Practical6 {
    public static void main(String[] args) {

        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "James Gosling", 500);
        Book b3 = new Book(b2);

        System.out.println("Default Constructor:");
        b1.display();

        System.out.println("Parameterized Constructor:");
        b2.display();

        System.out.println("Copy Constructor:");
        b3.display();

        b3.price = 600;

        System.out.println("After modifying copied object:");
        System.out.println("Original Book Price: " + b2.price);
        System.out.println("Copied Book Price: " + b3.price);
    }
}
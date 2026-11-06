class Product {
    String productName;
    double price;
    int quantity;

    Product() {
        productName = "Unknown";
        price = 0;
        quantity = 0;
    }

    Product(String productName) {
        this.productName = productName;
        this.price = 0;
        this.quantity = 0;
    }

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.quantity = 1;
    }

    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    double calculateTotalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println();
    }
}

public class Practical8 {
    public static void main(String[] args) {

        Product p1 = new Product();
        Product p2 = new Product("Laptop");
        Product p3 = new Product("Mobile", 25000);
        Product p4 = new Product("Headphones", 2000, 2);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
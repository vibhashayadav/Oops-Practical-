class Student {
    int rollNo;
    String name;
    double subject1, subject2, subject3;

    Student(int rollNo, String name, double subject1,
            double subject2, double subject3) {
        this.rollNo = rollNo;
        this.name = name;
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }


    double calculateTotal() {
        return subject1 + subject2 + subject3;
    }


    double calculatePercentage() {
        return calculateTotal() / 3;
    }

   
    void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage() + "%");
        System.out.println();
    }
}

public class Practical1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Vidhi", 85, 90, 88);
        Student s2 = new Student(2, "Rahul", 78, 82, 80);
        Student s3 = new Student(3, "Priya", 92, 89, 95);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
class Demo {
    Demo() {
        System.out.println("Object is created.");
    }

    void useObject() {
        System.out.println("Object is being used.");
    }
}

public class Practical7 {
    public static void main(String[] args) {

        Demo obj = new Demo();
        obj.useObject();

        obj = null;

        System.gc();

        System.out.println("Garbage collection requested.");
        System.out.println("Program continues execution.");
    }
}
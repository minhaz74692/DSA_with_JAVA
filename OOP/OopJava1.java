public class OopJava1 {
    int x = 5;

    public static void main(String[] args) {
        System.out.println(new OopJava1().x);
    }

    // void class method
     void printName() {
        System.out.println("Hello this is Number: " + new OopJava1().x);
    }
    
    // Static class method
    static void staticMethod() {
        System.out.println("Hello this is static method");
    }

    // public class method
    public void publicMehtod() {
        System.out.println("Hello this is Public method");
    }

    public class staticMethod {
    }
}

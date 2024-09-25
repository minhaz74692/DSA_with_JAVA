public class OopJava2 {
    public static void main(String[] args) {
        OopJava1 ins = new OopJava1();

        ins.x = 100;

        System.out.println(ins.x);

        // Void Method
        ins.printName();

        // Static Method
        OopJava1.staticMethod();

        // Public Method
        ins.publicMehtod();


        // Practice Constructor class

        ConstructorClass person1 = new ConstructorClass("Minhazul Islam", 27);
        ConstructorClass person2 = new ConstructorClass("Monirul Islam", 30);

        person1.printDescription();
        person2.printDescription();
    }
}

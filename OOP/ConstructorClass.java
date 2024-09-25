public class ConstructorClass {
    String name;
    int age;

    public ConstructorClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ConstructorClass ins = new ConstructorClass("Minhazul Islam", 27);
        System.out.println(ins.name);
        System.out.println(ins.age);
    }

    void printDescription() {
        System.out.println("My name is : " + this.name + ", amd my age is : " + this.age);
    }
}

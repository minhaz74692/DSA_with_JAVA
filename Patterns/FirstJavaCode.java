import java.util.*;
public class FirstJavaCode {
  public static void main(String[] args) {
    double duePayment = 12.22;
    float flNum = 12;
    System.out.println(duePayment);
    System.out.println(flNum);

    try (Scanner sc = new Scanner(System.in)) {
      // String name = sc.next(); // First Word
      int a = sc.nextInt();
      int b = sc.nextInt();
      System.out.println(a + b);
    }

    System.out.println("dsfa");
    System.out.println("dsjflk");
  }
}
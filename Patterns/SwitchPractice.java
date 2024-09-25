import java.util.Scanner;

public class SwitchPractice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("This is button 1");
                break;
            case 2:
                System.out.println("This is button 1");
                break;
            case 3:
                System.out.println("This is button 1");
                break;
            case 4:
                System.out.println("This is button 1");
                break;
        
            default:
                System.out.println("This is default button");
                break;
        }
    }
}

import java.util.Scanner;
public class LeftRightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter your choice (0 for left shift, 1 for right shift): ");
        int choice = sc.nextInt();
        System.out.print("Enter how many positions to shift: ");
        int shift = sc.nextInt();

        if (choice == 0) {
            System.out.println("Left shift: " + (n << shift));
        } else {
            System.out.println("Right shift: " + (n >> shift));
        }

        sc.close();
    }
}

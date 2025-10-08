import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int num = sc.nextInt();
        int b = 1;
        do{
            System.out.println(num + " x " +b+ " = " +(num * b));
            b++;
        }
        while(b<=10);
        sc.close();
    }
}

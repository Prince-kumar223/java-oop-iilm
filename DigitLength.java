import java.util.Scanner;

public class DigitLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int n = sc.nextInt();
        int  c = 0;
        while(n!=0){
            n =n/10;
            c++;
        }
        System.out.println("length of number "+c);
    }
}

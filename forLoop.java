import java.util.Scanner;
public class forLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :-");
        int n = sc.nextInt();
        for (int i = 1 ; i<=n ; i++){
            System.out.println(2*i);
        }
    }
}

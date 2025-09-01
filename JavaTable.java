import java.util.Scanner;

public class JavaTable {
        public static void main(String[] args) {
            int n, i = 1;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number :- ");
            n = sc.nextInt();
            while (i <= 10) {
                if (i % 2 == 1)
                    System.out.println(i);
                i++;
            }

        }
    }



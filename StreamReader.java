import java.io.* ;
class demo
{
    public static void main(String[] args) {
        InputStreamReader in = new InputStreamReader (System.in);

        BufferedReader br = new BufferedReader(in);
        try {
            int a, b, c;
            System.out.println("Enter 1st number");
            a = Integer.parseInt(br.readLine());
            System.out.println("Enter 2nd number");
            b = Integer.parseInt(br.readLine());
            c = a + b;
            System.out.println("Sum = " + c);
        } catch (Exception e) {
        }
    }
}

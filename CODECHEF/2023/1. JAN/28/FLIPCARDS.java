import java.util.Scanner;

public class FLIPCARDS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n, x;
            n = sc.nextInt();
            x = sc.nextInt();

            if (x < 0 || x > n || n < 2 || n > 100)
                System.out.println(0);
            if (n - x >= x)
                System.out.println(x);
            else
                System.out.println(n - x);
        }
        sc.close();
    }
}

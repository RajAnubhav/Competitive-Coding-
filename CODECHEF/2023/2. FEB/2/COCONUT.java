import java.util.Scanner;

public class COCONUT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, xa, xb;
            a = sc.nextInt();
            b = sc.nextInt();
            xa = sc.nextInt();
            xb = sc.nextInt();
            System.out.println(xa/a + xb/b);
        }
        sc.close();
    }
}

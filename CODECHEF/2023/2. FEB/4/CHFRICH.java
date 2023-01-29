import java.util.Scanner;

public class CHFRICH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, x;
            a = sc.nextInt();
            b = sc.nextInt();
            x = sc.nextInt();
            System.out.println((int)(Math.abs(a-b)/x));
        }
        sc.close();
    }
}

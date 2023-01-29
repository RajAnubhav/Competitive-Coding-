import java.util.Scanner;
public class BLACKJACK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            if((21-(a+b))<=10)
                System.out.println(21-(a+b));
            else
                System.out.println(-1);
        }
        sc.close();
    }
}

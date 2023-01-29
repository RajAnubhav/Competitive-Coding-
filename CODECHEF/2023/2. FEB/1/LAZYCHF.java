import java.util.Scanner;

public class LAZYCHF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, m, d;
            x = sc.nextInt();
            m = sc.nextInt();
            d = sc.nextInt();
            System.out.println(Math.min((x*m),(x+d)));
        }
        sc.close();
    }
}

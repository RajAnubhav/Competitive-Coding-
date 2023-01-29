import java.util.*;

public class SPEEDTEST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, x, b, y;
            a = sc.nextInt();
            x = sc.nextInt();
            b = sc.nextInt();
            y = sc.nextInt();
            if((a/x)>(b/y))
                System.out.println("ALICE");
            else if((a/x)<(b/y))
                System.out.println("BOB");
            else
                System.out.println("EQUAL");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class CCISLAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, xr, yr, d;
            x = sc.nextInt();
            y = sc.nextInt();
            xr = sc.nextInt();
            yr = sc.nextInt();
            d = sc.nextInt();
            if(d<=(Math.min((x/xr), (y/yr))))
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
        sc.close();
    }
}

import java.util.Scanner;

public class CARRYGOLD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n, x, y;
            n = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            if((n+1)*y>=x)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}

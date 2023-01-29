import java.util.Scanner;
public class CRICUP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, y, d;
            x = sc.nextInt();
            y = sc.nextInt();
            d = sc.nextInt();
            if(Math.abs(x-y)<=d)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}

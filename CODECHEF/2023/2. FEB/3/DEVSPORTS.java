import java.util.Scanner;

public class DEVSPORTS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int z, y, a, b, c;
            z = sc.nextInt();
            y = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(Math.abs(z-y)>=(a+b+c))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}

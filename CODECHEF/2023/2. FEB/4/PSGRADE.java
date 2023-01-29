import java.util.Scanner;

public class PSGRADE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int ap, bp, cp, tp, a, b, c;
            ap = sc.nextInt();
            bp = sc.nextInt();
            cp = sc.nextInt();
            tp = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(ap<=a && bp<=b && cp<=c && (a+b+c)>=tp)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}

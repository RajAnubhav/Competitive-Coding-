import java.util.Scanner;
public class MAXTASTE {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, c, d;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            int t1 = a>b?a:b;
            int t2 = c>d?c:d;
            System.out.println(t1+t2);
        }
        sc.close();
    }
}

import java.util.Scanner;
public class QUALIFY {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int x, a, b;
            x = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            if((a+2*b)>=x)
                System.out.println("QUALIFY");
            else
                System.out.println("NOTQUALIFY");
        }
        sc.close();
    }
}

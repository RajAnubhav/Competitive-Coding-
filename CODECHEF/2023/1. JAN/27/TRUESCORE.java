import java.util.Scanner;
public class TRUESCORE {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b, c, d;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            if(c>=a && d>=b)
                System.out.println("POSSIBLE");
            else    
                System.out.println("IMPOSSIBLE");
        }
        sc.close();
    }
}

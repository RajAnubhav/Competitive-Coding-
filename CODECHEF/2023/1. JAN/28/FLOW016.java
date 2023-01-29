import java.util.Scanner;
public class FLOW016 {

    static int gcd(int a, int b){
        if(a==0)
            return b;
        return gcd(b%a, a);
    }

    static int lcm(int a, int b){
        return (a/gcd(a, b))*b;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(gcd(a, b) +" "+ lcm(a, b));
        }
        sc.close();
    }
}

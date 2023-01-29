import java.util.Scanner;
public class FLOW016 {

    static long gcd(Long a, long b){
        if(a==0)
            return b;
        return gcd(b%a, a);
    }

    static long lcm(long a, long b){
        return (a/gcd(a, b))*b;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        while(t-->0){
            long a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(gcd(a, b) +" "+ lcm(a, b));
        }
        sc.close();
    }
}

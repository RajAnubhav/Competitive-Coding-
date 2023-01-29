import java.util.Scanner;
public class PRIMEDICE {
    static boolean checkPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a, b;
            a = sc.nextInt();
            b = sc.nextInt();
            boolean tm = checkPrime(a+b);
            if(tm)
                System.out.println("ALICE");
            else
                System.out.println("BOB");
        }
        sc.close();
    }
}

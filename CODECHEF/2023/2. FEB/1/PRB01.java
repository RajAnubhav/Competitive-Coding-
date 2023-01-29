import java.util.Scanner;

public class PRB01 {

    static boolean isPrime(int n){
        for(int i=2; i<n; i++)
        if(n%i ==0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean res = isPrime(n);
            if(res)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }
}

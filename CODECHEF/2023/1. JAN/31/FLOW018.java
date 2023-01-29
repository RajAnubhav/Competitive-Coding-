import java.util.Scanner;

public class FLOW018 {

    static int fact(int n){
        if(n==1 || n==0)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int fact = fact(n);
            System.out.println(fact);
        }
        sc.close();
    }
}

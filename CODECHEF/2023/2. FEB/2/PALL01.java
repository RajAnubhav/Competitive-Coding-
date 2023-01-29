import java.util.Scanner;

public class PALL01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int org = n;
            int res = 0;
            while(n!=0){
                int rem = n%10;
                res = res*10+rem;
                n/=10;
            }
            if(res == org)
                System.out.println("WINS");
            else 
                System.out.println("LOSES");
        }
        sc.close();
    }
}
